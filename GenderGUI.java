import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GenderGUI extends JFrame implements ActionListener {

    JRadioButton male, female;
    JButton submit;
    JLabel result;
    ButtonGroup group;

    public GenderGUI() {
        setTitle("Gender Selection");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        group = new ButtonGroup();
        group.add(male);
        group.add(female);

        submit = new JButton("Submit");
        result = new JLabel("Select Gender");

        add(male);
        add(female);
        add(submit);
        add(result);

        submit.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (male.isSelected()) {
            result.setText("Selected: Male");
        } else if (female.isSelected()) {
            result.setText("Selected: Female");
        } else {
            result.setText("Please select gender");
        }
    }

    public static void main(String[] args) {
        new GenderGUI();
    }
}