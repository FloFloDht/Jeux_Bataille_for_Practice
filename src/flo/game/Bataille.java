package flo.game;

public class Bataille {

    int nbrOfRound = 10;

    public Bataille(int nbrOfRound) {
        this.nbrOfRound = nbrOfRound;
    }

    public static void main(String[] args) {
        Player player1 = new Player("J1", 0);
        Player player2 = new Player("J2", 0);
    }

}
