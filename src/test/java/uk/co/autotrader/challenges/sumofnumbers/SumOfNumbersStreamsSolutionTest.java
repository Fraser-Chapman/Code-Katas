package uk.co.autotrader.challenges.sumofnumbers;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class SumOfNumbersStreamsSolutionTest {
    SumOfNumbersStreamsSolution sumOfNumbers;

    @Before
    public void setUp() {
        sumOfNumbers = new SumOfNumbersStreamsSolution();
    }

    @Test
    public void shouldReturnXIsLessThanZeroWhenGivenANegativeValue() {
        Assertions.assertThat(sumOfNumbers.SumOfNumbersZeroToN(-15)).isEqualTo("-15<0");
    }

    @Test
    public void shouldReturnZeroWhenGivenValueOfZero() {
        Assertions.assertThat(sumOfNumbers.SumOfNumbersZeroToN(0)).isEqualTo("0=0");
    }

    @Test
    public void shouldReturnTwentyOneWhenGivenValueOfSix() {
        Assertions.assertThat(sumOfNumbers.SumOfNumbersZeroToN(6)).isEqualTo("0+1+2+3+4+5+6 = 21");

    }
}