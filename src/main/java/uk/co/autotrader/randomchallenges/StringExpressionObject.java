package uk.co.autotrader.randomchallenges;

public class StringExpressionObject {

    public final String convertedInput;
    public Character operator;
    Integer numberOfValues;
    Integer operatorPosition = -1;

    public StringExpressionObject(String input) {
        this.convertedInput = input.toLowerCase()
                .replace("zero", "0")
                .replace("plus", "+")
                .replace("minus", "-")
                .replace("dividedby", "/")
                .replace("times", "*")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");

        this.numberOfValues = amountOfValuesInConvertedInput();

    }

    private Integer amountOfValuesInConvertedInput(){
        int result;
        int numberOfOperators = 0;

        for (int i = 0; i < convertedInput.length(); i++){
            if(convertedInput.substring(i, i + 1) == "+" ||
                    convertedInput.substring(i, i + 1) == "-" ||
                    convertedInput.substring(i, i + 1) == "*" ||
                    convertedInput.substring(i, i + 1) == "/") {

                numberOfOperators += 1;
            }
        }
        result = numberOfOperators + 1;

        return result;
    }
}
