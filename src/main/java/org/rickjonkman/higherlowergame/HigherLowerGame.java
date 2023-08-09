package org.rickjonkman.higherlowergame;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGame {
    Scanner inputscanner;
    private boolean gameIsRunning = false;
    private int numberOfTurns;

    public HigherLowerGame(Scanner inputscanner) {
        this.inputscanner = inputscanner;
    }

    public void playGame() {
        gameIsRunning = true;

        System.out.println("Welcome to the Higher or Lower Game.");
        System.out.println("Please guess the secret number between 1 and 100 in the least number of turns as possible.");
        System.out.println("The game starts now!");

        createRandomNumber();
        int randomNumber = createRandomNumber();
        playerGuess();
        int guess = playerGuess();

        while (gameIsRunning) {
            if (randomNumber == guess) {
                System.out.println("You guessed the secret number in "+numberOfTurns+" turns. You won!");
                gameIsRunning = false;
            } else if (randomNumber < guess) {
                System.out.println("The secret number is lower. Please try again.");
                turnCounter();
                playerGuess();
            } else {
                System.out.println("The secret number is higher. Please try again.");
                turnCounter();
                playerGuess();
            }
        }

    }

    public int createRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public void turnCounter() {
        numberOfTurns++;
    }

    public int playerGuess() {
        return inputscanner.nextInt();
    }
}
