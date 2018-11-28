package uk.co.autotrader.randomchallenges.stringexpression;

import java.util.Arrays;
import java.util.List;

public class StringExpression {
    static String convertedInput;
    static Character operator;

    public String stringExpression(String input) {
        convertedInput = input.toLowerCase()
                .replace(Expression.PLUS.getKey(), Expression.PLUS.getValue())
                .replace(Expression.MINUS.getKey(), Expression.MINUS.getValue())
                .replace(Expression.DIVIDEDBY.getKey(), Expression.DIVIDEDBY.getValue())
                .replace(Expression.TIMES.getKey(), Expression.TIMES.getValue())
                .replace(Expression.ZERO.getKey(), Expression.ZERO.getValue())
                .replace(Expression.ONE.getKey(), Expression.ONE.getValue())
                .replace(Expression.TWO.getKey(), Expression.TWO.getValue())
                .replace(Expression.THREE.getKey(), Expression.THREE.getValue())
                .replace(Expression.FOUR.getKey(), Expression.FOUR.getValue())
                .replace(Expression.FIVE.getKey(), Expression.FIVE.getValue())
                .replace(Expression.SIX.getKey(), Expression.SIX.getValue())
                .replace(Expression.SEVEN.getKey(), Expression.SEVEN.getValue())
                .replace(Expression.EIGHT.getKey(), Expression.EIGHT.getValue())
                .replace(Expression.NINE.getKey(), Expression.NINE.getValue());

        int number1 = StringExpression.constructNumber(convertedInput);

        while (!convertedInput.isEmpty()) {

            switch (operator) {
                case '+':
                    number1 += StringExpression.constructNumber(convertedInput);
                    break;
                case '-':
                    number1 -= StringExpression.constructNumber(convertedInput);
                    break;
                case '*':
                    number1 *= StringExpression.constructNumber(convertedInput);
                    break;
                case '/':
                    number1 /= StringExpression.constructNumber(convertedInput);
                    break;
                default:
                    System.out.println("Invalid operator used, failure in switch statement!");
                    break;
            }
        }

        return StringExpression.convertResultToString(number1);
    }

    private static Integer constructNumber(String expression) {
        String number = "";

        for (int i = 0; i <= expression.length(); i++) {
            if (i + 1 == expression.length()) {
                number += expression.substring(i);
                convertedInput = "";
                break;
            } else if (isOperator(convertedInput.charAt(i + 1))) {
                number += convertedInput.substring(i, i + 1);
                operator = convertedInput.charAt(i + 1);
                convertedInput = convertedInput.substring(i + 1);
                break;
            } else if (isOperator(convertedInput.charAt(i))) {

            } else if (!isOperator(convertedInput.charAt(i + 1))) {
                number += convertedInput.substring(i, i + 1);
            }

        }
        return Integer.parseInt(number);
    }

    private static String convertResultToString(Integer resultAsInt) {
        return resultAsInt.toString()
                .replace(Expression.MINUS.getValue(), Expression.MINUS.getKey())
                .replace(Expression.ZERO.getValue(), Expression.ZERO.getKey())
                .replace(Expression.ONE.getValue(), Expression.ONE.getKey())
                .replace(Expression.TWO.getValue(), Expression.TWO.getKey())
                .replace(Expression.THREE.getValue(), Expression.THREE.getKey())
                .replace(Expression.FOUR.getValue(), Expression.FOUR.getKey())
                .replace(Expression.FIVE.getValue(), Expression.FIVE.getKey())
                .replace(Expression.SIX.getValue(), Expression.SIX.getKey())
                .replace(Expression.SEVEN.getValue(), Expression.SEVEN.getKey())
                .replace(Expression.EIGHT.getValue(), Expression.EIGHT.getKey())
                .replace(Expression.NINE.getValue(), Expression.NINE.getKey())
                .trim();
    }

    private static boolean isOperator(Character input) {
        List<Character> operators = Arrays.asList('+', '-', '*', '/');

        for (Character operator : operators) {
            if (input.equals(operator)) {
                return true;
            }
        }

        return false;
    }
}