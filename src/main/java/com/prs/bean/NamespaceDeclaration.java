package com.prs.bean;

import com.ecarx.ai.grammar.mongo.MongoSense;
import com.ecarx.ai.grammar.parser.ErrorGenerator;
import com.ecarx.ai.grammar.parser.ErrorMessage;
import com.ecarx.ai.grammar.project.BaseSenseFile;
import com.ecarx.ai.grammar.structure.*;

import java.util.*;
import java.util.stream.Collectors;

public class NamespaceDeclaration {
    private String namespaceName;
    private List<BaseSenseFile> fileList = new ArrayList<>();
    private Map<String, Declaration> idMap = new HashMap<>();
    private Map<String, ScriptFunction> scriptFunctionMap = new HashMap<>();

    //发生了多少次命名冲突
    private int nameConflictCount = 0;

    public NamespaceDeclaration(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public List<BaseSenseFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<BaseSenseFile> fileList) {
        this.fileList = fileList;
    }

    public Map<String, Declaration> getIdMap() {
        return idMap;
    }

    public void addSenseFile(BaseSenseFile file) {
        fileList.add(file);

        Arrays.stream(file.getMacroDeclarations()).forEach(this::putDeclaration);
        Arrays.stream(file.getPrimeDeclarations()).forEach(this::putDeclaration);
        Arrays.stream(file.getProductionDeclarations()).forEach(this::putDeclaration);
        Arrays.stream(file.getScriptFunctions()).forEach(this::putScriptFunction);
    }

    public boolean hasDeclaration(String name) {
        return idMap.containsKey(name);
    }

    public int getNameConflictCount() {
        return nameConflictCount;
    }

    public Set<String> getNameSet(boolean withInternal) {
        if(withInternal)
            return idMap.keySet();

        return idMap.values().stream().filter(Declaration::isPublic).map(Declaration::getName).collect(Collectors.toSet());
    }

    private void putDeclaration(Declaration declaration)
    {
        Declaration d = idMap.get(declaration.getName());

        if(d != null) {
            nameConflictCount++;
            if (declaration.getFile() instanceof SenseFile) {
                reportNameConflict(d, declaration);
            } else if (declaration.getFile() instanceof MongoSense) {
                reportMongoNameConflict(d, declaration);
            }
        } else {
            idMap.put(declaration.getName(), declaration);
        }
    }

    private void putScriptFunction(ScriptFunction func)
    {
        ScriptFunction f = scriptFunctionMap.get(func.getName());

        if(f != null) {
            nameConflictCount++;
            if (f.getFile() instanceof SenseFile) {
                reportNameConflict(f, func);
            } else if (f.getFile() instanceof MongoSense) {
                reportMongoNameConflict(f, func);
            }
        } else {
            scriptFunctionMap.put(func.getName(), func);
        }
    }

    private void reportNameConflict(Declaration oldDeclaration, Declaration newDeclaration)
    {
        ErrorGenerator.generateError(newDeclaration.getFile(),
                newDeclaration.getNameToken(),
                ErrorMessage.ERR_DECLARE_NAME_CONFLICT,
                newDeclaration.getNameToken().getText(),
                oldDeclaration.getFile().getName(),
                oldDeclaration.getNameToken().getLine(),
                oldDeclaration.getNameToken().getCharPositionInLine() + 1);
    }

    private void reportMongoNameConflict(Declaration oldDeclaration, Declaration newDeclaration)
    {
        ErrorGenerator.generateError(newDeclaration.getFile(),
                0,
                ErrorMessage.ERR_MONGO_DECLARE_NAME_CONFLICT,
                newDeclaration.getName(),
                oldDeclaration.getFile().getName());
    }

    private void reportNameConflict(ScriptFunction oldFunc, ScriptFunction newFunc)
    {
        ErrorGenerator.generateError(newFunc.getFile(),
                newFunc.getNameToken(),
                ErrorMessage.ERR_SCRIPT_NAME_CONFLICT,
                newFunc.getNameToken().getText(),
                oldFunc.getFile().getName(),
                oldFunc.getNameToken().getLine(),
                oldFunc.getNameToken().getCharPositionInLine() + 1);
    }

    private void reportMongoNameConflict(ScriptFunction oldFunc, ScriptFunction newFunc)
    {
        ErrorGenerator.generateError(newFunc.getFile(),
                0,
                ErrorMessage.ERR_MONGO_SCRIPT_NAME_CONFLICT,
                newFunc.getName(),
                oldFunc.getFile().getName());
    }

    public Declaration getDeclaration(String name) {
        return idMap.get(name);
    }

    public Namespace toNamespaceStructure() {
        Namespace n = new Namespace();
        n.setName(getNamespaceName());

        n.setMacros(idMap.values()
                .stream()
                .filter(MacroDeclaration.class::isInstance)
                .map(d -> ((MacroDeclaration)d).toMacroStructure())
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Macro::getQualifiedName))
                .toArray(Macro[]::new));

        n.setPrimes(idMap.values()
                .stream()
                .filter(PrimeDeclaration.class::isInstance)
                .map(d -> ((PrimeDeclaration)d).toPrimeStructure())
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Prime::getQualifiedName))
                .toArray(Prime[]::new));

        n.setClauses(idMap.values()
                .stream()
                .filter(ProductionDeclaration.class::isInstance)
                .map(d -> ((ProductionDeclaration)d).toClauseSructure())
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Clause::getQualifiedName))
                .toArray(Clause[]::new));

        n.setStatements(idMap.values()
                .stream()
                .filter(ProductionDeclaration.class::isInstance)
                .map(d -> ((ProductionDeclaration)d).toStatementStructure())
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Statement::getQualifiedName))
                .toArray(Statement[]::new));

        n.setScriptFunctions(scriptFunctionMap.values()
                .stream()
                .map(s -> s.toScriptStructure())
                .filter(Objects::nonNull)
                .toArray(com.ecarx.ai.grammar.structure.ScriptFunction[]::new)
        );

        return n;
    }
}
