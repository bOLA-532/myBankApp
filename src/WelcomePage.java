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

        welcomeLabel = new JLabel("Welcome to OPPSBANK!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        startButton = new JButton("Continue");
        startButton.setFont(new Font("Arial",Font.ITALIC,20));
        startButton.setHorizontalAlignment(JLabel.CENTER);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll(); // Remove the current content
                BankPage bankPage = new BankPage(frame); // Create an instance of BankPage with the frame
                bankPage.setBackground(new Color(173, 216, 230)); // Set the background color to light blue
                frame.setContentPane(bankPage); // Set BankPage as the content pane of the frame
                frame.pack(); // Adjust the frame size
                frame.setLocationRelativeTo(null); // Center the frame on the screen
                frame.setVisible(true); // Show the frame
            }
        });

        add(welcomeLabel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
    }


}

