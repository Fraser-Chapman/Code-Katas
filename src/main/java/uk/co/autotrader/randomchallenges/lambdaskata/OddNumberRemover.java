package uk.co.autotrader.randomchallenges.lambdaskata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class OddNumberRemover {
    List<Integer> removeOddNumbers(int... numbers) {
        List<Integer> result = new ArrayList<>();

        Arrays.stream(numbers).forEach(number -> result.add(number));

        return result.stream().filter(number -> (number % 2 == 0)).collect(Collectors.toList());
    }
}