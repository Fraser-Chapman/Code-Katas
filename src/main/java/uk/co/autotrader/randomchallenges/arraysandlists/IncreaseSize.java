package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;

public class IncreaseSize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(23);
        list.ensureCapacity(6);
    }
}
