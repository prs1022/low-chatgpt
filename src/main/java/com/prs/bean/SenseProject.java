package com.prs.bean;

import com.ecarx.ai.grammar.datatype.ErrorItem;
import com.ecarx.ai.grammar.meta.QualifiedName;
import com.ecarx.ai.grammar.parser.ErrorGenerator;
import com.ecarx.ai.grammar.parser.ErrorMessage;
import com.ecarx.ai.grammar.parser.SenseParser;
import com.ecarx.ai.grammar.project.ISenseFileProvider;
import com.ecarx.ai.grammar.structure.*;
import com.ecarx.ai.grammar.structure.expr.*;
import com.ecarx.ai.grammar.structure.visitor.MacroExpandedNodeVisitor;
import com.ecarx.ai.grammar.structure.visitor.NodeVisitor;
import com.ecarx.ai.gscript.CodeManager;
import com.ecarx.ai.util.processor.GrammarRuleBasedTextProcessor;
import com.ecarx.ai.util.processor.ITextProcessor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Supplier;

public class SenseProject implements IStructureLoader {
    public interface Listener {
        void start(int count);

        void end(Map<String, ErrorItem[]> errors);

        void startFile(int index, File file);

        void endFile(int index, File file, SenseFile senseFile);
    }

    private boolean debugMode = false;
    private ISenseFileProvider fileProvider;
    private List<Listener> listeners = new LinkedList<>();

    private List<SenseFile> senseFiles = new ArrayList<>();
    private Map<String, NamespaceDeclaration> namespaceMap;


    // 用于记录编译的语法对应的语言， 如果是繁体粤语，需要将繁体转换为简体再进行编译
    private String language;
    private ITextProcessor processor = new GrammarRuleBasedTextProcessor();

    public SenseProject(ISenseFileProvider fileProvider) {
        this.fileProvider = fileProvider;
    }

    public SenseProject(ISenseFileProvider fileProvider, String language) {
        this.fileProvider = fileProvider;
        this.language = language;
    }

    public void addListener(Listener listener) {
        if (listener != null)
            listeners.add(listener);
    }

    public void clearListeners() {
        listeners.clear();
    }

    public List<SenseFile> getSenseFiles() {
        return Collections.unmodifiableList(senseFiles);
    }

