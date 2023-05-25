import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankPage extends JPanel {
    private static final String DEFAULT_PIN = "5555";

    private static int loginAttempts = 4;

    private JFrame frame;

    private JPasswordField pinField;

    public BankPage(JFrame frame) {
        this.frame = frame;
        setLayout(new FlowLayout());

        JLabel pinLabel = new JLabel("Enter your pin");
        pinField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] enteredPinChars = pinField.getPassword();
                String enteredPin = new String(enteredPinChars);
                if (enteredPin.equals(DEFAULT_PIN)) {
                    showAccountsPage();
                } else {
                    loginAttempts--;
                    if (loginAttempts > 0) {
                        JOptionPane.showMessageDialog(frame, "Invalid PIN. You have " + loginAttempts + " attempts remaining.");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Login failed. No attempts remaining.");
                        frame.dispose(); // Close the frame or take appropriate action
                    }
                }
                // Clear the password field after each login attempt
                pinField.setText("");
            }
        });

        add(pinLabel);
        add(pinField);
        add(loginButton);
    }

    private void showAccountsPage() {
        frame.getContentPane().removeAll(); // Remove the current content
        frame.add(new Accounts(frame)); // Add Accounts page to the frame
        frame.revalidate(); // Refresh the frame
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ACCOUNTS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        BankPage bankPage = new BankPage(frame);
        bankPage.setBackground(new Color(255, 204, 229)); // Light pink color
        frame.add(bankPage);

        frame.setVisible(true);
    }
}