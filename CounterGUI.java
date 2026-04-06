import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI extends JFrame implements ActionListener {

    JLabel label;
    JTextField textField;
    JButton upButton, downButton, resetButton;

    int count = 0;

    public CounterGUI() {
        setTitle("Counter");
        setSize(400, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Counter");
        textField = new JTextField("0", 10);
        textField.setEditable(false);

        upButton = new JButton("Count Up");
        downButton = new JButton("Count Down");
        resetButton = new JButton("Reset");

        add(label);
        add(textField);
        add(upButton);
        add(downButton);
        add(resetButton);

        upButton.addActionListener(this);
        downButton.addActionListener(this);
        resetButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == upButton) {
            count++;
        } else if (e.getSource() == downButton) {
            count--;
        } else if (e.getSource() == resetButton) {
            count = 0;
        }
        textField.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new CounterGUI();
    }
}