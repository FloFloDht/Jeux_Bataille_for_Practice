package flo.game;

import java.util.ArrayList;

public class Deck {

    //paquet de carte, contient un total de 20 cartes
    ArrayList<Card> deck = new ArrayList<>();

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }
}
