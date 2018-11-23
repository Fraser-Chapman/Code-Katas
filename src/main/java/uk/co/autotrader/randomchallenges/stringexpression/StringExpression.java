package uk.co.autotrader.randomchallenges.stringexpression;

import uk.co.autotrader.randomchallenges.stringexpression.exceptions.InvalidOperatorException;

import java.util.Arrays;
import java.util.List;

public class StringExpression {
    static String convertedInput;
    static Character operator;

    public String stringExpression(String input) {
        convertedInput = input.toLowerCase()
                .replace("plus", "+")
                .replace("minus", "-")
                .replace("dividedby", "/")
                .replace("times", "*")
                .replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");

        int numberOfValues = amountOfValuesInConvertedInput(convertedInput);
        int resultAsInt;
        int number1 = 0;
        int number2 = 0;

        for (int i = 0; i < numberOfValues; i++) {
            number1 = StringExpression.constructNumber(convertedInput);
            number2 = StringExpression.constructNumber(convertedInput);


        }
            switch (operator) {
                case '+':
                    resultAsInt = number1 + number2;
                    break;

                case '-':
                    resultAsInt = number1 - number2;
                    break;

                case '*':
                    resultAsInt = number1 * number2;
                    break;

                case '/':
                    resultAsInt = number1 / number2;
                    break;

                default:
                    throw new InvalidOperatorException("Invalid operator was used");
            }

        return StringExpression.convertResultToString(resultAsInt);
    }

    private static Integer constructNumber(String expression) {
        String number = "";

        for (int i = 0; i <= expression.length(); i++) {
            if (i + 1 == expression.length()) {
                number += expression.substring(i);
                convertedInput = "";
                break;
            }
            else if (isOperator(convertedInput.charAt(i + 1))) {
                number += convertedInput.substring(i, i + 1);
                operator = convertedInput.charAt(i + 1);
                convertedInput = convertedInput.substring(i + 1);
                break;
            }
            else if (isOperator(convertedInput.charAt(i))) {

            }
            else if (!isOperator(convertedInput.charAt(i + 1))) {
                number += convertedInput.substring(i, i + 1);
            }

        }

        return Integer.parseInt(number);
    }

    private static String convertResultToString(Integer resultAsInt) {
        return resultAsInt.toString()
                .replace("+", "")
                .replace("-", "negative")
                .replace("0", "zero")
                .replace("1", "one")
                .replace("2", "two")
                .replace("3", "three")
                .replace("4", "four")
                .replace("5", "five")
                .replace("6", "six")
                .replace("7", "seven")
                .replace("8", "eight")
                .replace("9", "nine")
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

    private Integer amountOfValuesInConvertedInput(String convertedInput){
        int numberOfOperators = 0;

        for (int i = 0; i < convertedInput.length(); i++){
            if(convertedInput.substring(i, i + 1) == "+" ||
                    convertedInput.substring(i, i + 1) == "-" ||
                    convertedInput.substring(i, i + 1) == "*" ||
                    convertedInput.substring(i, i + 1) == "/") {

                //number of operators is always one less than the number of values
                numberOfOperators += 1;
            }
        }
        return numberOfOperators + 1;
    }
}