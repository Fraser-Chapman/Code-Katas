package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<String> tools = new ArrayList<>();
        tools.add("Hammer");
        tools.add("Wrench");
        tools.add("Screwdriver");
        tools.add("Saw");

        System.out.println(tools.toString());
        Collections.sort(tools);
        System.out.println(tools.toString());
    }
}
