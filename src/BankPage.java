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
        pinField = new JTextField(10);
        JButton LoginButton = new JButton("Login");


        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredpin = pinField.getText();
                if (enteredpin.equals(DEFAULT_PIN)) {
                    showWelcomePage();
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

    private void showWelcomePage() {
        // Display the welcome page or take appropriate action
        JOptionPane.showMessageDialog(frame, "Login successful. Welcome!");
        // Add your code here to show the welcome page or perform other actions
    }
    // Create the frame and add the BankPage panel
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        BankPage bankPage = new BankPage(frame);
        frame.add(bankPage);

        frame.setVisible(true);
    }
}







