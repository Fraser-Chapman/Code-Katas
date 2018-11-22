package uk.co.autotrader.challenges.countofpositivessumofnegatives;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.List;

public class CountOfPositivesSumOfNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0){
            return new int[] {};
        }

        List<Integer> inputAsList = Ints.asList(input);
        List<Integer> negativeNumbersList = new ArrayList<>();
        List<Integer> positiveNumbersList = new ArrayList<>();

        inputAsList.stream().forEach(number -> {
            if (number <= 0) {
                negativeNumbersList.add(number);
            }
            else {
                positiveNumbersList.add(number);
            }
        });

        int [] answer = {positiveNumbersList.size(), negativeNumbersList.stream().mapToInt(number -> number).sum()};
        return answer;
    }
}