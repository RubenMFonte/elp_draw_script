// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawScriptGrammarParser}.
 */
public interface DrawScriptGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(DrawScriptGrammarParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(DrawScriptGrammarParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(DrawScriptGrammarParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(DrawScriptGrammarParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#props}.
	 * @param ctx the parse tree
	 */
	void enterProps(DrawScriptGrammarParser.PropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#props}.
	 * @param ctx the parse tree
	 */
	void exitProps(DrawScriptGrammarParser.PropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(DrawScriptGrammarParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(DrawScriptGrammarParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(DrawScriptGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(DrawScriptGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#set_color}.
	 * @param ctx the parse tree
	 */
	void enterSet_color(DrawScriptGrammarParser.Set_colorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#set_color}.
	 * @param ctx the parse tree
	 */
	void exitSet_color(DrawScriptGrammarParser.Set_colorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#set_draw_mode}.
	 * @param ctx the parse tree
	 */
	void enterSet_draw_mode(DrawScriptGrammarParser.Set_draw_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#set_draw_mode}.
	 * @param ctx the parse tree
	 */
	void exitSet_draw_mode(DrawScriptGrammarParser.Set_draw_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#draw_mode}.
	 * @param ctx the parse tree
	 */
	void enterDraw_mode(DrawScriptGrammarParser.Draw_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#draw_mode}.
	 * @param ctx the parse tree
	 */
	void exitDraw_mode(DrawScriptGrammarParser.Draw_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#square}.
	 * @param ctx the parse tree
	 */
	void enterSquare(DrawScriptGrammarParser.SquareContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#square}.
	 * @param ctx the parse tree
	 */
	void exitSquare(DrawScriptGrammarParser.SquareContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#rectangle}.
	 * @param ctx the parse tree
	 */
	void enterRectangle(DrawScriptGrammarParser.RectangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#rectangle}.
	 * @param ctx the parse tree
	 */
	void exitRectangle(DrawScriptGrammarParser.RectangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#ellipse}.
	 * @param ctx the parse tree
	 */
	void enterEllipse(DrawScriptGrammarParser.EllipseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#ellipse}.
	 * @param ctx the parse tree
	 */
	void exitEllipse(DrawScriptGrammarParser.EllipseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(DrawScriptGrammarParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(DrawScriptGrammarParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(DrawScriptGrammarParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(DrawScriptGrammarParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(DrawScriptGrammarParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(DrawScriptGrammarParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(DrawScriptGrammarParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(DrawScriptGrammarParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(DrawScriptGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(DrawScriptGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DrawScriptGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DrawScriptGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#ml_instruction_block}.
	 * @param ctx the parse tree
	 */
	void enterMl_instruction_block(DrawScriptGrammarParser.Ml_instruction_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#ml_instruction_block}.
	 * @param ctx the parse tree
	 */
	void exitMl_instruction_block(DrawScriptGrammarParser.Ml_instruction_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#instruction_block}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_block(DrawScriptGrammarParser.Instruction_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#instruction_block}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_block(DrawScriptGrammarParser.Instruction_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#assignment_block}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_block(DrawScriptGrammarParser.Assignment_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#assignment_block}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_block(DrawScriptGrammarParser.Assignment_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(DrawScriptGrammarParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(DrawScriptGrammarParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(DrawScriptGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(DrawScriptGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(DrawScriptGrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(DrawScriptGrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(DrawScriptGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(DrawScriptGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#data_item}.
	 * @param ctx the parse tree
	 */
	void enterData_item(DrawScriptGrammarParser.Data_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#data_item}.
	 * @param ctx the parse tree
	 */
	void exitData_item(DrawScriptGrammarParser.Data_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DrawScriptGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DrawScriptGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(DrawScriptGrammarParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(DrawScriptGrammarParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(DrawScriptGrammarParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(DrawScriptGrammarParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#y}.
	 * @param ctx the parse tree
	 */
	void enterY(DrawScriptGrammarParser.YContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#y}.
	 * @param ctx the parse tree
	 */
	void exitY(DrawScriptGrammarParser.YContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(DrawScriptGrammarParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(DrawScriptGrammarParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(DrawScriptGrammarParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(DrawScriptGrammarParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(DrawScriptGrammarParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(DrawScriptGrammarParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#l_expression}.
	 * @param ctx the parse tree
	 */
	void enterL_expression(DrawScriptGrammarParser.L_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#l_expression}.
	 * @param ctx the parse tree
	 */
	void exitL_expression(DrawScriptGrammarParser.L_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#r_expression}.
	 * @param ctx the parse tree
	 */
	void enterR_expression(DrawScriptGrammarParser.R_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#r_expression}.
	 * @param ctx the parse tree
	 */
	void exitR_expression(DrawScriptGrammarParser.R_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(DrawScriptGrammarParser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(DrawScriptGrammarParser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DrawScriptGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DrawScriptGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DrawScriptGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DrawScriptGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(DrawScriptGrammarParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(DrawScriptGrammarParser.ArithmeticContext ctx);
}