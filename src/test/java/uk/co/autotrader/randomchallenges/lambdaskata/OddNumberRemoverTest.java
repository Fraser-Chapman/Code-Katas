package uk.co.autotrader.randomchallenges.lambdaskata;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddNumberRemoverTest {

    @Test
    public void removesOddNumbers() {
        OddNumberRemover oddNumberRemover = new OddNumberRemover();
        assertThat(oddNumberRemover.removeOddNumbers(1, 2, 3, 4
        )).containsExactly(2, 4);
    }
}