package controller;

import domain.blackjack.BlackJack2;
import domain.participant.Dealer2;
import domain.participant.Names;
import domain.participant.Player;
import domain.participant.Players;
import view.InputView;

import java.util.ArrayList;
import java.util.List;

public class BlackJackController2 {
    public void run() {
        BlackJack2 blackJack2 = init();
    }

    private BlackJack2 init() {
        Names names = new Names(InputView.inputParticipantName());
        Dealer2 dealer2 = new Dealer2();
        List<Player> players = new ArrayList<>();
        players.add(new Player())
        //return new BlackJack2(players, dealer2);
    }
}
