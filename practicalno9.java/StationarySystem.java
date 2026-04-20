import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationarySystem extends JFrame implements ActionListener {

    JCheckBox notebook, pen, pencil;
    JButton order;

    StationarySystem() {
        setTitle("Stationary Purchase System");
        setSize(300, 300);
        setLayout(new FlowLayout());

        notebook = new JCheckBox("Notebook @ 50");
        pen = new JCheckBox("Pen @ 30");
        pencil = new JCheckBox("Pencil @ 10");

        order = new JButton("Order");

        add(notebook);
        add(pen);
        add(pencil);
        add(order);

        order.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;

        if (notebook.isSelected()) {
            int qty = Integer.parseInt(
                JOptionPane.showInputDialog("Enter quantity for Notebook"));
            total += qty * 50;
        }

        if (pen.isSelected()) {
            int qty = Integer.parseInt(
                JOptionPane.showInputDialog("Enter quantity for Pen"));
            total += qty * 30;
        }

        if (pencil.isSelected()) {
            int qty = Integer.parseInt(
                JOptionPane.showInputDialog("Enter quantity for Pencil"));
            total += qty * 10;
        }

        JOptionPane.showMessageDialog(this,
                "Total Amount: " + total);

        JOptionPane.showMessageDialog(this,
                "Successfully Ordered!");
    }

    public static void main(String[] args) {
        new StationarySystem();
    }
}