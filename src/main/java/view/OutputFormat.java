package view;

import domain.card.Card;
import domain.participant.*;

import java.util.ArrayList;
import java.util.List;

public class OutputFormat {

    private static final String DELIMITER = ", ";

    public String formatCard(Card card) {
        return RankFormat.from(card.getRank()).getName() + ShapeFormat.from(card.getShape()).getName();
    }

    public String formatParticipantNames(Players players) {
        List<Name> names = players.getNames();
        List<String> playerNames = new ArrayList<>();
        for (Name name : names) {
            playerNames.add(name.getValue());
        }
        return String.format("딜러와 %s에게 2장을 나누었습니다.", String.join(DELIMITER, playerNames));
    }

    public String formatHands(Participant participant) {
        Name name = participant.getName();
        List<Card> cards = participant.getCards();
        List<String> cardNames = new ArrayList<>();
        for (Card card : cards) {
            cardNames.add(formatCard(card));
        }
        return String.format("%s카드: %s", name.getValue(), String.join(DELIMITER, cardNames));
    }

    public String formatParticipantResult(Participant participant) {
        return String.format("%s - 결과: %d", formatHands(participant), participant.getScore());
    }
}
