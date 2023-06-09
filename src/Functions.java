import File.BalanceFileWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Functions extends JPanel {
    private JFrame frame;
    private JButton depositButton;
    private JButton withdrawalButton;
    private String accountType;
    private static final double WITHDRAWAL_LIMIT = 20000; // Withdrawal limit constant
    private double accountBalance;


    public Functions(JFrame frame, String accountType) {
        this.frame = frame;
        this.accountType = accountType;
        this.accountBalance =100000;
        setBackground(new Color(230, 230, 230)); // Light gray color
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel(new FlowLayout()); // Use FlowLayout for button panel

        depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createDepositFrame();
            }
        });



        withdrawalButton = new JButton("Withdrawal");
        withdrawalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createWithdrawFrame();
            }
        });

        buttonPanel.add(withdrawalButton);
        buttonPanel.add(depositButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void createDepositFrame() {
        JFrame depositFrame = new JFrame("Deposit");
        depositFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        depositFrame.setSize(300, 150);
        depositFrame.setLocationRelativeTo(frame);

        JPanel depositPanel = new JPanel();
        depositPanel.setLayout(new BoxLayout(depositPanel, BoxLayout.Y_AXIS));

        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountTextField = new JTextField(10);

        JButton submitButton = new JButton("Proceed");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String amountText = amountTextField.getText();
                double amount = Double.parseDouble(amountText);
                deposit(amount);
                depositFrame.dispose();
            }
        });

        depositPanel.add(Box.createVerticalGlue());
        depositPanel.add(amountLabel);
        depositPanel.add(amountTextField);
        depositPanel.add(submitButton);
        depositPanel.add(Box.createVerticalGlue());

        depositFrame.add(depositPanel);
        depositFrame.setVisible(true);
    }

    private void createWithdrawFrame() {
        JFrame withdrawFrame = new JFrame("Withdrawal");
        withdrawFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        withdrawFrame.setSize(300, 150);
        withdrawFrame.setLocationRelativeTo(frame);

        JPanel withdrawPanel = new JPanel();
        withdrawPanel.setLayout(new BoxLayout(withdrawPanel, BoxLayout.Y_AXIS));

        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountTextField = new JTextField(10);

        JButton submitButton = new JButton("Proceed");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String amountText = amountTextField.getText();
                double amount = Double.parseDouble(amountText);

                withdraw(amount);
                withdrawFrame.dispose();
            }
        });

        withdrawPanel.add(Box.createVerticalGlue());
        withdrawPanel.add(amountLabel);
        withdrawPanel.add(amountTextField);
        withdrawPanel.add(submitButton);
        withdrawPanel.add(Box.createVerticalGlue());

        withdrawFrame.add(withdrawPanel);
        withdrawFrame.setVisible(true);
    }

    public static void main(String[] args) {
        BalanceFileWriter myObj = new BalanceFileWriter();
        myObj.withdrawFromSavings(100); // Example withdrawal amount

        // You can call other methods or perform additional operations here.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("FUNCTIONS");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setLocationRelativeTo(null);

                Functions functions = new Functions(frame, "Current Account");
                frame.add(functions);

                frame.setVisible(true);
            }
        });
    }

    private void deposit(double amount) {
        // implement the deposit logic
        // update the balance
        System.out.println("Deposit amount: " + amount);
    }

    private void withdraw(double amount) {
        // implement the withdrawal logic
        // update the balance
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal amount exceeds the limit of " + WITHDRAWAL_LIMIT);
        } else if (amount > accountBalance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            // Process the withdrawal
            accountBalance -= amount;
            System.out.println("Withdrawal amount: " + amount);
            System.out.println("New account balance: " + accountBalance);
        }
    }
    public void writeBalanceToFile(double balance) {
        BalanceFileWriter.writeBalance(balance);
    }


}