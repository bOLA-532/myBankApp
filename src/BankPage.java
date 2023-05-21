import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;

public class BankPage extends JPanel {
    private static final String DEFAULT_PIN = "555";

    private static int LoginAttempts = 4;

    private JFrame frame;

    private JTextField pinField;

    public BankPage(JFrame frame) {
        this.frame = frame;
        setLayout(new FlowLayout());

        JLabel pinLabel = new JLabel("Enter your pin");
        pinField = new JTextField(15);
        JButton LoginButton = new JButton("Login");


        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredpin = pinField.getText();
                if (enteredpin.equals(DEFAULT_PIN)) {
                    showAccountsPage();
                } else {
                    LoginAttempts--;
                    if (LoginAttempts > 0) {
                        JOptionPane.showMessageDialog(frame, "Invalid PIN. You have " + LoginAttempts + " attempts remaining.");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Login failed. No attempts remaining.");
                        frame.dispose(); // Close the frame or take appropriate action

                    }
                }
            }
        });

        add(pinLabel);
        add(pinField);
        add(LoginButton);
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







