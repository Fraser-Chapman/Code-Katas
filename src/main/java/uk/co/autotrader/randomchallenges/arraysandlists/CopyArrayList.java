package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);

        List<Integer> copyOfNumbers = new ArrayList<>();
        copyOfNumbers.add(1);
        copyOfNumbers.add(2);
        copyOfNumbers.add(3);
        copyOfNumbers.add(4);

        System.out.println(numbers.toString());
        System.out.println(copyOfNumbers.toString());

        System.out.println(" ");

        Collections.copy(copyOfNumbers, numbers);

        System.out.println(numbers.toString());
        System.out.println(copyOfNumbers.toString());
    }
}
