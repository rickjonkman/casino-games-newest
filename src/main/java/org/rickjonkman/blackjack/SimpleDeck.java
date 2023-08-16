package org.rickjonkman.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SimpleDeck extends Deck {
    Stack<Card> simpleDeckCards = new Stack<>();

    public SimpleDeck() {
        ArrayList<CardValue> simpleDeckValues = new ArrayList<>();

        int[] simpleDeckValueNumbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        String[] simpleDeckValueNames = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};

        CardSuit[] suits = new CardSuit[]{
                new CardSuit("diamonds", '\u2666', "red"),
                new CardSuit("spades", '\u2660', "Black"),
                new CardSuit("hearts", '\u2665', "red"),
                new CardSuit("clubs", '\u2663', "black")
        };

        for (int i = 0; i < simpleDeckValueNumbers.length; i++) {
            simpleDeckValues.add(new CardValue(simpleDeckValueNames[i], simpleDeckValueNumbers[i]));
        }

        for (CardSuit suit : suits) {
            for (CardValue value : simpleDeckValues) {
                Card card = new Card(suit, value);
                simpleDeckCards.add(card);
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(simpleDeckCards);
    }

    @Override
    public Card getNextCard() {
        return simpleDeckCards.pop();
    }

}
