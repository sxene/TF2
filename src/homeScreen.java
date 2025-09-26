import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class homeScreen extends JLabel implements ActionListener{
    public homeScreen(){
        SwingUtilities.invokeLater(() ->{
            setBackground(Color.BLACK);
            setVisible(true);
            

        });

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
