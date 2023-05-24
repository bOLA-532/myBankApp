import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavingsAccount extends Accounts{
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

            savingsButton= new JButton("Savings Account");
            savingsButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });
            buttonPanel.add(savingsButton);
            add(myAccountTypeLabel, BorderLayout.CENTER);
            add(buttonPanel,BorderLayout.SOUTH);
        }
    }

