package org.rickjonkman.blackjack;

public class Player {
    Hand playerHand;
    private boolean staying;

    public Player() {
        this.playerHand = new Hand();
    }

    public void performMove(Deck deck, String move) {
        if (move.equalsIgnoreCase("H")) {
            System.out.println("You chose to HIT.");
            playerHand.addCard(deck.getNextCard());
        } else if (move.equalsIgnoreCase("S")) {
            System.out.println("You chose to STAY.");
            this.staying = true;
        }
    }

    public void addCardsToHand(Card... cards) {
        for (Card card : cards) {
            playerHand.addCard(card);
        }
    }

    public boolean isStaying() {
        return staying;
    }

    public boolean isBust() {
        return true;
    }

    public int getHandValue() {
        return 0;
    }

    public String renderHand() {
        return playerHand.render();
    }


}
