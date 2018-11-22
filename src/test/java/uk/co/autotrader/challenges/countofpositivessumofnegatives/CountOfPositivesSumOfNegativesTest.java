package uk.co.autotrader.challenges.countofpositivessumofnegatives;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CountOfPositivesSumOfNegativesTest {
    CountOfPositivesSumOfNegatives countOfPositivesSumOfNegatives;

    @Before
    public void setUp() {
        countOfPositivesSumOfNegatives = new CountOfPositivesSumOfNegatives();

    }

    @Test
    public void shouldReturnEmptyArrayWhenGivenEmptyInput() {
        int[] input = {};

        Assertions.assertThat(countOfPositivesSumOfNegatives.countPositivesSumNegatives(input)).isEqualTo(new int[] {});
    }

    @Test
    public void shouldReturnBothCountAndSum() {
        int[] input = {1,2,3,4,5,6,-10,-1,-9,-3};
        int[] expectedResult = {6, -23};

        Assertions.assertThat(countOfPositivesSumOfNegatives.countPositivesSumNegatives(input)).isEqualTo(expectedResult);
    }

}