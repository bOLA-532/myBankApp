import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavingsAccount extends Accounts {
    private static final double WITHDRAWAL_LIMIT = 20000.0;
    private double balance;

    private final JButton savingsButton;
    private JButton SavingsButtonButton;


    public SavingsAccount() {
        super();
        balance = 100000.0;


        JLabel myAccountTypeLabel = new JLabel("Pick Your Account Type");
        myAccountTypeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        myAccountTypeLabel.setHorizontalAlignment(JLabel.CENTER);


        JPanel buttonPanel = new JPanel(new FlowLayout()); // Use FlowLayout for button panel

        savingsButton = new JButton("Savings Account");
        savingsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                withdraw(20000.0);

            }
        });
        buttonPanel.add(savingsButton);
        add(myAccountTypeLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void Withdrawal(double amount) {
        if (amount <= WITHDRAWAL_LIMIT) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("withdrawal amount:" + amount);
                System.out.println("New balance:" + balance);

            } else {
                System.out.println("Insufficient funds");
            }
        }else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

