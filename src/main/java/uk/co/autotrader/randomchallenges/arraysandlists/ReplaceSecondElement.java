package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        list.set(1, 2);

        System.out.println(list);
    }
}
