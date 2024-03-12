package domain.participant;

import domain.blackjack.Deck;

public class Dealer2 extends Participant2 {

    private Deck deck;

    public Dealer2() {
        super(new Name("딜러"));
        this.deck = new Deck();
    }
}
