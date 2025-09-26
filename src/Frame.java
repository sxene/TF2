import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {
        SwingUtilities.invokeLater(() -> {
            startScreen ss = new startScreen();
            ss.setVisible(true);
            add(ss);

            setSize(1000, 900);
            setVisible(true);
            setResizable(false);
        });
    }
}
