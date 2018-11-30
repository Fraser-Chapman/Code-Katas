package uk.co.autotrader.challenges.sortedyesnohow;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static uk.co.autotrader.challenges.sortedyesnohow.SortedYesNoHow.isSortedAndHow;

public class SortedYesNoHowTest {

    @Test
    public void shouldFindWhichNumberIsLargestInArrayContainingTwoDigits() {
        int[] input = {1, 2};

        String result = isSortedAndHow(input);

        Assertions.assertThat(result).isEqualTo("yes, ascending");
    }

    @Test
    public void shouldDetectWhetherSortedArrayIsAscendingOrDescending() {
        int[] ascending = {1, 2, 3};
        int[] descending = {3, 2, 1};

        String result1 = isSortedAndHow(ascending);
        String result2 = isSortedAndHow(descending);

        Assertions.assertThat(result1).isEqualTo("yes, ascending");
        Assertions.assertThat(result2).isEqualTo("yes, descending");
    }

    @Test
    public void shouldDetectIfAnArrayIsNotSorted() {
        int[] input = {3, 31, 5, 8, -1};

        String result = isSortedAndHow(input);

        Assertions.assertThat(result).isEqualTo("no");
    }

}