package org.rickjonkman.blackjack;

public class Dealer {
    Hand dealerHand;

    public Dealer() {
        this.dealerHand = new Hand();
    }

    public void performMove(Deck deck) {

    }

    public void addCardsToHand(Card... cards) {
        for (Card card : cards) {
            dealerHand.addCard(card);
        }
    }

    public boolean isStaying() {
        return true;
    }

    public boolean isBust() {
        return true;
    }

    public int getHandValue() {
        return 0;
    }

    public String renderHand() {
        return dealerHand.render();
    }
}
