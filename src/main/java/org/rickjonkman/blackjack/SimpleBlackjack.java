package org.rickjonkman.blackjack;

import java.util.Scanner;

public class SimpleBlackjack extends BlackjackGame {

    public SimpleBlackjack(Scanner inputscanner, Deck deck, Player player, Dealer dealer) {
        super(inputscanner, deck, player, dealer);
    }

    @Override
    public void runGameLoop() {
        renderTable();
        getNextUserMove();

        if (getDealer().isBust() || getDealer().isStaying() && getPlayer().getHandValue() > getDealer().getHandValue()) {
            System.out.println("Congratulations, you won!");
            BlackjackGame.gameIsRunning = false;
            return;
        }

        if (getPlayer().isBust() || getPlayer().isStaying() && getPlayer().getHandValue() <= getDealer().getHandValue()) {
            System.out.println("Too bad, you lost!");
            gameIsRunning = false;
            return;
        }

        if (!getPlayer().isStaying()) {
            String move = getNextUserMove();
            getPlayer().performMove(getDeck(), move);
        }
    }

    @Override
    public String getNextUserMove() {
        while (true) {
            System.out.println("Do you want to Hit (H) or Stay (S)?");
            String input = inputscanner.nextLine();

            if (input.equalsIgnoreCase("H") || input.equalsIgnoreCase("S")) {
                return input;
            } else {
                System.out.println("Please choose H or S and press enter.");
            }
        }
    }

    @Override
    public void renderTable() {
        System.out.println("---");
        System.out.println("Dealer cards: ");
        System.out.println(getDealer().renderHand());
        System.out.println("---");
        System.out.println("Your cards: ");
        System.out.println(getPlayer().renderHand());
    }
}
