package domain.participant;

import domain.card.Card;
import domain.card.Hands;
import domain.participant.state.BlackJack;
import domain.participant.state.Hit;
import domain.participant.state.State;

import java.util.List;

public class Participant {
    protected State state;
    private Name name;

    public Participant(Name name) {
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

    public List<Card> getCards() {
        return state.getCards();
    }

    public boolean isHit() {
        return state.isHit();
    }

    public void receiveCard(Card card) {
        this.state = state.receiveCard(card);
    }

    public int getScore() {
        return state.calculateScore();
    }

    public boolean isBlackJack() {
        return state.isBlackJack();
    }

    public void stay() {
        this.state = state.stay();
    }
}
