package domain.blackjack;

import domain.participant.Dealer2;
import domain.participant.Players;

public class BlackJack2 {
    private Players players;
    private Dealer2 dealer2;

    public BlackJack2(Players players, Dealer2 dealer2) {
        this.players = players;
        this.dealer2 = dealer2;
    }

    public void beginDealing() {
        dealer2.setting(dealer2.draw(), dealer2.draw());
        players.setting(dealer2);
    }
}
