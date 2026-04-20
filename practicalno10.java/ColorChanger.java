import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame implements ActionListener {

    JButton btn;

    ColorChanger() {
        setTitle("Color Changer");
        setSize(300, 200);

        btn = new JButton("Select Color");
        add(btn);

        btn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this, "Choose Color", Color.WHITE);
        getContentPane().setBackground(c);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}