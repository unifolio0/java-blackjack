package domain.participant;

import java.util.List;

public class Players {

    private final List<Player> value;

    public Players(final List<Player> players) {
        this.value = players;
    }

    public void setting(Dealer2 dealer2) {
        for (Participant2 participant2 : value) {
            participant2.setting(dealer2.draw(), dealer2.draw());
        }
    }

    public List<Name> getNames() {
        return value.stream()
                .map(Participant2::getName)
                .toList();
    }

    public List<Player> getValue() {
        return value;
    }
}
