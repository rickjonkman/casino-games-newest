package org.rickjonkman;

import org.rickjonkman.blackjack.BlackjackGame;
import org.rickjonkman.higherlowergame.HigherLowerGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputscanner = new Scanner(System.in);
//        HigherLowerGame game = new HigherLowerGame(inputscanner);
//
//        game.playGame();

        BlackjackGame blackjackGame = new BlackjackGame(inputscanner);
        blackjackGame.playGame();
    }
}