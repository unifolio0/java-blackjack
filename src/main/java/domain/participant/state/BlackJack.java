package domain.participant.state;

import domain.card.Hands;

public class BlackJack implements State {

    private Hands hands;

    public BlackJack(Hands hands) {
        this.hands = hands;
    }

    double calculateWinStatus(State dealerState) {
        if (dealerState.isBlackJack()) {
            return 1.5;
        }
        return 0;
    }
}
