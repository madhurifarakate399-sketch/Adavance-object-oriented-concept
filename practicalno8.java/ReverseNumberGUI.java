import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGUI extends JFrame implements ActionListener {

    JLabel label1, label2;
    JTextField inputField, resultField;
    JButton reverseButton;

    public ReverseNumberGUI() {
        setTitle("Reverse Number");
        setSize(350, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Enter Number:");
        inputField = new JTextField(15);

        label2 = new JLabel("Reversed Number:");
        resultField = new JTextField(15);
        resultField.setEditable(false);

        reverseButton = new JButton("Reverse");

        add(label1);
        add(inputField);
        add(reverseButton);
        add(label2);
        add(resultField);

        reverseButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String num = inputField.getText();
        String rev = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            rev = rev + num.charAt(i);
        }

        resultField.setText(rev);
    }

    public static void main(String[] args) {
        new ReverseNumberGUI();
    }
}