    @Override
    public SenseStructure load(boolean debugMode) {
        this.debugMode = debugMode;

        try (CodeManager gscriptManager = new CodeManager()) {
            load(fileProvider, gscriptManager);

            //所有namespace内部的命名都没有发生冲突时，才继续检查其他错误
            int nameConflictCount = namespaceMap.values().stream().mapToInt(NamespaceDeclaration::getNameConflictCount).sum();
            if (nameConflictCount == 0) {
                check();

                listeners.forEach(listener -> listener.end(errors()));

                if (errorCount() == 0) {
                    SenseStructure structure = new SenseStructure();
                    structure.setDebugMode(debugMode);
                    structure.setFiles(senseFiles.stream().map(SenseFile::getName).toArray(String[]::new));

                    Namespace[] namespaces = namespaceMap.values().stream().map(NamespaceDeclaration::toNamespaceStructure).toArray(Namespace[]::new);

                    //检查并设置每一个statement/clause/prime的Meta中的invokeScript标志位
                    checkInvokeScript(namespaces);

                    structure.setNamespaces(namespaces);
                    structure.setLanguage(language);
                    structure.setScriptMachineJson(gscriptManager.machineToJson());
                    structure.setScriptManagerJson(gscriptManager.toJson());

                    return structure;
                }
            } else {
                listeners.forEach(listener -> listener.end(errors()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Map<String, ErrorItem[]> errors() {
        Map<String, ErrorItem[]> errors = null;

        int countSyntaxErrors = 0;
        for (SenseFile f : senseFiles) {
            countSyntaxErrors += f.countSyntaxErrors();
        }

        for (SenseFile f : senseFiles) {
            if (f.errorCount() > 0) {
                if (errors == null)
                    errors = new HashMap<>();

                errors.put(f.getName(), f.errors(countSyntaxErrors > 0));
            }
        }

        return errors;
    }

    private int errorCount() {
        return senseFiles.stream().mapToInt(SenseFile::countErrors).sum();
    }

    private void load(ISenseFileProvider project, CodeManager gscriptManager) {
        listeners.forEach(listener -> listener.start(project.size()));

        int index = 0;

        AtomicInteger scriptNumber = new AtomicInteger(0);
        Supplier<String> scriptNameGenerator = () -> "script$" + scriptNumber.getAndIncrement();

        Map<String, Integer> anonymousClauseNameMap = new HashMap<>();
        Function<String, String> anonymousClauseNameGenerator = ns -> {
            int count = anonymousClauseNameMap.getOrDefault(ns, 0);
            count = count + 1;
            anonymousClauseNameMap.put(ns, count);

            return "##" + count;
        };

        int fileIndex = 0;

        for (File f : project) {
            SenseFile senseFile = null;

            int currentIndex = index++;
            listeners.forEach(listener -> listener.startFile(currentIndex, f));

            try (InputStream in = new FileInputStream(f);
                 Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8)) {
                senseFile = SenseFile.parse(reader, f.getAbsolutePath(), fileIndex++, debugMode, scriptNameGenerator, anonymousClauseNameGenerator, gscriptManager, language, processor);
                senseFiles.add(senseFile);
            } catch (IOException e) {
                //Can't open file
                senseFile = new SenseFile(f.getAbsolutePath());
                senseFile.getParserErrorListener().addError(0, 0, ErrorMessage.ERR_ACCESS_ERROR.getMessage());

                e.printStackTrace();
            } finally {
                if (senseFile != null) {
                    SenseFile currentFile = senseFile;
                    listeners.forEach(listener -> listener.endFile(currentIndex, f, currentFile));
                }
            }
        }

        //create namespace entities
        namespaceMap = new HashMap<>(senseFiles.size());
        senseFiles.forEach(f -> {
            String nsName = f.getNamespaceName();
            NamespaceDeclaration nsEntity = namespaceMap.get(nsName);

            if (nsEntity == null) {
                nsEntity = new NamespaceDeclaration(nsName);
                namespaceMap.put(nsName, nsEntity);
            }

            nsEntity.addSenseFile(f);
        });
    }

    private void checkInvokeScript(Namespace[] namespaces) {
        Map<QualifiedName, Macro> macroMap = new HashMap<>();
        Arrays.stream(namespaces).forEach(
                ns -> {
                    Arrays.stream(ns.getMacros()).forEach(m -> macroMap.put(m.getQualifiedName(), m));
                });

        NodeVisitor visitor = new MacroExpandedNodeVisitor(macroMap::get);
        for (Namespace ns : namespaces) {
            for (Statement s : ns.getStatements()) {
                s.getMeta().setInvokeScript(checkScripts(visitor, s.getExpression().getRootNode()));
            }

            for (Clause s : ns.getClauses()) {
                s.getMeta().setInvokeScript(checkScripts(visitor, s.getExpression().getRootNode()));
            }

            for (Prime s : ns.getPrimes()) {
                s.getMeta().setInvokeScript(checkScripts(visitor, s.getExpression().getRootNode()));
            }
        }
    }

    /**
     * 检查某个node及其子node中是否有ScriptFunctionNode
     *
     * @return
     */
    private boolean checkScripts(NodeVisitor visitor, Node node) {
        boolean[] result = new boolean[]{false};

        visitor.visit(node,
                n -> {
                    if (n instanceof ScriptFunctionNode)
                        result[0] = true;
                },
                null);

        return result[0];
    }

    private void check() {
        for (SenseFile f : senseFiles) {
            for (ImportDeclaration x : f.getImports()) {
                NamespaceDeclaration ns = namespaceMap.get(x.getNamespaceName());

                //1.检查importd的namespace是否存在  [done]
                if (ns == null) {
                    ErrorGenerator.generateError(f, ((SenseParser.ImportSentenceContext) x.getContext()).namespace(), ErrorMessage.ERR_NS_NOT_EXISTS, x.getNamespaceName());
                } else if (x.getNames() != null) {
                    if (Objects.equals(ns.getNamespaceName(), f.getNamespaceName())) {
                        //导入自身namespace的错误已在文件解析时检查过，此处跳过
                        continue;
                    }

                    for (TerminalNode id : ((SenseParser.ImportSentenceContext) x.getContext()).ID()) {
                        //2.检查导入的实体(prime, macro or clause)是否存在
                        String name = id.getText();
                        Declaration d = ns.getDeclaration(name);

                        if (d == null) {
                            ErrorGenerator.generateError(f, id, ErrorMessage.ERR_NAME_NOT_EXISTS, name, x.getNamespaceName());
                        } else {
                            if (d instanceof ProductionDeclaration) {
                                //3.statement不可导入
                                if (((ProductionDeclaration) d).isStatement()) {
                                    ErrorGenerator.generateError(f,
                                            id,
                                            ErrorMessage.ERR_IMPORT_STATEMENT,
                                            name,
                                            d.getFile().getName(),
                                            d.getNameToken().getLine(),
                                            d.getNameToken().getCharPositionInLine() + 1
                                    );
                                }
                            } else if (d.isInternal()) {
                                //4.包含@internal标注的clause不可导入
                                ErrorGenerator.generateError(f,
                                        id,
                                        ErrorMessage.ERR_IMPORT_INTERNAL,
                                        name,
                                        d.getFile().getName(),
                                        d.getNameToken().getLine(),
                                        d.getNameToken().getCharPositionInLine() + 1
                                );
                            }
                        }
                    }
                }
            }

            //检查导入的namsapce之间的名字冲突
            check(f, Arrays.stream(f.getFullImportNamespaces()).map(namespaceMap::get).filter(Objects::nonNull).toArray(NamespaceDeclaration[]::new));

            //5.检查所有的引用对象(prime, macro, clause)是否存在
            TargetReference[] references = f.getReferences();

            for (TargetReference ref : references) {
                String targetName = ref.getNameNode().getText();

                if (ref.getNamespaceNode() != null) {
                    String nsName = ref.getNamespaceNode().getText();

                    NamespaceDeclaration ns = namespaceMap.get(nsName);

                    if (ns != null) {
                        Declaration d = resolve(nsName, targetName, true);

                        if (d == null) {
                            //引用对象不存在
                            ErrorGenerator.generateError(f, ref.getNameNode(), ErrorMessage.ERR_UNRESOLVED_NAME, targetName);
                        } else {
                            //引用对象存在，检查其可访问性及类型
                            check(ref, d, Objects.equals(nsName, f.getNamespaceName()), f);
                        }
                    } else {
                        ErrorGenerator.generateError(f, ref.getNamespaceNode(), ErrorMessage.ERR_NS_NOT_EXISTS, nsName);
                    }
                } else {
                    //未指定命名空间，使用本文件命名空间查找
                    NamespaceDeclaration ns = namespaceMap.get(f.getNamespaceName());

                    if (ns != null) {  //必然不为空
                        Declaration d = ns.getDeclaration(targetName);

                        if (d != null) {
                            //引用对象存在，检查其可访问性及类型
                            check(ref, d, true, f);
                        }
                    }

                    Declaration resolvedTarget = ref.getResolvedTarget();

                    //如果未找到，检查被引用对象是否被显式导入 (即使用 "import 命名空间 :: 对象" 语法导入的对象 )
                    if (resolvedTarget == null) {
                        Arrays.stream(f.getExplicitImportedName(targetName))
                                .map(x -> resolve(x, true))
                                .forEach(d -> check(ref, d, false, f));
                    } else {
                        QualifiedName[] importedNames = f.getExplicitImportedName(targetName);

                        if (importedNames != null && importedNames.length > 0) {
                            ErrorGenerator.generateError(f, ref.getNameNode(), ErrorMessage.ERR_OVERRIDE_IMPORT_NAME, targetName, resolvedTarget.getFile().getName(), resolvedTarget.getNameToken().getLine(), resolvedTarget.getNameToken().getCharPositionInLine() + 1);
                        }
                    }

                    //仍未找到，检查所有全量导入的命名空间中所有非internal的对象
                    String[] nsNames = f.getFullImportNamespaces();

                    if (ref.getResolvedTarget() == null) {
                        Arrays.stream(nsNames).map(nsName -> resolve(nsName, targetName, false)).filter(Objects::nonNull).forEach(d -> check(ref, d, false, f));
                    } else {
                        Arrays.stream(nsNames).map(nsName -> resolve(nsName, targetName, false)).filter(Objects::nonNull).forEach(d -> {
                            if (d != ref.getResolvedTarget()) {
                                ErrorGenerator.generateError(f,
                                        ref.getNameNode(),
                                        ErrorMessage.ERR_OVERRIDE_IMPORT_NS,
                                        d.getQualifiedName().getNamespaceName(),
                                        targetName,
                                        ref.getResolvedTarget().getFile().getName(),
                                        ref.getResolvedTarget().getNameToken().getLine(),
                                        ref.getResolvedTarget().getNameToken().getCharPositionInLine() + 1);
                            }
                        });
                    }

                    if (ref.getResolvedTarget() == null) {
                        ErrorGenerator.generateError(f, ref.getNameNode(), ErrorMessage.ERR_UNRESOLVED_NAME, targetName);
                    }
                }

                //TODO: 如果是宏引用，需要检查参数个数是否匹配
                //TODO: 宏调用不可发生递归现象
                //TODO: prime的定义体以及其间接调用的clause里面，不允许出现prime引用(从而也禁止了prime自身递归)


                //TODO: 检查所有调用的ScriptFunction都存在
            }
        }
    }

    private Declaration resolve(QualifiedName qName, boolean includeInternal) {
        return resolve(qName.getNamespaceName(), qName.getName(), includeInternal);
    }

    private Declaration resolve(String nsName, String name, boolean includeInternal) {
        if (nsName != null && name != null) {
            NamespaceDeclaration ns = namespaceMap.get(nsName);

            if (ns != null) {
                Declaration d = ns.getDeclaration(name);

                if (d != null && (includeInternal || !d.isInternal())) {
                    return d;
                }
            }
        }
        return null;
    }

    private void check(SenseFile file, NamespaceDeclaration[] importedNamespaces) {
        //TODO: 检查本文件所在命名空间(包含internal的)，和全量导入命名空间中定义的对象之间有无命名冲突
        //TODO:检查所有全量导入的命名空间之间是否有命名冲突

    }

    private void check(TargetReference ref, Declaration declaration, boolean allowInternal, SenseFile file) {
        if (declaration == null) {
            //找不到该定义。此错误应该已经被上报过了，此处不报
            return;
        }

        if (!allowInternal && declaration.isInternal()) {
            ErrorGenerator.generateError(file,
                    ref.getNamespaceNode(),
                    ErrorMessage.ERR_IMPORT_INTERNAL,
                    ref.getNameNode().getText(),
                    declaration.getFile().getName(),
                    declaration.getNameToken().getLine(),
                    declaration.getNameToken().getCharPositionInLine() + 1
            );
        } else {
            if (!declaration.matchReferenceType(ref.getType())) {
                ErrorGenerator.generateError(file,
                        ref.getNameNode(),
                        ErrorMessage.ERR_REFERENCE_TYPE_MISMATCH,
                        declaration.getFile().getName(),
                        declaration.getNameToken().getLine(),
                        declaration.getNameToken().getCharPositionInLine() + 1);
            } else {
                if (ref.getResolvedTarget() == null) {
                    ref.setResolvedTarget(declaration);

                    //被引用对象有可能是部分命名,也就是未给出namespace部分，此时将引用名设为完整的包括namespace部分的名字
                    Node n = ref.getRefNode();
                    if (n instanceof MacroNode)
                        ((MacroNode) n).setMacroName(declaration.getQualifiedName());
                    else if (n instanceof PrimeNode)
                        ((PrimeNode) n).setPrimeName(declaration.getQualifiedName());
                    else if (n instanceof PrimeAssignNode)
                        ((PrimeAssignNode) n).setPrimeName(declaration.getQualifiedName());
                    else if (n instanceof ReferenceNode)
                        ((ReferenceNode) n).setClauseName(declaration.getQualifiedName());
                }
            }
        }
    }
}
