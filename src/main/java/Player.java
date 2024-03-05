import java.util.ArrayList;
import java.util.List;

public class Player {

    private static final int ADDITIONAL_SCORE = 10;
    private static final int BLACK_JACK_COUNT = 21;
    private List<Card> cards;

    public Player( ) {
        this.cards = new ArrayList<>();
    }

    public void receiveCard(Card card) {
        cards.add(card);
    }

    public int calculateScore() {

        int totalScore = 0;
        for (Card card : cards) {
            totalScore += card.getScore();
        }

        if (hasAce()) {
            totalScore = calculateAceScore(totalScore);
        }
        return totalScore;
    }

    private int calculateAceScore(int totalScore) {
        if (totalScore + ADDITIONAL_SCORE <= BLACK_JACK_COUNT) {
            totalScore = totalScore + ADDITIONAL_SCORE;
        }
        return totalScore;
    }

    public boolean hasAce() {
        return cards.stream()
                .anyMatch(card -> 1 == card.getScore());
    }
}
