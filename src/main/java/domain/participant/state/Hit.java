package domain.participant.state;

import domain.card.Card;
import domain.card.Hands;

public class Hit implements State {

    private Hands hands;

    public Hit(Hands hands) {
        this.hands = hands;
    }

    State receiveCard(Card card) {
        hands.receive(card);
        if (hands.calculateScore() > 21) {
            return new Bust(hands);
        }
        return this;
    }

    State stay() {
        return new Stay(hands);
    }
}
