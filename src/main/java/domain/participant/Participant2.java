package domain.participant;

import domain.card.Card;
import domain.card.Hands;
import domain.participant.state.BlackJack;
import domain.participant.state.Hit;
import domain.participant.state.State;

public class Participant2 {
    private State state;
    private Name name;

    public Participant2(Name name) {
        this.name = name;
    }

    public void setting(Card card1, Card card2) {
        Hands hands = new Hands();
        hands.receive(card1);
        hands.receive(card2);
        if (hands.calculateScore() == 21) {
            this.state = new BlackJack(hands);
            return;
        }
        this.state = new Hit(hands);
    }

    public Name getName() {
        return name;
    }
}
