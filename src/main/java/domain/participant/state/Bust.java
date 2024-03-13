package domain.participant.state;

import domain.card.Card;
import domain.card.Hands;

import java.util.List;

public class Bust implements State {
    private Hands hands;
    public Bust(Hands hands) {
        this.hands = hands;
    }

    double calculateWinStatus() {
        return -1;
    }

    @Override
    public int calculateScore() {
        return hands.calculateScore();
    }

    @Override
    public List<Card> getCards() {
        return hands.getValue();
    }

    @Override
    public State receiveCard(Card card) {
        throw new IllegalArgumentException("드로우 못 함");
    }
}
