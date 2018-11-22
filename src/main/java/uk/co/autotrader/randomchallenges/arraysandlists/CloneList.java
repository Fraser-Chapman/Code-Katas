package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;

public class CloneList {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>();
        original.add("wow");

        ArrayList<String> clone = (ArrayList<String>) original.clone();

        System.out.println(original);
        System.out.println(clone);
    }
}
