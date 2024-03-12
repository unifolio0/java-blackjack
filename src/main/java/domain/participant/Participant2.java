package domain.participant;

import domain.participant.state.State;

public class Participant2 {
    private State state;
    private Name name;

    public Participant2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }


}
