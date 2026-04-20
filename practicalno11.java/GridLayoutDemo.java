import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends JFrame implements ActionListener {

    JButton[] btn = new JButton[6];
    int firstIndex = -1;

    GridLayoutDemo() {
        setTitle("Grid Layout Swap");
        setSize(300, 200);

        setLayout(new GridLayout(2, 3));

        for (int i = 0; i < 6; i++) {
            btn[i] = new JButton("" + (i + 1));
            btn[i].addActionListener(this);
            add(btn[i]);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        for (int i = 0; i < 6; i++) {
            if (btn[i] == clicked) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else {
                    String temp = btn[firstIndex].getText();
                    btn[firstIndex].setText(btn[i].getText());
                    btn[i].setText(temp);
                    firstIndex = -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}