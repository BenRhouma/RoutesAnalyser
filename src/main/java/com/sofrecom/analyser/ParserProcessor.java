package com.sofrecom.analyser;

import com.sofrecom.Logger;
import com.sofrecom.analyser.lexer.ComponentLexer;
import com.sofrecom.analyser.lexer.ComponentParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author z.benrhouma
 */
public class ParserProcessor {


    public static Tuple3<String, String, String> test(String str) throws IOException {
        final ANTLRInputStream inputStream = new ANTLRInputStream(new StringReader(str));
        final ComponentLexer lexer = new ComponentLexer(inputStream);
        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        final ComponentParser p = new ComponentParser(tokenStream);

        final ExprTreeVisitor exprTreeVisitor = new ExprTreeVisitor(p);
        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(exprTreeVisitor, p.exp());
        return exprTreeVisitor.getRoute();
    }

}
