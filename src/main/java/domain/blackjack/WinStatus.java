package domain.blackjack;

public enum WinStatus {

    WIN,
    LOSE;

    public static WinStatus from(boolean winStatus) {
        if (winStatus) {
            return WIN;
        }
        return LOSE;
    }
}
