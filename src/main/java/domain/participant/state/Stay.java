package domain.participant.state;

import domain.card.Hands;

public class Stay implements State {

    private Hands hands;
    public Stay(Hands hands) {
        this.hands = hands;
    }

    double calculateWinStatus(State dealerState) {
        if (hands.calculateScore() > dealerState.calculateScore()) {
            return 1;
        }
        return -1;
    }
}
