import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accounts extends JPanel {
    private JFrame frame;
    private JLabel myAccountTypeLabel;
    private JButton savingsButton;
    private JButton currentsButton;

    public Accounts(JFrame frame) {
        this.frame = frame;
        setBackground(new Color(230, 230, 230)); // Light gray color
        setLayout(new BorderLayout());

        myAccountTypeLabel = new JLabel("Pick Your Account Type");
        myAccountTypeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        myAccountTypeLabel.setHorizontalAlignment(JLabel.CENTER);


        JPanel buttonPanel = new JPanel(new FlowLayout()); // Use FlowLayout for button panel

        currentsButton = new JButton("Currents Account");
        currentsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll(); // Remove the current content
                frame.revalidate(); // Refresh the frame
                Functions functions = new Functions(frame, "Currents Account");
                frame.add(functions);
                frame.setVisible(true);
                    }
                });

        savingsButton = new JButton("Savings Account");
        savingsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll(); // Remove the current content
                frame.revalidate(); // Refresh the frame
                Functions functions = new Functions(frame, "Savings Account");
                frame.add(functions);
                frame.setVisible(true);
            }
        });
        buttonPanel.add(currentsButton);
        buttonPanel.add(savingsButton);

        add(myAccountTypeLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
            }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("ACCOUNTS");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setLocationRelativeTo(null);

                Accounts accounts = new Accounts(frame);
                frame.add(accounts);

                frame.setVisible(true);
            }
        });
    }

    public void deposit(double amount) {

    }
}
