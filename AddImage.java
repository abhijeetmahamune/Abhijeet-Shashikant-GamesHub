import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class AddImage extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // JFrame Creation
        frame.setTitle("Add Image"); // Add the title to frame
        frame.setLayout(null); // Terminates default flow layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminate program on close button
        frame.setBounds(100, 200, 350, 300); // Sets the position of the frame
        JButton btn = new JButton("120");
        btn.setBounds(100, 100, 700, 300);
        // Container c = frame.getContentPane(); // Gets the content layer
        // JLabel label = new JLabel(); // JLabel Creation
        btn.setIcon(new ImageIcon("Screenshot (1).png")); // Sets the image to be displayed as an icon
        Dimension size = btn.getPreferredSize(); // Gets the size of the image
        // label.setBounds(50, 30, 200, 300); // Sets the location of the image

        // frame.add(label); // Adds objects to the container
        frame.add(btn, size);
        frame.setVisible(true); // Exhibit the frame
    }
}
