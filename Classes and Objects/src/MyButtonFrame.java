import javax.swing.*;
import java.awt.*;

public class MyButtonFrame extends JFrame {
    JButton button = new JButton("Click me!");
    JButton button1 = new JButton("Hey You!");

    public MyButtonFrame() {
       setLayout(new FlowLayout());
        add(button);
        add(button1);

        setTitle("My Button Frame");
        setSize(1500, 1500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyButtonFrame frame = new MyButtonFrame();
            frame.setVisible(true);
        });
    }
}
