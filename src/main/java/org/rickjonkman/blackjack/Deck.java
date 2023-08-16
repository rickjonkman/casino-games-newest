package org.rickjonkman.blackjack;



public abstract class Deck {

    public Deck() {
        // 1. Maak een array van int (12 kaarten)
        // 2. Maak een array van String (12 kaarten)
        // 3. Voeg deze samen met een forloop en zet ze in een ArrayList van CardValue
        // 4. Maak een forloop waarin per CardSuit elke CardValue wordt toegevoegd aan Card
        // 5. Voeg deze array toe aan de Stack
    }

    abstract void shuffle();

    abstract Card getNextCard();

    public boolean isEmpty() {
        return true;
    }
}
