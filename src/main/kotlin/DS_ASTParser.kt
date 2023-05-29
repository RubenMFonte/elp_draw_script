import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import kotlin.math.log

class DS_ASTParser {

    enum class DrawMode(val mode: String) {
        FILL("fill"),
        LINE("line");

        override fun toString(): String {
            return mode
        }
    }

    enum class Comparator(val comp: String) {
        GT(">"),
        LT("<"),
        EQ("=="),
        LE("<="),
        GE(">="),
        NE("!=");

        override fun toString(): String {
            return comp
        }
    }

    data class Script(val constants: AssignmentBlock, val properties: AssignmentBlock, val logic: InstructionBlock)

    data class AssignmentBlock(val assignments: List<Assignment>)

    data class Assignment(val identifier: String, val value: Value)

    data class InstructionBlock(val instructions: List<Instruction>)

    sealed interface Instruction

    data class SetColor(val color: Color) : Instruction
    data class SetDrawMode(val mode: DrawMode, val color: Color) : Instruction

    data class For(val iterator: String, val interval: Interval, val instructions: InstructionBlock) : Instruction

    data class If(
        val condition: Condition,
        val ifInstructions: InstructionBlock,
        val elseInstructions: InstructionBlock
    ) : Instruction

    data class Condition(val valueL: Value, val valueR: Value, val comparator: Comparator)

    sealed interface Shape : Instruction

    data class Rectangle(val position: Point, val dimension: Dimension) : Shape
    data class Ellipse(val position: Point, val dimension: Dimension) : Shape
    data class Polygon(val points: List<Point>) : Shape

    sealed interface Value

    data class Color(val values: List<Value>) : Value
    data class Point(val x: Value, val y: Value) : Value
    data class Interval(val start: Value, val end: Value) : Value
    data class Dimension(val x: Value, val y: Value) : Value
    data class Bool(val value: Boolean) : Value

    sealed interface Expression : Value

    data class BinaryExpression(val expression1: Expression, val expression2: Expression, val operator: String) : Expression

    data class Constant(val identifier: String) : Expression
    data class Variable(val identifier: String) : Expression
    data class Num(val value: Int) : Expression

    // AST Functions

    private fun DrawScriptGrammarParser.Binary_expressionContext.toAst() : Expression =
            if(binary_expression().size > 1)
                BinaryExpression(
                    binary_expression()[0].toAst(),
                    binary_expression()[1].toAst(),
                    OPERATOR().text
                )
            else if(expression().size > 1)
                BinaryExpression(
                    expression()[0].toAst(),
                    expression()[1].toAst(),
                    OPERATOR().text
                )
            else expression().first().toAst()

    private fun DrawScriptGrammarParser.ExpressionContext.toAst() : Expression =
            if(constant() != null) constant().toAst()
            else if(id() != null) id().toAst()
            else num().toAst()

    private fun DrawScriptGrammarParser.ConstantContext.toAst() : Constant = Constant(CONST().text)
    private fun DrawScriptGrammarParser.IdContext.toAst() : Variable = Variable(ID().text)
    private fun DrawScriptGrammarParser.NumContext.toAst() : Num = Num(NUM().text.toInt())

    private fun DrawScriptGrammarParser.ColorContext.toAst(): Color =
        Color(
            if(expression().size > 0) expression().map { it.toAst() }
            else listOf(constant().toAst())
        )

    private fun DrawScriptGrammarParser.PointContext.toAst(): Point =
        Point( x().binary_expression().toAst(), y().binary_expression().toAst() )

    private fun DrawScriptGrammarParser.DimensionContext.toAst(): Dimension =
        Dimension( x().binary_expression().toAst(), y().binary_expression().toAst() )

    private fun DrawScriptGrammarParser.IntervalContext.toAst(): Interval =
        Interval( point().x().binary_expression().toAst(), point().y().binary_expression().toAst() )

    private fun DrawScriptGrammarParser.BoolContext.toAst(): Bool =
        Bool( text.toBoolean() )

    private fun DrawScriptGrammarParser.ValueContext.toAst(): Value =
        if(binary_expression() != null) binary_expression().toAst()
        else if(point() != null) point().toAst()
        else if(interval() != null) interval().toAst()
        else if(dimension() != null) dimension().toAst()
        else if(color() != null) color().toAst()
        else bool().toAst()

    private fun DrawScriptGrammarParser.AssignmentContext.toAst() : Assignment =
        Assignment(
            data_item().text,
            value().toAst()
        )

    private fun DrawScriptGrammarParser.Assignment_blockContext.toAst() : AssignmentBlock =
        AssignmentBlock(
            assignment().map {
                it.toAst()
            }
        )

    private fun DrawScriptGrammarParser.Set_colorContext.toAst() : SetColor =
        SetColor( color().toAst())

    private fun DrawScriptGrammarParser.Set_draw_modeContext.toAst() : SetDrawMode =
        SetDrawMode(
            when(draw_mode().text) {
                "fill" -> DrawMode.FILL
                "line" -> DrawMode.LINE
                else -> DrawMode.FILL
            },
            color().toAst()
        )

    private fun DrawScriptGrammarParser.ForLoopContext.toAst(): For =
        For(ID().text, interval().toAst(), instruction_block().toAst())

    private fun DrawScriptGrammarParser.ConditionContext.toAst(): Condition =
        Condition(binary_expression().first().toAst(), binary_expression().last().toAst(),
            when(COMPARATOR().text) {
                "==" -> Comparator.EQ
                ">=" -> Comparator.GE
                "<=" -> Comparator.LE
                "!=" -> Comparator.NE
                ">" -> Comparator.GT
                "<" -> Comparator.LT
                else -> Comparator.EQ
            }
        )

    private fun DrawScriptGrammarParser.IfStatementContext.toAst(): If =
        If(condition().toAst(), instruction_block().first().toAst(),
            if(instruction_block().size > 1) instruction_block().last().toAst()
            else InstructionBlock( listOf() )
        )

    private fun DrawScriptGrammarParser.ShapeContext.toAst(): Shape =
        if(square() != null)
            Rectangle( square().position().point().toAst(),
                Dimension( square().size().expression().toAst(), square().size().expression().toAst() )
            )
        else if(rectangle() != null)
            Rectangle( rectangle().position().point().toAst(), rectangle().dimension().toAst())
        else
            Ellipse( ellipse().position().point().toAst(), ellipse().dimension().toAst())

    private fun DrawScriptGrammarParser.InstructionContext.toAst(): Instruction =
        if(set_color() != null) set_color().toAst()
        else if(set_draw_mode() != null) set_draw_mode().toAst()
        else if(forLoop() != null) forLoop().toAst()
        else if(ifStatement() != null) ifStatement().toAst()
        else shape().toAst()

    private fun DrawScriptGrammarParser.Instruction_blockContext.toAst() : InstructionBlock =
        InstructionBlock (
            if(ml_instruction_block()!= null) ml_instruction_block().instruction().map { it.toAst() }
            else listOf( instruction().toAst()
            )
        )

    private fun DrawScriptGrammarParser.ScriptContext.toAst() : Script =
        Script( consts().assignment_block().toAst(), props().assignment_block().toAst(), logic().instruction_block().toAst())


    fun parseScript(filename: String): Script {

        val lexer = DrawScriptGrammarLexer(CharStreams.fromFileName( filename ))
        val parser = DrawScriptGrammarParser(CommonTokenStream(lexer))

        return parser.script().toAst()
    }
}