package org.rickjonkman.blackjack;

import java.util.Scanner;

public abstract class BlackjackGame {
    Scanner inputscanner;
    public static boolean gameIsRunning = false;
    private Deck deck;
    private Player player;
    private Dealer dealer;

    public BlackjackGame(Scanner inputscanner, Deck deck, Player player, Dealer dealer) {
        this.inputscanner = inputscanner;
        this.deck = new Deck();
        this.player = new Player();
        this.dealer = new Dealer();
    }

    public void playGame() {
        gameIsRunning = true;
        System.out.println("Welcome to Blackjack!");

        deck.shuffle();
        player.addCardsToHand(deck.getNextCard(), deck.getNextCard());
        dealer.addCardsToHand(deck.getNextCard());

        while (gameIsRunning) {
            runGameLoop();
        }
    }

    abstract void runGameLoop();

    abstract String getNextUserMove();

    abstract void renderTable();

    public Deck getDeck() {
        return deck;
    }

    public Player getPlayer() {
        return player;
    }

    public Dealer getDealer() {
        return dealer;
    }
}
