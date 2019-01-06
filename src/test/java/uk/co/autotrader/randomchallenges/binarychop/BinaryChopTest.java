package uk.co.autotrader.randomchallenges.binarychop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BinaryChopTest {

    private BinaryChop binaryChop;

    @Before
    public void setup() {
        binaryChop = new BinaryChop();
    }

    @Test
    public void inputOfSize1AndContainsDesiredNumber() {
        assertThat(binaryChop.chop(8, new int[]{8})).isEqualTo(0);
    }

    @Test
    public void inputOfSize1DoesNotContainNumber() {
        assertThat(binaryChop.chop(3, new int[]{6})).isEqualTo(-1);
    }

    @Test
    public void uberTest() {
        assertThat(binaryChop.chop(3, new int[]{})).isEqualTo(-1);
        assertThat(binaryChop.chop(3, new int[]{1})).isEqualTo(-1);
        assertThat(binaryChop.chop(1, new int[]{1})).isEqualTo(0);
        assertThat(binaryChop.chop(1, new int[]{1, 3, 5})).isEqualTo(0);
        assertThat(binaryChop.chop(3, new int[]{1, 3, 5})).isEqualTo(1);
        assertThat(binaryChop.chop(5, new int[]{1, 3, 5})).isEqualTo(2);
        assertThat(binaryChop.chop(0, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.chop(2, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.chop(4, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.chop(6, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.chop(1, new int[]{1, 3, 5, 7})).isEqualTo(0);
        assertThat(binaryChop.chop(3, new int[]{1, 3, 5, 7})).isEqualTo(1);
        assertThat(binaryChop.chop(5, new int[]{1, 3, 5, 7})).isEqualTo(2);
        assertThat(binaryChop.chop(7, new int[]{1, 3, 5, 7})).isEqualTo(3);
        assertThat(binaryChop.chop(0, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.chop(2, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.chop(4, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.chop(6, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.chop(8, new int[]{1, 3, 5, 7})).isEqualTo(-1);
    }
}