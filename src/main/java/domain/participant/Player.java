package domain.participant;

import domain.blackjack.BetAmount;

public class Player extends Participant {

    private BetAmount betAmount;

    public Player(Name name, BetAmount betAmount) {
        super(name);
        this.betAmount = betAmount;
    }

    public int getProfit(Dealer dealer) {
        return (int) betAmount.calculateProfit(state.getProfit(dealer));
    }
}
