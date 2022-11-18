package com.techelevator.models.file_io;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final String FILE_EXTENSION = ".log";
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();

    private final String directory;

    //Constructor
    public Logger(String directory){
        this.directory = directory;
    }

    public void logMessage(String action, String actionAmount, BigDecimal balance){


        // Sets the fileName to be the date in YYYY-MM-DD format
        String fileName = LocalDate.now().format(DateTimeFormatter.ISO_DATE);

        // Sets log file path
        String logFilePath = directory + "/" + fileName + FILE_EXTENSION;

        // Creates new log file, or opens current one
        File logFile = new File(logFilePath);

        // Try with resources to ensure closure of the log file after writing
        try(FileWriter fileWriter = new FileWriter(logFile, true);
            PrintWriter writer = new PrintWriter(fileWriter)){

            //Format dollar amounts
            BigDecimal actionValue = new BigDecimal(actionAmount);

            // Opens the log file and appends the new message
            LocalDateTime now = LocalDateTime.now();

            // Formats the localDateTime to a readable format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formatDateTime = now.format(formatter);

            // Prints the action and values to the log file
            writer.println(formatDateTime + " " + action + ": " + currency.format(actionValue) + " " + currency.format(balance));
        } catch (Exception ex){
            //Swallow the exception
        }
    }
}


