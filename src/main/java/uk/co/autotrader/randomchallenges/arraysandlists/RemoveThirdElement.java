package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElement {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(500);
        numbers.add(4);
        System.out.println(numbers.toString());

        numbers.set(2, 3);
        System.out.println(numbers.toString());
    }
}
