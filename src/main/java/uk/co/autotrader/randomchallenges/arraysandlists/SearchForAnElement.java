package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchForAnElement {
    public static void main(String[] args) {
        List<String> tools = new ArrayList<>();
        tools.add("Hammer");
        tools.add("Wrench");
        tools.add("Screwdriver");
        tools.add("Saw");

        if(tools.contains("Saw")){
            System.out.println("found saw");
        }
        else {
            System.out.println("didn't find saw");
        }

        Collections.sort(tools);
        System.out.println(Collections.binarySearch(tools, "Screwdriver"));
    }
}
