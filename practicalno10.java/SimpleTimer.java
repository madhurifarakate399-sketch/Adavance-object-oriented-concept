import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame implements ActionListener {

    JLabel label;
    JButton start, stop;
    Timer timer;
    int count = 0;

    SimpleTimer() {
        setTitle("Timer");
        setSize(300, 200);
        setLayout(new FlowLayout());

        label = new JLabel("Time: 0");
        start = new JButton("Start");
        stop = new JButton("Stop");

        add(label);
        add(start);
        add(stop);

        start.addActionListener(this);
        stop.addActionListener(this);

        timer = new Timer(1000, e -> {
            count++;
            label.setText("Time: " + count);
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start)
            timer.start();
        else
            timer.stop();
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}