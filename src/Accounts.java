import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Accounts extends JPanel {
    private JFrame frame;
    private JLabel myAccountTypeLabel;
    private JButton savingsButton;
    private JButton currentsButton;

    public Accounts() {
        setBackground(new Color(230, 230, 230)); // Light gray color
        setLayout(new BorderLayout());

        myAccountTypeLabel = new JLabel("Pick Your Account Type");
        myAccountTypeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        myAccountTypeLabel.setHorizontalAlignment(JLabel.CENTER);
        JPanel buttonPanel = new JPanel(new FlowLayout()); // Use FlowLayout for button panel

        currentsButton = new JButton("Currents Account");
        currentsButton.setPreferredSize(new Dimension(150, 50)); // Set preferred size for savings button
        currentsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame accountsFrame = new JFrame("Currents Account");
                accountsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                accountsFrame.setSize(300, 200);
                accountsFrame.setLocationRelativeTo(null);

                Functions functions = new Functions(accountsFrame, "Currents Account");
                accountsFrame.add(functions);

                accountsFrame.setVisible(true);
            }
        });

        savingsButton = new JButton("Savings Account");
        savingsButton.setPreferredSize(new Dimension(150, 50)); // Set preferred size for savings button
        savingsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame accountsFrame = new JFrame("Savings Account");
                accountsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                accountsFrame.setSize(300, 200);
                accountsFrame.setLocationRelativeTo(null);

                Functions functions = new Functions(accountsFrame, "Savings Account");
                accountsFrame.add(functions);

                accountsFrame.setVisible(true);
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

                Accounts accounts = new Accounts();
                frame.add(accounts);

                frame.setVisible(true);
            }
        });
    }
}
