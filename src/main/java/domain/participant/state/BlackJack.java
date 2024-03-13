package domain.participant.state;

import domain.card.Card;
import domain.card.Hands;

import java.util.List;

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

    @Override
    public boolean isBlackJack() {
        return true;
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
