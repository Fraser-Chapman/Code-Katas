package uk.co.autotrader.randomchallenges.naughtsandcrosses;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class NaughtsAndCrossesTest {

    private NaughtsAndCrosses testSubject;
    private static final String[][] EMPTY_GRID = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};

    @Before
    public void beforeEach() {
        testSubject = new NaughtsAndCrosses();
        testSubject.generateGrid();

    }

    @Test
    public void shouldCreateEmptyGrid() {
        Assertions.assertThat(testSubject.grid).isEqualTo(EMPTY_GRID);
    }

    @Test
    public void shouldDisplayGrid() {
        Assertions.assertThat(testSubject.displayGrid()).isEqualTo("-|-|-\n-|-|-\n-|-|-\n");
    }

    @Test
    public void shouldAddValueToAllLocations() {
        String expectedResult = "X|X|O\nX|X|X\nO|X|X\n";
        testSubject.placeCounter("X", "top-left");
        testSubject.placeCounter("X", "top-middle");
        testSubject.placeCounter("O", "top-right");
        testSubject.placeCounter("X", "middle-left");
        testSubject.placeCounter("X", "middle-middle");
        testSubject.placeCounter("X", "middle-right");
        testSubject.placeCounter("O", "bottom-left");
        testSubject.placeCounter("X", "bottom-middle");
        testSubject.placeCounter("X", "bottom-right");

        Assertions.assertThat(testSubject.displayGrid()).isEqualTo(expectedResult);
    }
}