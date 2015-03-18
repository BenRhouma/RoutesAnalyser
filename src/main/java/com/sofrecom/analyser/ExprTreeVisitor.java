package com.sofrecom.analyser;

//import com.sofrecom.analyser.lexer.ComponentBaseListener;
import com.sofrecom.Logger;
import com.sofrecom.analyser.lexer.ComponentBaseListener;
import com.sofrecom.analyser.lexer.ComponentParser;
import java.util.HashSet;
import java.util.Set;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 *
 * @author z.benrhouma
 */
public class ExprTreeVisitor extends ComponentBaseListener {

    final Set<Tuple3<String, String, String>> routes = new HashSet<>();

    ComponentParser parser;

    public ExprTreeVisitor(ComponentParser p) {
        this.parser = p;
    }

    @Override
    public void exitExp(ComponentParser.ExpContext ctx) {
        super.exitExp(ctx); //To change body of generated methods, choose Tools | Templates.
        final Tuple3<String, String, String> tuple3 = new Tuple3<>();
        if (ctx.ins(0) == null ) {
            return;
        }
        tuple3.route = ctx.ins(0).route().getText();
        tuple3.method = ctx.ins(0).method().getText();
        tuple3.invocation = ctx.ins(0).invokation().getText();
        routes.add(tuple3);
//        Logger.info(String.format("%s %s %s", tuple3.method, tuple3.route, tuple3.invocation));

    }

    private String getText(ParserRuleContext ctx) {
        return parser.getInputStream().getText(ctx.start, ctx.stop);
    }

    public Set<Tuple3<String, String, String>> getRoutes() {
        return routes;
    }

    public Tuple3<String, String, String> getRoute() {
        if(routes.size()>0)
            return routes.iterator().next();
        return  null;
    }
    
    

}
