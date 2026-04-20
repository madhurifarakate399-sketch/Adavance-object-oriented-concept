import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {

    FlowLayoutDemo() {
        setTitle("FlowLayout Demo");

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        add(new JCheckBox("Java"));
        add(new JCheckBox("Python"));
        add(new JCheckBox("C++"));

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}