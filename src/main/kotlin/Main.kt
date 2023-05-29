import java.awt.Color
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.JComponent
import javax.swing.JFrame



fun main() {
    val file = "test.ds"

    var interpreter = DS_Interpreter()

    interpreter.runScript(file)
}