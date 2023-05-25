import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdraw extends JButton {
    public Accounts accounts;

    public Withdraw(Accounts account) {
        super("Withdraw");
        this.accounts = account;

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String withdraw = JOptionPane.showInputDialog("Enter a withdrawal amount");
                if (withdraw != null) {
                    try {
                        double amount = Double.parseDouble(withdraw);
                        account.withdraw(amount);
                        JOptionPane.showMessageDialog(null, "Withdrawal successful");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid withdrawal amount");
                    }
                }
            }
        });
    }

    // Additional methods can be added here

    // Example of an additional method that performs additional validation before withdrawal
    public void performWithdrawal(double amount) {
        if (amount <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid withdrawal amount. Amount must be greater than 0");
        } else {
            Accounts account = null;
            account.withdraw(amount);
            JOptionPane.showMessageDialog(null, "Withdrawal successful");
        }
    }


    //Sets the account for this instance.
    public void setAccount(Accounts account) {
        this.accounts = account;
    }
}
