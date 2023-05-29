import java.awt.Color
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Rectangle
import java.awt.Shape
import javax.swing.JComponent
import javax.swing.JFrame

class Window : JComponent() {

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

class InstructionBlock {
    var variables = HashMap<String, Int>()
}

class DS_Interpreter : JComponent() {

    data class DrawObject(val shape: DS_ASTParser.Shape, val color: DS_ASTParser.Color, val drawMode: DS_ASTParser.DrawMode)

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
        runInstructions(script.logic, hashMapOf<String, Int>())

        print(constants)

        frame.setSize(width, height)

        frame.add(this)
        frame.isVisible = true
    }

    private fun runInstructions(instructions: DS_ASTParser.InstructionBlock, variables: HashMap<String, Int>) {

        var localVariables: HashMap<String, Int> = variables

        for(instruction in instructions.instructions) {

            if(instruction is DS_ASTParser.SetDrawMode) {
                currentDrawMode = instruction.mode
                currentColor = instruction.color
            }
            else if(instruction is DS_ASTParser.Shape) {

                objectsToDraw.add(
                    DrawObject( instruction, currentColor, currentDrawMode)
                )
            }
            else if(instruction is DS_ASTParser.For) {

                var start = calculateValue(instruction.interval.start)
                val end = calculateValue(instruction.interval.end)

                localVariables[instruction.iterator] = start

                for(i in start..end)        {
                    
                }

            }
        }
    }

    private fun getConstants(assignments: DS_ASTParser.AssignmentBlock) {

        for(assignment in assignments.assignments) {
            constants[assignment.identifier] = calculateValue(assignment.value)
        }
    }

    private fun calculateValue(value: DS_ASTParser.Value) : Int {

        return when (value) {
            is DS_ASTParser.BinaryExpression -> {
                calculateExpression(value)
            }
            is DS_ASTParser.Constant -> {
                constants[value.identifier] ?: 0
            }
            is DS_ASTParser.Num -> {
                value.value
            }
            else -> 0
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


            print("drawObject")

            var red = 0
            var green = 0
            var blue = 0

            red = calculateValue( drawObject.color.values.first() )

            if(drawObject.color.values.size > 1) {
                green = calculateValue( drawObject.color.values[1] )
                blue = calculateValue( drawObject.color.values[2] )
            }
            else {
                green = red;
                blue = red;
            }

            g.color = Color( red,green,blue )

            var shape = getShape(drawObject.shape) as Rectangle

            when(drawObject.drawMode) {
                DS_ASTParser.DrawMode.FILL -> g.fillRect(shape.x, shape.y, shape.width, shape.height)
                DS_ASTParser.DrawMode.LINE -> g.draw(shape)
            }

        }

    }

    private fun extractColor(color: DS_ASTParser.Color)  : Color  {

        var red = 0
        var green = 0
        var blue = 0

        red = calculateValue( color.values.first() )

        if(color.values.size > 1) {
            green = calculateValue( color.values[1] )
            blue = calculateValue( color.values[2] )
        }
        else {
            green = red;
            blue = red;
        }

        return Color(red, green, blue)
    }

    private fun getShape(shape: DS_ASTParser.Shape): Shape {

        return if(shape is DS_ASTParser.Rectangle) {
            Rectangle(
                calculateValue(shape.position.x),
                calculateValue(shape.position.y),
                calculateValue(shape.dimension.x),
                calculateValue(shape.dimension.y)
            )
        } else Rectangle(0,0,0,0)
    }

}