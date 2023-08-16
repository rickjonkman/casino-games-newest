package org.rickjonkman.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<Card> cardsInHand;

    public Hand() {
        this.cardsInHand = new ArrayList<>();
    }

    public void addCard(Card card) {
        cardsInHand.add(card);
    }

    public int getTotalValue() {
        return 0;
    }

    public String render() {
        String renderedHand = "";
        for (Card card : cardsInHand) {
            renderedHand = renderedHand + " " + card.render();
        }
        return renderedHand;
    }
}
