package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class EmptyAList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        System.out.println(numbers);

        numbers.removeAll(numbers);
        //numbers.clear(); ??

        System.out.println(numbers);
    }
}
