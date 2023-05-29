// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawScriptGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawScriptGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(DrawScriptGrammarParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(DrawScriptGrammarParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProps(DrawScriptGrammarParser.PropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(DrawScriptGrammarParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(DrawScriptGrammarParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#set_color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_color(DrawScriptGrammarParser.Set_colorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#set_draw_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_draw_mode(DrawScriptGrammarParser.Set_draw_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#draw_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDraw_mode(DrawScriptGrammarParser.Draw_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#square}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare(DrawScriptGrammarParser.SquareContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#rectangle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRectangle(DrawScriptGrammarParser.RectangleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#ellipse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipse(DrawScriptGrammarParser.EllipseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(DrawScriptGrammarParser.ShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(DrawScriptGrammarParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(DrawScriptGrammarParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(DrawScriptGrammarParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DrawScriptGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DrawScriptGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#ml_instruction_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMl_instruction_block(DrawScriptGrammarParser.Ml_instruction_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#instruction_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_block(DrawScriptGrammarParser.Instruction_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#assignment_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_block(DrawScriptGrammarParser.Assignment_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(DrawScriptGrammarParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DrawScriptGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(DrawScriptGrammarParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(DrawScriptGrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#data_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_item(DrawScriptGrammarParser.Data_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DrawScriptGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(DrawScriptGrammarParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(DrawScriptGrammarParser.XContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(DrawScriptGrammarParser.YContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(DrawScriptGrammarParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(DrawScriptGrammarParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(DrawScriptGrammarParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#l_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_expression(DrawScriptGrammarParser.L_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#r_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_expression(DrawScriptGrammarParser.R_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(DrawScriptGrammarParser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DrawScriptGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DrawScriptGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(DrawScriptGrammarParser.ArithmeticContext ctx);
}