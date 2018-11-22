package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Collections.shuffle(numbers);
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println(numbers);

        Collections.shuffle(numbers);
        System.out.println(numbers);
    }
}
