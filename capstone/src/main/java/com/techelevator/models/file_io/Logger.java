package com.techelevator.models.file_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static final String FILE_EXTENSION = ".log";

    private String directory;

    //Constructor
    public Logger(String directory){
        this.directory = directory;
    }

    public void logMessage(String message){

        // Sets the fileName to be the date in YYYY-MM-DD format
        String fileName = LocalDate.now().format(DateTimeFormatter.ISO_DATE);
        String logFilePath = directory + "/" + fileName + FILE_EXTENSION;
        File logFile = new File(logFilePath);

        // Try with resources to ensure closure of the log file after writing
        try(FileWriter fileWriter = new FileWriter(logFile, true);
            PrintWriter writer = new PrintWriter(fileWriter)){

            // Opens the log file and appends the new message
            String timeStamp = LocalDate.now().toString();
            writer.println(timeStamp + " " + message);
        } catch (IOException ex){
            //Swallow the exception
        }
    }
}


