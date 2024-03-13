package view;

import domain.card.Card;
import domain.participant.*;

import java.util.List;

public class OutputView {

    private static final OutputFormat outputFormat = new OutputFormat();

    private OutputView() {

    }

    public static void printBeginDealingInformation(Players players) {
        System.out.println();
        System.out.printf(outputFormat.formatParticipantNames(players));
        System.out.println();
        System.out.println();
    }

    public static void printParticipantHands(Player player) {
        System.out.printf(outputFormat.formatHands(player));
        System.out.println();
    }

    public static void printDealerHands(Dealer dealer) {
        Name name = dealer.getName();
        List<Card> cards = dealer.getCards();
        System.out.printf("%s카드: %s", name.getValue(), outputFormat.formatCard(cards.get(0)));
        System.out.println();
    }

    public static void printDealerHit() {
        System.out.println();
        System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
        System.out.println();
    }

    public static void printParticipantResult(Participant participant) {
        System.out.printf(outputFormat.formatParticipantResult(participant));
        System.out.println();
    }

    public static void printBlackJackResult(Dealer dealer, Players players) {
        System.out.println();
        System.out.println("## 최종 수익");
        System.out.printf(outputFormat.formatDealerResult(dealer, players));
        System.out.println();

        for (Player player : players.getValue()) {
            System.out.println(outputFormat.formatBlackJackResult(dealer, player));
        }
    }
}
