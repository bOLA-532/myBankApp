package File;

import java.io.*;
import java.util.Scanner;

//
import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;
//
//public class BalanceFileWriter  {
//    private static final String FILE_PATH = "balance.txt";
//    public static void writeBalance(double balance) {
//        try{
//            FileWriter writer = new FileWriter(FILE_PATH);
//            writer.write("Current balance: " + balance);
//            writer.close();
//            System.out.println("Balance saved to file.");
//        } catch (IOException e) {
//            System.out.println("An error occured while writing to file: " + e.getMessage());
//        }
//
//    }
//
//}
public class BalanceFileWriter{
    public static void main(String[] args){
        BalanceFileWriter myObj = new BalanceFileWriter();
        myObj.withdrawFromSavings(100); // Example withdrawal amount

        // You can call other methods or perform additional operations here
        myObj.writeData("My file");
        myObj.appendData("Create Space");
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


    public void appendData(String data){
        try {
            File myFile = new File("balance.txt");

            FileWriter fileWriter = new FileWriter(myFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.print(data);
            printWriter.println("More Money More Problems");
            printWriter.println("No Money No Problems");
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException ioException){
            System.out.println("aa");
        }
    }

    public void writeData(String data) {
        try {
            File myFile = new File("balance.txt");
            FileWriter writeToFile = new FileWriter(myFile);
            writeToFile.write(data);
            writeToFile.append("More Text");
            writeToFile.flush();
            writeToFile.close();
        } catch (IOException ioException) {
            System.out.println("Cannot write to this file");
        }

    }


//    public void  readFromFile(){
//        File myFile = new File("balance.txt");
//        try {
//            Scanner myReader = new Scanner(myFile);
//            while (myReader.hasNext()){
//                String dataInFile = myReader.nextLine();
//                System.out.println(dataInFile);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("file does not exist");;
//        }
//
//    }
    public void withdrawFromSavings(double amount) {
        double currentBalance = 0; // Read the current balance from a source, e.g., a file or database.
        double newBalance = currentBalance - amount;

        // Perform other withdrawal-related operations if needed.

        // Update the balance in the file.
        writeBalance(newBalance);

        // Display the updated balance.
        System.out.println("New balance after withdrawal: " + newBalance);
    }

}
