import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class homeScreen extends JLabel implements ActionListener {
    public homeScreen() {
        ImageIcon backgroundImage = new ImageIcon("/home/zoey/IdeaProjects/TF2/src/Images/homeScreen.jpg");
        setIcon(backgroundImage);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
