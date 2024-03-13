package domain.participant.state;

import domain.card.Card;

import java.util.List;

public interface State {
    default boolean isBlackJack() {
        return false;
    }

    int calculateScore();

    List<Card> getCards();

    State receiveCard(Card card);

    default boolean isHit() {
        return false;
    }
}
