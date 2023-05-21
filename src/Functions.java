import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Functions extends JPanel {
    private JFrame frame;
    private JButton depositButton;
    private JButton withdrawalButton;
    public Functions(JFrame frame) {
        this.frame = frame;
        setBackground(new Color(230, 230, 230)); // Light gray color
        setLayout(new BorderLayout());


        JPanel buttonPanel = new JPanel(new FlowLayout()); // Use FlowLayout for button panel

        depositButton = new JButton("Deposit");
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll(); // Remove the current content
                frame.revalidate(); // Refresh the frame
            }
        });

        withdrawalButton = new JButton("Withdrawal");
        withdrawalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll(); // Remove the current content
                frame.revalidate(); // Refresh the frame

            }
        });
        buttonPanel.add(withdrawalButton);
        buttonPanel.add(depositButton);


        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("FUNCTIONS");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.setLocationRelativeTo(null);

                Functions functions = new Functions(frame);
                frame.add(functions);

                frame.setVisible(true);
            }
        });
    }

    public void deposit(double amount) {

    }
}

