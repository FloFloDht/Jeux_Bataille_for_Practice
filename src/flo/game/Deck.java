package flo.game;

import java.util.ArrayList;

public class Deck {

    int nbreOfCards;
    ArrayList<Card> deck = new ArrayList<>(); // liste de cartes

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Deck(int nbreOfCards, ArrayList<Card> deck) {
        this.nbreOfCards = nbreOfCards;
        this.deck = deck;
    }

    public int getNbreOfCards() {
        return nbreOfCards;
    }

    public void setNbreOfCards(int nbreOfCards) {
        this.nbreOfCards = nbreOfCards;
    }
}
