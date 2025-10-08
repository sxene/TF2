import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startScreen extends JLabel implements ActionListener {
    JButton Back;
    public startScreen(){

        ImageIcon backgroundImage = new ImageIcon("/home/zoey/IdeaProjects/TF2/src/Images/homeScreen.jpg");
        ImageIcon start = new ImageIcon("src/Images/startButton.png");

        Back = new JButton(start);
        Back.setBounds(50, 50, 327, 71);
        Back.setVisible(true);
        Back.setIcon(start);
        Back.setFocusable(false);
        Back.addActionListener(e ->{
            System.out.println("Dogff");

            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);

            frame.remove(this);

            homeScreen hs = new homeScreen();
            frame.add(hs);

            frame.revalidate();
            frame.repaint();
        });


        add(Back);

        setIcon(backgroundImage);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
