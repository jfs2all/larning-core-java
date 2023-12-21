package com.careerit.lcj.day8;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample2 {

    public static void main(String[] args) {
        System.out.println("Start of main method");
        Scanner sc = null;
        try {
            sc = new Scanner(ExceptionExample2.class.getResourceAsStream("/usernames.csv"));
            while(sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line.substring(0,3));
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("File not found");
            e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally{
            if(sc != null){
                System.out.println("Closing the scanner");
                sc.close();
            }
        }
        System.out.println("End of main method");
    }
}
