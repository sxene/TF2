import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class optionsMenu extends JLabel implements ActionListener {
        JButton back;
        optionsMenu(){
            setBackground(Color.BLACK);
            setForeground(Color.WHITE);
            setVisible(true);
            back = new JButton("Back");
            back.setBounds(50, 50, 341, 70);
            back.addActionListener(e -> {
                System.out.println("doggnottt");
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.remove(this);
                startScreen oM = new startScreen();
                frame.add(oM);
                frame.revalidate();
                frame.repaint();
            });
            add(back);


        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
