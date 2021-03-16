// Generated from /home/andre/Área de Trabalho/TEU/InterpreTraduto/grammar/basicintast/parser/Pascalzinho.g4 by ANTLR 4.6

package basicintast.parser;
import basicintast.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PascalzinhoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PascalzinhoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programStmtBegin}
	 * labeled alternative in {@link PascalzinhoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStmtBegin(PascalzinhoParser.ProgramStmtBeginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code programStmt}
	 * labeled alternative in {@link PascalzinhoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStmt(PascalzinhoParser.ProgramStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalzinhoParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(PascalzinhoParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varNameFirst}
	 * labeled alternative in {@link PascalzinhoParser#var2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNameFirst(PascalzinhoParser.VarNameFirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code startL}
	 * labeled alternative in {@link PascalzinhoParser#var2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartL(PascalzinhoParser.StartLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varName}
	 * labeled alternative in {@link PascalzinhoParser#varn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(PascalzinhoParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalzinhoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PascalzinhoParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalzinhoParser#arraytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraytype(PascalzinhoParser.ArraytypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalzinhoParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(PascalzinhoParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalzinhoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PascalzinhoParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPrint}
	 * labeled alternative in {@link PascalzinhoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrint(PascalzinhoParser.StmtPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtRead}
	 * labeled alternative in {@link PascalzinhoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtRead(PascalzinhoParser.StmtReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAttr}
	 * labeled alternative in {@link PascalzinhoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAttr(PascalzinhoParser.StmtAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExpr}
	 * labeled alternative in {@link PascalzinhoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpr(PascalzinhoParser.StmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtCond}
	 * labeled alternative in {@link PascalzinhoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtCond(PascalzinhoParser.StmtCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link PascalzinhoParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(PascalzinhoParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link PascalzinhoParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(PascalzinhoParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link PascalzinhoParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(PascalzinhoParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link PascalzinhoParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(PascalzinhoParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExpresion}
	 * labeled alternative in {@link PascalzinhoParser#condExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpresion(PascalzinhoParser.CondExpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condRelOp}
	 * labeled alternative in {@link PascalzinhoParser#condExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondRelOp(PascalzinhoParser.CondRelOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link PascalzinhoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(PascalzinhoParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStr}
	 * labeled alternative in {@link PascalzinhoParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStr(PascalzinhoParser.PrintStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link PascalzinhoParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(PascalzinhoParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStrLn}
	 * labeled alternative in {@link PascalzinhoParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStrLn(PascalzinhoParser.PrintStrLnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExprLn}
	 * labeled alternative in {@link PascalzinhoParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExprLn(PascalzinhoParser.PrintExprLnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readVar}
	 * labeled alternative in {@link PascalzinhoParser#readln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadVar(PascalzinhoParser.ReadVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrExpr}
	 * labeled alternative in {@link PascalzinhoParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrExpr(PascalzinhoParser.AttrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrString}
	 * labeled alternative in {@link PascalzinhoParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrString(PascalzinhoParser.AttrStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrBool}
	 * labeled alternative in {@link PascalzinhoParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrBool(PascalzinhoParser.AttrBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrArrExpr}
	 * labeled alternative in {@link PascalzinhoParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrArrExpr(PascalzinhoParser.AttrArrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrArrStr}
	 * labeled alternative in {@link PascalzinhoParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrArrStr(PascalzinhoParser.AttrArrStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrArrTrueFalse}
	 * labeled alternative in {@link PascalzinhoParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrArrTrueFalse(PascalzinhoParser.AttrArrTrueFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PascalzinhoParser#truefalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruefalse(PascalzinhoParser.TruefalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link PascalzinhoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(PascalzinhoParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMinus}
	 * labeled alternative in {@link PascalzinhoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMinus(PascalzinhoParser.ExprMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr1Empty}
	 * labeled alternative in {@link PascalzinhoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1Empty(PascalzinhoParser.Expr1EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr1Mult}
	 * labeled alternative in {@link PascalzinhoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1Mult(PascalzinhoParser.Expr1MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr1Div}
	 * labeled alternative in {@link PascalzinhoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1Div(PascalzinhoParser.Expr1DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2Empty}
	 * labeled alternative in {@link PascalzinhoParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2Empty(PascalzinhoParser.Expr2EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2Par}
	 * labeled alternative in {@link PascalzinhoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2Par(PascalzinhoParser.Expr2ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2Num}
	 * labeled alternative in {@link PascalzinhoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2Num(PascalzinhoParser.Expr2NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2Var}
	 * labeled alternative in {@link PascalzinhoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2Var(PascalzinhoParser.Expr2VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprArr}
	 * labeled alternative in {@link PascalzinhoParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArr(PascalzinhoParser.ExprArrContext ctx);
}