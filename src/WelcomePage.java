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
        welcomeLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        startButton = new JButton("Continue");
        startButton.setFont(new Font("Arial", Font.ITALIC, 16));
        startButton.setHorizontalAlignment(JButton.CENTER);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll(); // Remove the current content
                frame.revalidate(); // Refresh the frame
                frame.repaint(); // Repaint the frame
                showBankPage(); // Show the BankPage frame
            }
        });

        add(welcomeLabel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);
    }

    private void showBankPage() {
        JFrame bankFrame = new JFrame("Bank Page");
        bankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bankFrame.setSize(300, 200);
        bankFrame.setLocationRelativeTo(null);

        BankPage bankPage = new BankPage(bankFrame);
        bankPage.setBackground(new Color(204, 229, 255)); // Light blue color
        bankFrame.setContentPane(bankPage);
        bankFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Welcome");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setLocationRelativeTo(null);

                WelcomePage welcomePage = new WelcomePage(frame);
                welcomePage.setBackground(new Color(204, 229, 255)); // Light blue color
                frame.setContentPane(welcomePage);
                frame.setVisible(true);
            }
        });
    }
}
