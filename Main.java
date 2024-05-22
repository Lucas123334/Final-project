package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner input = new Scanner(System.in);
        System.out.println("---------- Commands ----------");
        System.out.println("stop game: end");
        System.out.println("check score: score");
        while (true){
            System.out.println("input: ");
            String decision = input.next();
            if (decision.equals("score")) game.getScore();
            else if (decision.equals("end")) {
                game.getScore();
                System.exit(0);
            } else {
                game.play(decision);
            }
        }
    }
}
