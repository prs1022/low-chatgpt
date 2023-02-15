package com.prs.bean;

import com.ecarx.ai.grammar.datatype.ErrorItem;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.PrintStream;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class FileErrorListener extends BaseErrorListener {
    private String name;
    private List<ErrorItem> items = new LinkedList<>();
    private List<ErrorItem> syntaxItems = new LinkedList<>();
    private int syntaxErrorCount = 0;
    private int errorCount = 0;
    private int warningCount = 0;
    private URL url = null;

    public FileErrorListener(String name) {
        this.name = name;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
        ErrorItem item = new ErrorItem(ErrorItem.ERROR, line, charPositionInLine + 1, msg);
        items.add(item);
        syntaxItems.add(item);

        syntaxErrorCount++;
        errorCount++;
    }

    public void addError(int line, int charPositionInLine,	String msg)
    {
        items.add(new ErrorItem(ErrorItem.ERROR, line, charPositionInLine + 1, msg));
        errorCount++;
    }

    public void addWarning(int line, int charPositionInLine,	String msg)
    {
        items.add(new ErrorItem(ErrorItem.WARNING, line, charPositionInLine + 1, msg));
        warningCount++;
    }

    public void addError(int line, int charPositionInLine, String msg, long sid)
    {
        items.add(new ErrorItem(ErrorItem.ERROR, line, charPositionInLine + 1, msg, sid));
        errorCount++;
    }

    public void addWarning(int line, int charPositionInLine,	String msg , long sid)
    {
        items.add(new ErrorItem(ErrorItem.WARNING, line, charPositionInLine + 1, msg, sid));
        warningCount++;
    }

    public int countSyntaxErrors() {
        return syntaxErrorCount;
    }

    public int countErrors()
    {
        return errorCount;
    }

    public int countWarnings()
    {
        return warningCount;
    }

    public int count() { return items.size(); }

    public List<ErrorItem> get(boolean syntaxOnly)
    {
        return Collections.unmodifiableList(syntaxOnly ? syntaxItems : items);
    }

    public String getName() {
        return name;
    }

    public void print(PrintStream stream, int indent) {
        if(stream != null) {
            if(count() > 0) {
                for (ErrorItem item : items) {
                    String repeated = Stream.generate(() -> " ").limit(indent).collect(joining());
                    stream.print(repeated);
                    stream.println(item.getRow() + ":" + item.getCol() + " - " + item.getContent());
                }
            }
        }
    }
}
