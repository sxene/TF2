import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame { //test
    JLabel background;
    public Frame() {


        homeScreen hs = new homeScreen();
        hs.setVisible(false);
        add(hs);

        startScreen ss = new startScreen();
        ss.setVisible(true);
        add(ss);





        setSize(1000, 900);
        setVisible(true);
        setResizable(false);
        
    }
}
