import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DeckTest {
    @DisplayName("카드 덱 초기화")
    @Test
    void initDeck() {
        Deck deck = new Deck();
        Assertions.assertThat(deck.getCards())
                .hasSize(52);
    }

    @DisplayName("카드를 1장 뽑으면 덱에서 삭제한다.")
    @Test
    void cardRemove() {
        Deck deck = new Deck();
        Card card = deck.draw();

        Assertions.assertThat(deck.getCards()).hasSize(51);
    }
}
