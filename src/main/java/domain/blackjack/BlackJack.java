package domain.blackjack;

import domain.participant.Dealer;
import domain.participant.Player;
import domain.participant.Players;
import view.InputView;
import view.OutputView;

import java.util.function.BiConsumer;

public class BlackJack {
    private Players players;
    private Dealer dealer;

    public BlackJack(Players players, Dealer dealer) {
        this.players = players;
        this.dealer = dealer;
    }

    public void beginDealing(BiConsumer<Players, Dealer> beginBlackJack) {
        dealer.setting(dealer.draw(), dealer.draw());
        players.setting(dealer);
        beginBlackJack.accept(players, dealer);
    }

    public void playerHit() {
        for (Player player : players.getValue()) {
            while (player.isHit() && InputView.inputHitOption(player.getName()).equals("y")) {
                player.receiveCard(dealer.draw());
                OutputView.printParticipantHands(player);
            }
        }
    }

    public void dealerHit() {
        while (dealer.isHit()) {
            dealer.receiveCard(dealer.draw());
            OutputView.printDealerHit();
        }
    }
}
