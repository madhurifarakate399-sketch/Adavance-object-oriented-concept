import javax.swing.*;
import java.awt.event.*;

public class TextCounter extends JFrame implements KeyListener {

    JTextArea ta;
    JLabel label;

    TextCounter() {
        setTitle("Text Counter");
        setSize(400, 300);

        ta = new JTextArea();
        label = new JLabel("Words: 0 Characters: 0");

        add(ta);
        add(label, "South");

        ta.addKeyListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
        String text = ta.getText();
        int words = text.isEmpty() ? 0 : text.split("\\s+").length;
        int chars = text.length();

        label.setText("Words: " + words + " Characters: " + chars);
    }

    public void keyPressed(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new TextCounter();
    }
}