package uk.co.autotrader.randomchallenges.stringexpression;

import java.util.Arrays;
import java.util.List;

public class StringExpression {

    public static String stringExpression(String input) {
        int resultAsInt = 0;

        StringExpressionObject stringExpressionObject = new StringExpressionObject(input);

        //Attempting to make the program construct number 1 and number 2 and then add them. Then I want it to get the
        // new number1 and then the next number and add that I came up with this for loop which keeps looping through the expression until
        // it has added every number. It shouldn't work but it is doing (i think).

        for (int i = 0; i < stringExpressionObject.numberOfValues; i++) {
            int number1 = StringExpression.constructNumber1(stringExpressionObject);
            int number2 = StringExpression.constructNumber2(stringExpressionObject);

            //TODO make default throw a custom exception?
            switch (stringExpressionObject.operator) {
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
                    System.out.println("Invalid operator was used");
                    resultAsInt = 0;
            }
        }

        return StringExpression.convertResultToString(resultAsInt);
    }

    private static Integer constructNumber1(StringExpressionObject stringExpressionObject) {

        int operatorPosition = stringExpressionObject.operatorPosition;
        String number1 = "";
        int result = 0;
        for (int i = (operatorPosition + 1); i <= stringExpressionObject.convertedInput.length(); i++) {
            if (i == 0) {
                number1 += stringExpressionObject.convertedInput.substring(i, i + 1);

            } else if (isOperator(stringExpressionObject.convertedInput.charAt(i))) {
                //we have the complete number
                result = Integer.parseInt(number1);
                stringExpressionObject.operatorPosition = i;
                stringExpressionObject.operator = stringExpressionObject.convertedInput.charAt(stringExpressionObject.operatorPosition);
                break;

            } else if (i + 1 <= stringExpressionObject.convertedInput.length() || !isOperator(stringExpressionObject.convertedInput.charAt(i))) {
                number1 += stringExpressionObject.convertedInput.substring(i, i + 1);

            } else {
                //we have the complete number
                result = Integer.parseInt(number1);
                stringExpressionObject.operatorPosition = i + 1;
                stringExpressionObject.operator = stringExpressionObject.convertedInput.charAt(stringExpressionObject.operatorPosition);
                break;
            }
        }

        return result;
    }

    private static Integer constructNumber2(StringExpressionObject stringExpressionObject) {
        int operatorPosition = stringExpressionObject.operatorPosition;
        String number2 = "";
        int result = 0;
        for (int i = (operatorPosition + 1); i <= stringExpressionObject.convertedInput.length(); i++) {
            if (i == stringExpressionObject.convertedInput.length() - 1) {
                number2 += stringExpressionObject.convertedInput.substring(i);
                result = Integer.parseInt(number2);
                break;

            } else if (i + 1 < stringExpressionObject.convertedInput.length() && !isOperator(stringExpressionObject.convertedInput.charAt(i))) {
                number2 += stringExpressionObject.convertedInput.substring(i, i + 1);

            } else {
                result = Integer.parseInt(number2);
                break;
            }
        }
        return result;
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
}