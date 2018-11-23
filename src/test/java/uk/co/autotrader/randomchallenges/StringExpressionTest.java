package uk.co.autotrader.randomchallenges;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import uk.co.autotrader.randomchallenges.stringexpression.StringExpression;
import uk.co.autotrader.randomchallenges.stringexpression.exceptions.InvalidOperatorException;

public class StringExpressionTest {
    StringExpression stringExpression;

    @Before
    public void setUp() {
        stringExpression = new StringExpression();
    }

    @Test
    public void shouldTakeTwoSingleDigitNumbersAndAddThemTogether() {
        String input = "oneplusone";

        String result = stringExpression.stringExpression(input);

        Assertions.assertThat(result).isEqualTo("two");
    }

    @Test
    public void shouldTakeTwoSingleDigitNumbersAndSubtractOneFromTheOther() {
        String input = "oneminusone";

        String result = stringExpression.stringExpression(input);

        Assertions.assertThat(result).isEqualTo("zero");
    }

    @Test
    public void shouldTakeTwoSingleDigitNumbersAndMultiplyThem() {
        String input = "onetimestwo";

        String result = stringExpression.stringExpression(input);

        Assertions.assertThat(result).isEqualTo("two");
    }

    @Test
    public void shouldTakeTwoSingleDigitNumbersAndDivideOnByTheOther() {
        String input = "ninedividedbythree";

        String result = stringExpression.stringExpression(input);

        Assertions.assertThat(result).isEqualTo("three");
    }

    @Test
    public void shouldReturnNegativeNumberIfResultIsNegative() {
        String input = "zerominusone";

        String result = stringExpression.stringExpression(input);

        Assertions.assertThat(result).isEqualTo("negativeone");
    }

    @Test
    public void shouldTakeTwoMultipleDigitNumbersAndAddThemTogether() {
        String input = "onezerozeroplustwozero";

        String result = stringExpression.stringExpression(input);

        Assertions.assertThat(result).isEqualTo("onetwozero");
    }

    @Test
    public void shouldTakeAnExpressionContainingThreeValuesAndReturnCorrectResult() {
        String input = "oneplusoneplusone";

        String result = stringExpression.stringExpression(input);

        Assertions.assertThat(result).isEqualTo("three");
    }
//
//    @Test (expected = InvalidOperatorException.class)
//    public void shouldThrowInvalidOperatorException() {
//        String input = "onemodulustwo";
//
//        String result = stringExpression.stringExpression(input);
//    }
}