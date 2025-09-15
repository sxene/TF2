import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame { //test
    JLabel background;
    public Frame() {
       // Image backgroundImage = new ImageIcon("~/IdeaProjects/TF2/src/Images/homeScreen.jpg").getImage();
        startScreen ss = new startScreen();
        ss.setVisible(true);
        add(ss);

//        setContentPane(new JPanel(new BorderLayout()) {
//            @Override public void paintComponent(Graphics g) {
//                g.drawImage(backgroundImage, 0, 0, null);
//            }
//        });

        setSize(1000, 900);
        setVisible(true);
        setResizable(false);
        
    }
}
