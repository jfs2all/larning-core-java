package com.careerit.lcj.day3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

    public static void main(String[] args) {
        int generatedValue = ThreadLocalRandom.current().nextInt(1, 7);
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess the value of dice (1-6):");
            int userValue = sc.nextInt();
            if (generatedValue == userValue) {
                System.out.println("You won the game");
                break;
            } else {
                if (i == 3) {
                    System.out.println("You lost the game and you reached max attempts");
                } else {
                    System.out.println("Wrong guess, try again");
                }
            }
        }
    }
}
