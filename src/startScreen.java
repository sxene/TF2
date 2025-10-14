import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startScreen extends JLabel implements ActionListener {
    JButton startB;
    JButton optionsB;

    public startScreen(){

        ImageIcon startBgroundImage = new ImageIcon("/home/zoey/IdeaProjects/TF2/src/Images/homeScreen.jpg");
        ImageIcon start = new ImageIcon("src/Images/startButton.png");

        ImageIcon optionsButton = new ImageIcon("/home/zoey/IdeaProjects/TF2/src/Images/optionsButton.png");

        startB = new JButton(start);
        startB.setBounds(50, 50, 327, 71);
        startB.setVisible(true);
        startB.setIcon(start);
        startB.setFocusable(false);
        startB.addActionListener(e ->{
            System.out.println("Dogff");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.remove(this);
            homeScreen hs = new homeScreen();
            frame.add(hs);
            frame.revalidate();
            frame.repaint();
        });

        optionsB = new JButton(optionsButton);
        optionsB.setBounds(623, 50, 327, 71);
        optionsB.setVisible(true);
        optionsB.setIcon(optionsButton);
        optionsB.setFocusable(false);
        optionsB.addActionListener(e ->{
            System.out.println("notdog");
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
            frame.remove(this);
            optionsMenu oM = new optionsMenu();
            frame.add(oM);
            frame.revalidate();
            frame.repaint();
        });


        add(startB);
        add(optionsB);

        setIcon(startBgroundImage);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
