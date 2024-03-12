package domain.participant.state;

public interface State {
    default boolean isBlackJack() {
        return true;
    }

    default int calculateScore() {
        return 0;
    }
}
