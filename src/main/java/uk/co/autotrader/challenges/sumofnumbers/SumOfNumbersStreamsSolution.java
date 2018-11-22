package uk.co.autotrader.challenges.sumofnumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbersStreamsSolution {

    public String SumOfNumbersZeroToN(int value) {
        List<Integer> zeroToValue = new ArrayList();

        if (value == 0){
            return "0=0";
        }
        else if (value < 0){
            return value + "<0";
        }
        else {
            for (int i = 0; i <= value; i++) {
                zeroToValue.add(i);
            }
        }

        String numbersAsString = zeroToValue.stream()
                .map(number -> number.toString())
                .collect(Collectors.joining("+"));

        Integer sumOfNumbers = zeroToValue.stream()
                .mapToInt(number -> number.intValue())
                .sum();

        return numbersAsString + " = " + sumOfNumbers;
    }
}