import java.awt.Color
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Rectangle
import javax.swing.JComponent
import javax.swing.JFrame

class Main : JComponent() {

    override fun paintComponent(graphics: Graphics) {

        val g = graphics as Graphics2D

        // Iterate over list of shapes and draw
        listOf(
            Color(35, 183, 59),
            Color(255, 204, 1),
            Color(244, 43, 38)
        ).forEachIndexed { i, c ->
            g.color = c
            g.draw( Rectangle(i * 100, 0, 100, 150) )
        }

    }

}

class DS_Interpreter : JComponent() {

    data class DrawObject(val shape: DS_ASTParser.Shape, val color: DS_ASTParser.Color)

    var constants = HashMap<String, Int>()
    var currentDrawMode = DS_ASTParser.DrawMode.LINE
    var currentColor = DS_ASTParser.Color(
        listOf(
            DS_ASTParser.Num(0),
            DS_ASTParser.Num(0),
            DS_ASTParser.Num(0))
    )

    var objectsToDraw = ArrayList<DrawObject>()

    var frame = JFrame()

    fun runScript(file: String) {

        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        val width = 800
        val height = 600

        val ast_parser = DS_ASTParser()

        val script = ast_parser.parseScript(file)

        getConstants(script.constants)

        print(constants)

        frame.setSize(width, height)

        frame.add(Main())
        frame.isVisible = true
    }

    private fun runInstructions(instructions: DS_ASTParser.InstructionBlock) {

        for(instruction in instructions.instructions) {

            if(instruction is DS_ASTParser.SetDrawMode) {
                currentDrawMode = instruction.mode
                currentColor = instruction.color
            }
            else if(instruction is DS_ASTParser.Shape) {
                objectsToDraw.add(
                    DrawObject( instruction, currentColor)
                )
            }
        }
    }

    private fun getConstants(assignments: DS_ASTParser.AssignmentBlock) {

        for(assignment in assignments.assignments) {

            if(assignment.value is DS_ASTParser.BinaryExpression) {
                constants[assignment.identifier] = calculateExpression(assignment.value)
            }
            else if(assignment.value is DS_ASTParser.Num) {
                constants[assignment.identifier] = assignment.value.value
            }
        }
    }

    private fun calculateExpression(expression: DS_ASTParser.BinaryExpression): Int {

        var value1 = 0
        var value2 = 0

        if(expression.expression1 is DS_ASTParser.BinaryExpression) {
            value1 = calculateExpression(expression.expression1)
        }
        else if(expression.expression1 is DS_ASTParser.Constant) {
            value1 = constants[expression.expression1.identifier] ?: 0
        }
        else if(expression.expression1 is DS_ASTParser.Num) {
            value1 = expression.expression1.value
        }

        if(expression.expression2 is DS_ASTParser.BinaryExpression) {
            value2 = calculateExpression(expression.expression2)
        }
        else if(expression.expression2 is DS_ASTParser.Constant) {
            value2 = constants[expression.expression2.identifier] ?: 0
        }
        else if(expression.expression2 is DS_ASTParser.Num) {
            value2 = expression.expression2.value
        }

        return when(expression.operator) {
            "+" -> value1 + value2
            "-" -> value1 - value2
            "*" -> value1 * value2
            "/" -> value1 / value2
            "%" -> value1 % value2
            else -> 0
        }
    }

    override fun paintComponent(graphics: Graphics) {

        val g = graphics as Graphics2D

        for(drawObject in objectsToDraw) {

            g.color = Color()
        }

    }
}