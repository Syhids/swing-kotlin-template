package template

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.swing.Swing
import java.awt.Dimension
import javax.swing.*

fun main() {
    GlobalScope.launch(Dispatchers.Swing) {
        val frame = JFrame().apply {
            title = "Template"
            size = Dimension(400, 400)
            setLocationRelativeTo(null)
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            layout = BoxLayout(contentPane, BoxLayout.Y_AXIS)
        }

        val button = JButton("Press me")
        val label = JLabel("This is a label")

        button.addActionListener { label.text = "Hello world" }

        frame.add(label)
        frame.add(button)
        frame.isVisible = true
    }
}