package domain.participant;

import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;

public class Participants {

    private static final int MIN_PARTICIPANT_COUNT = 2;
    private static final int MAX_PARTICIPANT_COUNT = 8;

    private final List<Participant> value;

    public Participants(final List<String> names) {
        validate(names);
        value = names.stream().map(name -> new Participant(new Name(name)))
                .toList();
    }

    private static void validate(List<String> names) {
        if (names.size() < MIN_PARTICIPANT_COUNT || names.size() > MAX_PARTICIPANT_COUNT) {
            throw new IllegalArgumentException(String.format("최소 %d명 최대 %d명까지 입력받을 수 있습니다.", MIN_PARTICIPANT_COUNT, MAX_PARTICIPANT_COUNT));
        }
        Set<String> distinctNames = Set.copyOf(names);

        if (distinctNames.size() != names.size()) {
            throw new IllegalArgumentException("이름은 중복될 수 없습니다.");
        }
    }

    public List<Name> getNames() {
        return value.stream()
                .map(Participant::getName)
                .toList();
    }

    public List<Participant> getValue() {
        return value;
    }

    public void prHit(BiConsumer<Participant, Dealer> participantConsumer, Dealer dealer) {
        for (Participant participant : value) {
            participantConsumer.accept(participant, dealer);
        }
    }
}
