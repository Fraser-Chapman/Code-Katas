package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(4);

        System.out.println(list1);

        Collections.swap(list1, 1, 3);

        System.out.println(list1);
    }
}
