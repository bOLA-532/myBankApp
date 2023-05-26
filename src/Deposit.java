import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JButton {
    private Accounts accounts;

    public Deposit(Accounts account) {
        super("Deposit");
        this.accounts = account;

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String deposit = JOptionPane.showInputDialog("Enter a deposit amount");
                if (deposit != null){
                    double amount = Double.parseDouble(deposit);
                  //  account.deposit(amount);
                }
            }
        });

    }

}

