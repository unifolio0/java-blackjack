package domain.participant;

class DealerTest {

    /*@DisplayName("딜러의 점수가 16이하이면 카드를 받는다.")
    @Test
    void shouldHit() {
        Dealer dealer3 = new Dealer();
        dealer3.receiveCard(new Card(Shape.HEART, Rank.KING));
        dealer3.receiveCard(new Card(Shape.HEART, Rank.SIX));

        Assertions.assertThat(dealer3.shouldHit()).isTrue();
    }

    @DisplayName("딜러의 점수가 17이상이면 카드를 받을 수 없다.")
    @Test
    void ShoulNotdHit() {
        Dealer3 dealer3 = new Dealer3();
        dealer3.receiveCard(new Card(Shape.HEART, Rank.KING));
        dealer3.receiveCard(new Card(Shape.HEART, Rank.SEVEN));

        Assertions.assertThat(dealer3.shouldHit()).isFalse();
    }

    @DisplayName("참가자와 딜러 중 점수가 높은 사람이 승리한다.")
    @Test
    void isWinner() {
        Dealer3 dealer3 = new Dealer3();
        dealer3.receiveCard(new Card(Shape.HEART, Rank.QUEEN));

        Participant participant = new Participant(new Name("one"));
        participant.receiveCard(new Card(Shape.HEART, Rank.KING));
        participant.receiveCard(new Card(Shape.HEART, Rank.TEN));

        WinStatus winStatus = dealer3.calculateParticipantWinStatus(participant);
        assertThat(winStatus).isEqualTo(WinStatus.WIN);
    }

    @DisplayName("참가자와 딜러의 점수가 같은 경우 무승부(DRAW)로 처리한다.")
    @Test
    void isWinnerWhenAllBlackJack() {
        Dealer3 dealer3 = new Dealer3();
        dealer3.receiveCard(new Card(Shape.HEART, Rank.QUEEN));
        dealer3.receiveCard(new Card(Shape.HEART, Rank.ACE));

        Participant participant = new Participant(new Name("one"));
        participant.receiveCard(new Card(Shape.HEART, Rank.KING));
        participant.receiveCard(new Card(Shape.DIA, Rank.ACE));

        WinStatus winStatus = dealer3.calculateParticipantWinStatus(participant);
        assertThat(winStatus).isEqualTo(WinStatus.PUSH);
    }*/
}
