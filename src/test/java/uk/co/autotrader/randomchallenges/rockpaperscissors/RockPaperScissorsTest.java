package uk.co.autotrader.randomchallenges.rockpaperscissors;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import uk.co.autotrader.randomchallenges.rockpaperscissors.inputs.Rock;

public class RockPaperScissorsTest {

    private RockPaperScissors testSubject;

    @Before
    public void beforeEach() {
        testSubject = new RockPaperScissors();
    }

    @Test
    public void shouldTakeTwoPlayersInput() {
        testSubject.setPlayer1(new Player(new Rock()));
        testSubject.setPlayer2(new Player(new Rock()));

        Assertions.assertThat(testSubject.getPlayer1().getInput()).isEqualToComparingFieldByField(new Rock());
        Assertions.assertThat(testSubject.getPlayer2().getInput()).isEqualToComparingFieldByField(new Rock());
    }

    @Test
    public void shouldCompareTwoPlayersInputs() {
        testSubject.setPlayer1(new Player(new Rock()));
        testSubject.setPlayer2(new Player(new Rock()));

        testSubject.rockPaperScissors();
    }
}