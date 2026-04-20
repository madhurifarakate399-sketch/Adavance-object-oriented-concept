import javax.swing.*;
import java.awt.event.*;

public class ImageViewer extends JFrame implements ItemListener {

    JComboBox<String> combo;
    JLabel label;

    ImageViewer() {
        setTitle("Image Viewer");
        setSize(300, 300);

        String images[] = {"img1.jpg", "img2.jpg", "img3.jpg"};
        combo = new JComboBox<>(images);
        label = new JLabel();

        add(combo, "North");
        add(label, "Center");

        combo.addItemListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String img = (String) combo.getSelectedItem();
        label.setIcon(new ImageIcon(img));
    }

    public static void main(String[] args) {
        new ImageViewer();
    }
}