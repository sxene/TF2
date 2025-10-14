import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{ //test
    public Frame() {
        startScreen ss = new startScreen();
        ss.setVisible(true);
        add(ss);

        int x = getWidth();
        int y = getHeight();
        setSize(1000, 900);
        setVisible(true);
        setResizable(false);
        
    }
}
