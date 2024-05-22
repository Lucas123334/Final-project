package org.example;

public class Game {
    private int userScore = 0;
    private int computerScore = 0;

    // empty constructor
    public Game(){}

    public void getScore() {
        System.out.println("your score: computer score");
        System.out.println(userScore + ":" + computerScore);
    }

    /**
     * Rock - 1
     * Paper - 2
     * Scissor - 3
     */
    private String generateChoice() {
        int choice = (int) (Math.random() * 3) + 1;
        return switch (choice) {
            case 1 -> "rock";
            case 2 -> "paper";
            case 3 -> "scissor";
            default -> null;
        };
    }

    public void play(String userInput) {
        String computerChoice = generateChoice();
        userInput = userInput.toLowerCase();
        if(userInput.equals(computerChoice))
            System.out.println("tied!");
        else if(userInput.startsWith("r")) {
            if (computerChoice.startsWith("s")) {
                userScore++;
                System.out.println("you won!");
                System.out.println(userInput + ":" + computerChoice);
            }
            else {
                computerScore++;
                System.out.println("you lost...");
                System.out.println(userInput + ":" + computerChoice);
            }
        }
        else if(userInput.startsWith("p")) {
            if (computerChoice.startsWith("r")){
                userScore++;
                System.out.println("you won!");
                System.out.println(userInput + ":" + computerChoice);
            }
            else{
                computerScore++;
                System.out.println("you lost...");
                System.out.println(userInput + ":" + computerChoice);
            }
        }
        else if(userInput.startsWith("s")) {
            if (computerChoice.startsWith("p")){
                userScore++;
                System.out.println("you won!");
                System.out.println(userInput + ":" + computerChoice);
            }
            else{
                computerScore++;
                System.out.println("you lost...");
                System.out.println(userInput + ":" + computerChoice);
            }
        }
    }
}
