package uk.co.autotrader.challenges.tripletrouble;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class TripleTroubleTest {

    //private TripleDoubleProcessor returnStorer;

    @Before
    public void setUp(){
        //returnStorer = new TripleDoubleProcessor(0, 0);
    }

    @Test
    public void givenNumbersWhereIsTripleAndIsDoubleAndTheyMatchThenShouldReturnOne(){
        Assertions.assertThat(TripleTrouble.TripleDouble(1222343221, 45224907)).isOne();
    }

    @Test
    public void givenNumbersWhereDoubleDoesNotMatchTripleThenReturnZero(){
        Assertions.assertThat(TripleTrouble.TripleDouble(12344456, 12345567)).isZero();
    }

    @Test
    public void givenNumbersWhereNoDoublesThenReturnZero(){
        Assertions.assertThat(TripleTrouble.TripleDouble(12333456, 1234567)).isZero();
    }

    @Test
    public void givenNumbersWhereNoTriplesThenReturnZero(){
        Assertions.assertThat(TripleTrouble.TripleDouble(1234567, 1233456)).isZero();

    }

    @Test
    public void givenNumbersContainingTripleThenTripleInNumOneShouldReturnTrue(){

        TripleDoubleProcessor returnStorer = new TripleDoubleProcessor(12444556, 0);

        boolean result = returnStorer.isTripleInNumOne();

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void givenNumbersNotContainingTripleThenTripleInNumOneShouldReturnFalse(){

        TripleDoubleProcessor returnStorer = new TripleDoubleProcessor(1244556, 0);

        boolean result = returnStorer.isTripleInNumOne();

        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void givenNumbersContainingTheMatchingDoubleThenDoubleInNumTwoShouldReturnTrue(){

        TripleDoubleProcessor returnStorer = new TripleDoubleProcessor(0, 123445);
        returnStorer.numberFoundByIsTriple = 4;
        boolean result = returnStorer.isDoubleInNumTwo();

        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void givenNumbersContainingMismatchedDoubleThenDoubleInNumTwoShouldReturnFalse(){

        TripleDoubleProcessor returnStorer = new TripleDoubleProcessor(0, 1233456);
        returnStorer.numberFoundByIsTriple = 4;

        boolean result = returnStorer.isDoubleInNumTwo();

        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void givenNumbersContainingNoDoubleThenDoubleInNumTwoShouldReturnFalse(){

        TripleDoubleProcessor returnStorer = new TripleDoubleProcessor(0, 123456789);
        returnStorer.numberFoundByIsTriple = 3;

        boolean result = returnStorer.isDoubleInNumTwo();

        Assertions.assertThat(result).isFalse();
    }

}