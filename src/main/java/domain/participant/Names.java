package domain.participant;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Names {
    private static final int MIN_PARTICIPANT_COUNT = 2;
    private static final int MAX_PARTICIPANT_COUNT = 8;

    private List<Name> value;

    public Names(List<String> names) {
        this.value = mapToName(names);
        validate(value);
    }

    private List<Name> mapToName(List<String> names) {
        return names.stream()
                .map(Name::new)
                .collect(Collectors.toList());
    }

    private static void validate(List<Name> names) {
        if (names.size() < MIN_PARTICIPANT_COUNT || names.size() > MAX_PARTICIPANT_COUNT) {
            throw new IllegalArgumentException(String.format("최소 %d명 최대 %d명까지 입력받을 수 있습니다.", MIN_PARTICIPANT_COUNT, MAX_PARTICIPANT_COUNT));
        }
        Set<Name> distinctNames = Set.copyOf(names);

        if (distinctNames.size() != names.size()) {
            throw new IllegalArgumentException("이름은 중복될 수 없습니다.");
        }
    }

    public List<Name> getValue() {
        return value;
    }
}
