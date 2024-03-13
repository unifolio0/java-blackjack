package domain.participant.state;

import domain.card.Card;
import domain.card.Hands;
import domain.participant.Dealer;

import java.util.List;

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

    @Override
    public double getProfit(Dealer dealer) {
        if (hands.calculateScore() == dealer.getScore() && !dealer.isBlackJack()) {
            return 0;
        }
        if (hands.calculateScore() < dealer.getScore()) {
            return -1;
        }
        return 1;
    }

    @Override
    public State stay() {
        throw new IllegalArgumentException("stay 금지");
    }

    @Override
    public State bust() {
        return new Bust(hands);
    }
}
