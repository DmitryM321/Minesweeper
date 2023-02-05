import javax.swing.*;
import java.awt.*;

public class JavaSwipper extends JFrame {
    private JPanel panel;
    public static void main(String[] args) {
    new JavaSwipper();
    }
    private JavaSwipper(){
        initPanel();
        initFrame();
        }

    private void initPanel() {
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        add (panel);
    }
    private void initFrame(){
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sweeper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }


}



