package domain.blackjack;

import domain.participant.Dealer;
import domain.participant.Participant;

public enum WinStatus {

    WIN(1.0),
    LOSE(-1);

    private final double betMultiplier;

    WinStatus(double betMultiplier) {
        this.betMultiplier = betMultiplier;
    }

    public static WinStatus of(Participant participant, Dealer dealer) {
        if (participant.isBust()) {
            return LOSE;
        }
        if (dealer.isBust()) {
            return WIN;
        }
        return isWinnerWhenNotBust(participant, dealer);
    }

    private static WinStatus isWinnerWhenNotBust(Participant participant, Dealer dealer) {
        int participantScore = participant.getScore();
        int dealerScore = dealer.getScore();
        if (participantScore == dealerScore) {
            return isWinnerByCardCount(participant, dealer);
        }
        if (participantScore > dealerScore) {
            return WIN;
        }
        return LOSE;
    }

    private static WinStatus isWinnerByCardCount(Participant participant, Dealer dealer) {
        if (participant.getCardCount() < dealer.getCardCount()) {
            return WIN;
        }
        return LOSE;
    }

    public Double getBetMultiplier() {
        return betMultiplier;
    }
}
