package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class CloneList {
    public static void main(String[] args) {
        List<String> original = new ArrayList<>();
        original.add("wow");

        List<String> clone = (ArrayList<String>)((ArrayList<String>) original).clone();

        System.out.println(original);
        System.out.println(clone);
    }
}
