package com.careerit.lcj.day8;

import com.careerit.lcj.day6.one.A;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ExceptionExample3 {
    private static final String FILE_NAME = "/usernames.csv";
    public static void main(String[] args) {

        System.out.println("Start of main method");
            try{
                List<String> names = readData();
                for (String name : names) {
                    try {
                        System.out.println(name.substring(0, 3));
                    }catch (StringIndexOutOfBoundsException e){
                        System.out.println("Name is not valid");
                        e.printStackTrace();
                    }
                }
                //names = null;
                System.out.println(names.size());

            }catch (IOException e){
                System.out.println("File not found");
                e.printStackTrace();
            }catch (Exception e) {
                e.printStackTrace();
            }
        System.out.println("End of main method");
    }

    public static List<String> readData()throws IOException{
        List<String> namesList = new ArrayList<>();
        namesList = Files.readAllLines(Path.of(ReadingFileData.class.getResource(FILE_NAME).getPath()));
        return namesList;
    }
}
