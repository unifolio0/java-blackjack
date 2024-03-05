import java.util.Objects;

public class Card {
    private Shape shape;
    private Rank rank;

    public Card(Shape shape, Rank rank) {
        this.shape = shape;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return shape == card.shape && rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, rank);
    }
}
