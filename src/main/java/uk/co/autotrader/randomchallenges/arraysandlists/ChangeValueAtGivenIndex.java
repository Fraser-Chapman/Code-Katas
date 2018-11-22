package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class ChangeValueAtGivenIndex {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);

        System.out.println(numbers.toString());
        System.out.println("oops");

        numbers.set(1, 2);

        System.out.println(numbers.toString());
    }
}
