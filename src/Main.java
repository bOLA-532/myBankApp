import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create WelcomePage
                JFrame welcomeFrame = new JFrame("Welcome");
                welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                welcomeFrame.setSize(300, 200);
                welcomeFrame.setLocationRelativeTo(null);

                WelcomePage welcomePage = new WelcomePage(welcomeFrame);
                welcomeFrame.add(welcomePage);

                // Create BankPage
                JFrame bankFrame = new JFrame("Bank Page");
                bankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                bankFrame.setSize(300, 200);
                bankFrame.setLocationRelativeTo(null);

                BankPage bankPage = new BankPage(bankFrame);
                bankFrame.add(bankPage);

                // Show the WelcomePage
                welcomeFrame.setVisible(true);
            }
        });
    }
}
