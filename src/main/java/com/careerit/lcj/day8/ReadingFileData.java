package com.careerit.lcj.day8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingFileData {

    private static final String FILE_NAME = "/usernames.csv";

    public static void main(String[] args)  {
        System.out.println("Start of main method");
        // Read the file data and print the data
        try {
            List<String> namesList = Files.readAllLines(Path.of(ReadingFileData.class.getResource(FILE_NAME).getPath()));
            for (String name : namesList) {
                System.out.println(name);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("End of main method");
    }
}
