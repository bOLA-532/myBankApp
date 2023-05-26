import java.io.FileWriter;
import java.io.IOException;

public class BalanceFileWriter {
    private static final String FILE_PATH = "balance.txt";
    public static void writebalance(double balance) {
        try{
            FileWriter writer = new FileWriter(FILE_PATH);
            writer.write("Current balance: " + balance);
            writer.close();
            System.out.println("Balance saved to file.");
        } catch (IOException e) {
            System.out.println("An error occured while writing to file: " + e.getMessage());
        }

    }

}

