package controller;

import domain.blackjack.BetAmount;
import domain.blackjack.BlackJack;
import domain.participant.*;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class BlackJackController {
    public void run() {
        Names names = new Names(InputView.inputParticipantName());
        Dealer dealer = new Dealer();
        List<Player> initPlayers = new ArrayList<>();
        names.getValue()
                .forEach(name -> initPlayers.add(new Player(name, new BetAmount(InputView.inputBetAmount(name)))));
        Players players = new Players(initPlayers);
        BlackJack blackJack = new BlackJack(players, dealer);
        blackJack.beginDealing(this::beginBlackJack);
        blackJack.playerHit();
        blackJack.dealerHit();
        printScore(dealer, players);

    }

    private void beginBlackJack(Players players, Dealer dealer) {
        OutputView.printBeginDealingInformation(players);
        OutputView.printDealerHands(dealer);
        for (Player player : players.getValue()) {
            OutputView.printParticipantHands(player);
        }
    }

    private void printScore(Dealer dealer, Players players) {
        OutputView.printParticipantResult(dealer);
        for (Player player : players.getValue()) {
            OutputView.printParticipantResult(player);
        }
    }
}
