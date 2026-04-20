import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stopwatch extends JFrame implements Runnable {
    JLabel timeLabel;
    JButton startBtn, stopBtn, resetBtn;
    int seconds = 0;
    boolean running = false;
    Thread t;

    public Stopwatch() {
        setTitle("Stopwatch");

        timeLabel = new JLabel("00:00:00", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));

        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");
        resetBtn = new JButton("Reset");

        startBtn.addActionListener(e -> start());
        stopBtn.addActionListener(e -> stop());
        resetBtn.addActionListener(e -> reset());

        JPanel panel = new JPanel();
        panel.add(startBtn);
        panel.add(stopBtn);
        panel.add(resetBtn);

        add(timeLabel, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void run() {
        while (running) {
            seconds++;
            int hrs = seconds / 3600;
            int mins = (seconds % 3600) / 60;
            int secs = seconds % 60;

            timeLabel.setText(String.format("%02d:%02d:%02d", hrs, mins, secs));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    void start() {
        if (!running) {
            running = true;
            t = new Thread(this);
            t.start();
        }
    }

    void stop() {
        running = false;
    }

    void reset() {
        running = false;
        seconds = 0;
        timeLabel.setText("00:00:00");
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}