package domain.blackjack;

import domain.participant.Dealer2;
import domain.participant.Player;
import domain.participant.Players;
import view.InputView;
import view.OutputView;

import java.util.function.BiConsumer;

public class BlackJack2 {
    private Players players;
    private Dealer2 dealer2;

    public BlackJack2(Players players, Dealer2 dealer2) {
        this.players = players;
        this.dealer2 = dealer2;
    }

    public void beginDealing(BiConsumer<Players, Dealer2> beginBlackJack) {
        dealer2.setting(dealer2.draw(), dealer2.draw());
        players.setting(dealer2);
        beginBlackJack.accept(players, dealer2);
    }

    public void playerHit() {
        for (Player player : players.getValue()) {
            while (player.isHit() && InputView.inputHitOption(player.getName()).equals("y")) {
                player.receiveCard(dealer2.draw());
                OutputView.printParticipantHands2(player);
            }
        }
    }

    public void dealerHit() {
        while (dealer2.isHit()) {
            dealer2.receiveCard(dealer2.draw());
            OutputView.printDealerHit2();
        }
    }
}
