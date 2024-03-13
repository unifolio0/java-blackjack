package domain.participant;

import domain.blackjack.Deck;
import domain.card.Card;

public class Dealer extends Participant {

    private Deck deck;

    public Dealer() {
        super(new Name("딜러"));
        this.deck = new Deck();
    }

    public Card draw() {
        return deck.draw();
    }

    @Override
    public void receiveCard(Card card) {
        state.receiveCard(card);
        if (state.calculateScore() > 16) {
            state = state.stay();
        }
        if (state.calculateScore() > 21) {
            state = state.bust();
        }
    }
}
