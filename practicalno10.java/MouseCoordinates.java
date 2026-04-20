import javax.swing.*;
import java.awt.event.*;

public class MouseCoordinates extends JFrame implements MouseMotionListener {

    JLabel label;

    MouseCoordinates() {
        setTitle("Mouse Coordinates");
        setSize(400, 300);

        label = new JLabel("Move mouse...");
        add(label);

        addMouseMotionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("X: " + e.getX() + " Y: " + e.getY());
    }

    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseCoordinates();
    }
}