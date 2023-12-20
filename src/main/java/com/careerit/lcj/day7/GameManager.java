package com.careerit.lcj.day7;

import java.util.Scanner;

public class GameManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Bike 2.Car 3.Ship 4.ToyGame");
        int ch = sc.nextInt();
        Game game = getGame(ch);
        game.start();
        game.play();
        game.stop();

    }

    public static Game getGame(int ch) {
    	return switch (ch) {
                    case 1-> new Bike();
                    case 2-> new Car();
                    case 3-> new Ship();
                    case 4-> new ToyGame();
                    default -> throw new IllegalArgumentException("Invalid choice");
        };
    }
}
