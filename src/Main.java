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
                welcomePage.setBackground(new Color(204, 229, 255)); // Light blue color
                welcomeFrame.setContentPane(welcomePage);
                welcomeFrame.setVisible(true);


                // Create BankPage
                JFrame bankFrame = new JFrame("Bank Page");
                bankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                bankFrame.setSize(300, 200);
                bankFrame.setLocationRelativeTo(null);

                BankPage bankPage = new BankPage(bankFrame);
                bankPage.setBackground(new Color(204, 229, 255)); // Light blue color
                bankFrame.setContentPane(bankPage);

            }
        });
    }
}
