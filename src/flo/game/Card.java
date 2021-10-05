package flo.game;

public class Card {
    int value; //comprise entre 1 et 10 le tout en double

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
