package com.prs.bean;

import com.ecarx.ai.grammar.datatype.ErrorItem;
import com.ecarx.ai.grammar.parser.SenseFileParser;
import com.ecarx.ai.grammar.parser.SenseLexer;
import com.ecarx.ai.grammar.parser.SenseParser;
import com.ecarx.ai.grammar.project.BaseSenseFile;
import com.ecarx.ai.gscript.CodeManager;
import com.ecarx.ai.util.processor.ITextProcessor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class SenseFile extends BaseSenseFile {

    public SenseFile(String name) {
        setName(name);
        setLexerErrorListener(name);
        setParserErrorListener(name);
    }

    /**
     *
     * @param reader
     * @param sourceName
     * @param fileIndex 在一个语法项目中，每个文件给予一个从0开始的唯一编号
     * @param scriptNameGenerator
     * @param language
     * @return
     * @throws IOException
     */
    public static SenseFile parse(Reader reader, String sourceName, int fileIndex, boolean debugMode, Supplier<String> scriptNameGenerator, Function<String, String> clauseNameGenerator, CodeManager gscriptManager, String language, ITextProcessor processor) throws IOException {
        if (language != null && "cantonese".equalsIgnoreCase(language)) {
            String data = convertReaderToString(reader);
            SenseLexer lexer = new SenseLexer(new ANTLRInputStream(processor.processText(data)));
            return parse(lexer, sourceName, fileIndex, debugMode, scriptNameGenerator, clauseNameGenerator, gscriptManager);
        } else {
            SenseLexer lexer = new SenseLexer(new ANTLRInputStream(reader));
            return parse(lexer, sourceName, fileIndex, debugMode, scriptNameGenerator, clauseNameGenerator, gscriptManager);
        }
    }

    /**
     *
     * @param reader
     * @param sourceName
     * @param fileIndex 在一个语法项目中，每个文件给予一个从0开始的唯一编号
     * @param scriptNameGenerator
     * @param clauseNameGenerator 自动产生匿名clause的名称
     * @return
     * @throws IOException
     */
    public static SenseFile parse(Reader reader, String sourceName, int fileIndex, boolean debugMode, Supplier<String> scriptNameGenerator, Function<String, String> clauseNameGenerator, CodeManager gscriptManager) throws IOException {
        // antlr 4.7 shall use CharStream
        //SenseLexer lexer = new SenseLexer(CharStreams.fromReader(reader, sourceName));

        // antlr 4.6 use ANTLRInputStream, but in 4.7 it is deprecated
        SenseLexer lexer = new SenseLexer(new ANTLRInputStream(reader));
        return parse(lexer, sourceName, fileIndex, debugMode, scriptNameGenerator, clauseNameGenerator, gscriptManager);
    }

    public static SenseFile parse(SenseLexer lexer, String sourceName, int fileIndex, boolean debugMode, Supplier<String> scriptNameGenerator, Function<String, String> clauseNameGenerator, CodeManager gscriptManager) throws IOException {

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SenseParser parser = new SenseParser(tokenStream);

        SenseFileParser fileParser = new SenseFileParser(sourceName, fileIndex, debugMode, scriptNameGenerator, clauseNameGenerator, gscriptManager);

        SenseFile senseFile = fileParser.getSenseFile();

        lexer.removeErrorListeners();
        lexer.addErrorListener(senseFile.getLexerErrorListener());

        parser.removeErrorListeners();
        parser.addErrorListener(senseFile.getParserErrorListener());

        if(senseFile.countErrors() == 0 && senseFile.countWarnings() == 0) {
            ParseTree tree = parser.sense();
            ParseTreeWalker walker = new ParseTreeWalker();

            if(senseFile.errorCount() == 0) {
                walker.walk(fileParser, tree);
            }
        }

        return senseFile;
    }

    public ErrorItem[] errors(boolean syntaxOnly) {
        List<ErrorItem> result = new ArrayList<>(errorCount());
        result.addAll(getLexerErrorListener().get(syntaxOnly));
        result.addAll(getParserErrorListener().get(syntaxOnly));

        if(result.size() > 0) {
            result.sort((o1, o2) -> {
                if(o1.getRow() < o2.getRow()) return -1;
                if(o1.getRow() > o2.getRow()) return 1;

                if(o1.getCol() < o2.getCol()) return -1;
                if(o1.getCol() > o2.getCol()) return 1;

                if(o1.getType() < o2.getType()) return -1;
                if(o1.getType() > o2.getType()) return 1;

                return 0;
            });
        }
        return result.toArray(new ErrorItem[result.size()]);
    }

}
