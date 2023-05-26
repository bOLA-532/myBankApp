package File;

import java.io.*;

public class BalanceFileWriter {
    public static void main(String[] args) {
        BalanceFileWriter myObj = new BalanceFileWriter();
        double balance = 100000; // Example balance value
        myObj.withdrawFromSavings(200); // Example withdrawal amount

        // Call the writeData method and pass the balance value
        myObj.writeData("My file",balance);
    }

    public static void writeBalance(double balance) {
        try {
            FileWriter writer = new FileWriter("balance.txt");
            writer.write("Current balance: " + balance);
            writer.close();
            System.out.println("Balance saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }

    public void writeData(String data, double balance) {
        try {
            File myFile = new File("balance.txt");
            FileWriter writeToFile = new FileWriter(myFile);
            writeToFile.write(data + "\n");
            writeToFile.write("Current balance: " + balance);
            writeToFile.flush();
            writeToFile.close();
            System.out.println("Data saved to file.");
        } catch (IOException ioException) {
            System.out.println("Cannot write to this file");
        }
    }

    public void withdrawFromSavings(double amount) {
        double currentBalance = 100000; // Read the current balance from a source, e.g., a file or database.
        double newBalance = currentBalance - amount;

        // Perform other withdrawal-related operations if needed.

        // Update the balance in the file.
        writeBalance(newBalance);

        // Display the updated balance.
        System.out.println("New balance after withdrawal: " + newBalance);
    }
}
