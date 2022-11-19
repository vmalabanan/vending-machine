package com.techelevator.models.file_io;

import com.techelevator.application.VendingMachine;
import com.techelevator.models.Inventory;
import com.techelevator.models.products.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class
SalesReportPrinter {

    private static final String FILE_EXTENSION = ".txt";
    private static final String FILE_TYPE = "TotalSalesReport";
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();

    private final String directory;

    //Constructor
    public SalesReportPrinter(String directory){

        this.directory = directory;

        if (!checkReportExists()){
            generateNewReport();
        }
    }

    public void logSale(Product product){


        // Sets log file path
        String salesFilePath = directory + "/" + FILE_TYPE + FILE_EXTENSION;

        // Copies the sales report so that it can read from the copy and write to the master
        try {
            Files.copy(Path.of(salesFilePath), Path.of((salesFilePath + "_old")));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
            // Creates new log file, or opens current one
        File readFile = new File(salesFilePath + "_old");
        File writeFile = new File(salesFilePath);

        try (Scanner reader = new Scanner(readFile);
             PrintWriter writer = new PrintWriter(writeFile)){

            String searchItem = product.getName();
            // Reads through the entire file
            while (reader.hasNextLine()){
                String line = reader.nextLine();

                // Searches each line for the sold product
                if (line.contains(searchItem)){

                    // Increments the quantity sold of the product
                    String[] products = line.split("\\|");
                    int quantity = Integer.parseInt(products[1]);
                    quantity++;
                    products[1] = String.valueOf(quantity);
                    line = products[0] + "|" + (products[1]);
                }

                // Searches the document for the total and updates it with the price of the purchaseMenu
                 else if (line.contains("TOTAL SALES")){
                    String[] totalSales = line.split("\\$");
                    BigDecimal sales = new BigDecimal(totalSales[1]);
                    sales = sales.add(product.getPrice());

                    totalSales[1] = currency.format(sales);
                    line = Arrays.toString(totalSales);
                    line = line.replace("[", "");
                    line = line.replace("]","");
                    line = line.replace(", ", "");
                }

                // Writes either the unaffected line, or the incremented line to the sales report
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            // Swallow the exception
        } finally {
            readFile.delete();
        }

    }

    public void printReport() {

        // Timestamps the created file
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());

        // creates paths for files
        String readFilePath = directory + "/" + FILE_TYPE + FILE_EXTENSION;
        String copyFilePath = directory + "/" + timeStamp + FILE_TYPE + FILE_EXTENSION;
        Path original = Path.of(readFilePath);
        Path copy = Path.of(copyFilePath);

        // Copies the sales report so that it can read from the copy and write to the master
        try{
            Files.copy(original, copy);
        } catch (Exception ex) {
            System.out.println("Could not create print file");
        }

    }

    // Checks if the total sales report exists
    public boolean checkReportExists(){
        String salesFilePath = directory + "/" + FILE_TYPE + FILE_EXTENSION;
        return Files.exists(Path.of(salesFilePath));
    }

    // Generates an empty sales report
    public void generateNewReport(){

        String salesFilePath = directory + "/" + FILE_TYPE + FILE_EXTENSION;
        File writeFile = new File(salesFilePath);

        try (PrintWriter writer = new PrintWriter(writeFile)){

            List<Product> inventory = Inventory.getOrganizedProducts();

            for (Product product : inventory){

                String name = product.getName();
                String quantity = "0";

                writer.println(name + "|" + quantity);
            }

            writer.println();
            writer.println();
            writer.println("**TOTAL SALES** $0.00");

        } catch (Exception ex){
            // Swallow exception
        }

    }
}
