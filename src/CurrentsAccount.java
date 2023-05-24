import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrentsAccount extends Accounts {

    private JButton currentsButton;


    public CurrentsAccount() {
        super();


        JLabel myAccountTypeLabel = new JLabel("Pick Your Account Type");
        myAccountTypeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        myAccountTypeLabel.setHorizontalAlignment(JLabel.CENTER);


        JPanel buttonPanel = new JPanel(new FlowLayout()); // Use FlowLayout for button panel

        currentsButton = new JButton("Currents Account");
        currentsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
