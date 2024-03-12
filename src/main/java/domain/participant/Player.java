package domain.participant;

import domain.blackjack.BetAmount;

public class Player extends Participant2 {

    private BetAmount betAmount;

    public Player(Name name, BetAmount betAmount) {
        super(name);
        this.betAmount = betAmount;
    }
}
