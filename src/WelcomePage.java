import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage extends JPanel {
    private JFrame frame;
    private JLabel welcomeLabel;
    private JButton startButton;

    public WelcomePage(JFrame frame) {
        this.frame = frame;
        setLayout(new BorderLayout());

        welcomeLabel = new JLabel("Welcome to RICO BANK!");
        welcomeLabel.setFont(new Font("verdana", Font.BOLD, 20));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        startButton = new JButton("Continue");
        startButton.setFont(new Font("Arial",Font.ITALIC,16));
        startButton.setHorizontalAlignment(JLabel.CENTER);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll(); // Remove the current content
                frame.add(new BankPage(frame)); // Add BankPage to the frame
                frame.revalidate(); // Refresh the frame
            }
        });

        add(welcomeLabel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
    }


}

