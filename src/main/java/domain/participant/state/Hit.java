package domain.participant.state;

import domain.card.Card;
import domain.card.Hands;

import java.util.List;

public class Hit implements State {

    private Hands hands;

    public Hit(Hands hands) {
        this.hands = hands;
    }

    State stay() {
        return new Stay(hands);
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
        hands.receive(card);
        if (hands.calculateScore() > 21) {
            return new Bust(hands);
        }
        return new Hit(hands);
    }

    @Override
    public boolean isHit() {
        return true;
    }
}
