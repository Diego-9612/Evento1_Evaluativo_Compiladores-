// Generated from MiGramatica.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiGramaticaParser}.
 */
public interface MiGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiGramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiGramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiGramaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiGramaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiGramaticaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiGramaticaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiGramaticaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiGramaticaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiGramaticaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiGramaticaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MiGramaticaParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MiGramaticaParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MiGramaticaParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MiGramaticaParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MiGramaticaParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MiGramaticaParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MiGramaticaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal}
	 * labeled alternative in {@link MiGramaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MiGramaticaParser.LiteralContext ctx);
}