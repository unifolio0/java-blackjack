package domain.participant;

import java.util.List;

public class Players {

    private final List<Player> value;

    public Players(final List<Player> players) {
        this.value = players;
    }

    public void setting(Dealer dealer) {
        for (Participant participant : value) {
            participant.setting(dealer.draw(), dealer.draw());
        }
    }

    public int getDealerProfit(Dealer dealer) {
        int total = 0;
        for (Player player : value) {
            total += player.getProfit(dealer);
        }
        return total * -1;
    }

    public List<Name> getNames() {
        return value.stream()
                .map(Participant::getName)
                .toList();
    }

    public List<Player> getValue() {
        return value;
    }
}
