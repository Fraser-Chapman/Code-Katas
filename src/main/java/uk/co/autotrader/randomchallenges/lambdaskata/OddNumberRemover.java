package uk.co.autotrader.randomchallenges.lambdaskata;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class OddNumberRemover {
    List<Integer> removeOddNumbers(int... numbers) {
       return IntStream.of(numbers)
               .filter(number -> (number % 2 == 0))
               .boxed()
               .collect(Collectors.toList());
    }
}