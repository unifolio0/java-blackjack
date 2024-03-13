package view;

import domain.blackjack.BettingResult;
import domain.card.Card;
import domain.participant.*;

import java.util.List;

public class OutputView {

    private static final OutputFormat outputFormat = new OutputFormat();

    private OutputView() {

    }

    public static void printBeginDealingInformation(Participants participants) {
        System.out.println();
        System.out.printf(outputFormat.formatParticipantNames(participants));
        System.out.println();
        System.out.println();
    }

    public static void printDealerHands(Dealer dealer) {
        Name name = dealer.getName();
        List<Card> cards = dealer.getCards();
        System.out.printf("%s카드: %s", name.getValue(), outputFormat.formatCard(cards.get(0)));
        System.out.println();
    }

    public static void printParticipantHands(Participant participant) {
        System.out.printf(outputFormat.formatHands(participant));
        System.out.println();
    }

    public static void printDealerHit(int count) {
        System.out.println();
        for(int i = 0; i < count; i++) {
            System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
            System.out.println();
        }
    }

    public static void printParticipantResult(Participant participant) {
        System.out.printf(outputFormat.formatParticipantResult(participant));
        System.out.println();
    }

    public static void printBlackJackResult(BettingResult bettingResult) {
        System.out.println();
        System.out.println("## 최종 수익");
        System.out.printf(outputFormat.formatDealerResult(bettingResult));
        System.out.println();

        for (Participant participant : bettingResult.getParticipants()) {
            System.out.println(outputFormat.formatBlackJackResult(participant, bettingResult.getPayout(participant)));
        }
    }

    public static void printBeginDealingInformation2(Players players) {
        System.out.println();
        System.out.printf(outputFormat.formatParticipantNames2(players));
        System.out.println();
        System.out.println();
    }

    public static void printParticipantHands2(Player player) {
        System.out.printf(outputFormat.formatHands2(player));
        System.out.println();
    }

    public static void printDealerHands2(Dealer2 dealer2) {
        Name name = dealer2.getName();
        List<Card> cards = dealer2.getCards();
        System.out.printf("%s카드: %s", name.getValue(), outputFormat.formatCard(cards.get(0)));
        System.out.println();
    }

    public static void printDealerHit2() {
        System.out.println();
        System.out.println("딜러는 16이하라 한장의 카드를 더 받았습니다.");
        System.out.println();
    }

    public static void printParticipantResult2(Participant2 participant2) {
        System.out.printf(outputFormat.formatParticipantResult2(participant2));
        System.out.println();
    }
}
