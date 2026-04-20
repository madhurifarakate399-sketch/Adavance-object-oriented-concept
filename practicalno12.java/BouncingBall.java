import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BallPanel extends JPanel implements Runnable {
    int x = 50, y = 50;
    int dx = 2, dy = 2;
    int diameter = 30;
    boolean running = false;

    public BallPanel() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (!running) {
                    running = true;
                    Thread t = new Thread(BallPanel.this);
                    t.start();
                }
            }
        });
    }

    public void run() {
        while (running) {
            x += dx;
            y += dy;

            // Bounce logic
            if (x <= 0 || x + diameter >= getWidth()) {
                dx = -dx;
            }
            if (y <= 0 || y + diameter >= getHeight()) {
                dy = -dy;
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, diameter, diameter);
    }
}

public class BouncingBall {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BallPanel panel = new BallPanel();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}