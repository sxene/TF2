import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class homeScreen extends JLabel implements ActionListener {
    boolean login;
    String username;
    String password;
    JLabel userBox;
    public homeScreen() {
        ImageIcon backgroundImage = new ImageIcon("/home/zoey/IdeaProjects/TF2/src/Images/hs1.jpg");
        setIcon(backgroundImage);
        setVisible(true);

        int level;
        ImageIcon levelImage = new ImageIcon("/home/zoey/IdeaProjects/TF2/src/Images/jpg");
        userBox = new JLabel();
        userBox.setBounds(75, 0, 400, 250);
        userBox.setFont(new Font("Arial", Font.BOLD, 100));
        userBox.setText("TTTTT");
        userBox.setForeground(Color.BLACK);


        if (username != null) {
            login = true;
        }
        else {
            login = false;
        }
        if (!login) {


        }

        add(userBox);



    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
