package domain.participant.state;

import domain.card.Hands;

public class Bust implements State {
    private Hands hands;
    public Bust(Hands hands) {
        this.hands = hands;
    }

    double calculateWinStatus() {
        return -1;
    }
}
