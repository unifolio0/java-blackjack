package domain.participant;

import domain.blackjack.BetAmount;

public class Player extends Participant {

    private BetAmount betAmount;

    public Player(Name name, BetAmount betAmount) {
        super(name);
        this.betAmount = betAmount;
    }
}
