package controller;

import domain.blackjack.BetAmount;
import domain.blackjack.BlackJack2;
import domain.participant.*;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class BlackJackController2 {
    public void run() {
        Names names = new Names(InputView.inputParticipantName());
        Dealer2 dealer2 = new Dealer2();
        List<Player> initPlayers = new ArrayList<>();
        names.getValue()
                .forEach(name -> initPlayers.add(new Player(name, new BetAmount(InputView.inputBetAmount(name)))));
        Players players = new Players(initPlayers);
        BlackJack2 blackJack2 = new BlackJack2(players, dealer2);
        blackJack2.beginDealing(this::beginBlackJack);
        blackJack2.playerHit();
        blackJack2.dealerHit();
        printScore(dealer2, players);

    }

    private void beginBlackJack(Players players, Dealer2 dealer2) {
        OutputView.printBeginDealingInformation2(players);
        OutputView.printDealerHands2(dealer2);
        for (Player player : players.getValue()) {
            OutputView.printParticipantHands2(player);
        }
    }

    private void printScore(Dealer2 dealer2, Players players) {
        OutputView.printParticipantResult2(dealer2);
        for (Player player : players.getValue()) {
            OutputView.printParticipantResult2(player);
        }
    }
}
