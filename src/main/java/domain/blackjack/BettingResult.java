package domain.blackjack;

import domain.participant.Dealer;
import domain.participant.Participant;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BettingResult {

    private final Map<Participant, BetAmount> bet;
    private final Dealer dealer;

    public BettingResult(LinkedHashMap<Participant, BetAmount> bet, Dealer dealer) {
        this.bet = bet;
        this.dealer = dealer;
    }

    public double getPayout(Participant participant) {
        //return bet.get(participant).getBetAmount() * dealer.isWinner(participant).getBetMultiplier();
        return bet.get(participant).mul(dealer.isWinner(participant));
    }

    public double getDealerPayout() {
        double total = 0;
        for (Participant participant : bet.keySet()) {
            total += getPayout(participant);
        }
        return total * -1;
    }

    public Set<Participant> getParticipants() {
        return bet.keySet();
    }
}
