// Generated from ./src/main/java/Component.g4 by ANTLR 4.5
package com.sofrecom.analyser.lexer;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ComponentParser}.
 */
public interface ComponentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ComponentParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ComponentParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ComponentParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#ins}.
	 * @param ctx the parse tree
	 */
	void enterIns(ComponentParser.InsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#ins}.
	 * @param ctx the parse tree
	 */
	void exitIns(ComponentParser.InsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ComponentParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ComponentParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#route}.
	 * @param ctx the parse tree
	 */
	void enterRoute(ComponentParser.RouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#route}.
	 * @param ctx the parse tree
	 */
	void exitRoute(ComponentParser.RouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(ComponentParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(ComponentParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#invokation}.
	 * @param ctx the parse tree
	 */
	void enterInvokation(ComponentParser.InvokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#invokation}.
	 * @param ctx the parse tree
	 */
	void exitInvokation(ComponentParser.InvokationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#packageDec}.
	 * @param ctx the parse tree
	 */
	void enterPackageDec(ComponentParser.PackageDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#packageDec}.
	 * @param ctx the parse tree
	 */
	void exitPackageDec(ComponentParser.PackageDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#classDec}.
	 * @param ctx the parse tree
	 */
	void enterClassDec(ComponentParser.ClassDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#classDec}.
	 * @param ctx the parse tree
	 */
	void exitClassDec(ComponentParser.ClassDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(ComponentParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#methodDec}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(ComponentParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ComponentParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ComponentParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(ComponentParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(ComponentParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ComponentParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ComponentParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ComponentParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ComponentParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#paramName}.
	 * @param ctx the parse tree
	 */
	void enterParamName(ComponentParser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#paramName}.
	 * @param ctx the parse tree
	 */
	void exitParamName(ComponentParser.ParamNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#paramType}.
	 * @param ctx the parse tree
	 */
	void enterParamType(ComponentParser.ParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#paramType}.
	 * @param ctx the parse tree
	 */
	void exitParamType(ComponentParser.ParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ComponentParser#declarationUnit}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationUnit(ComponentParser.DeclarationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ComponentParser#declarationUnit}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationUnit(ComponentParser.DeclarationUnitContext ctx);
}