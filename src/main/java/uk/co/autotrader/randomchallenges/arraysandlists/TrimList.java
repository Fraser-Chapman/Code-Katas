package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;

public class TrimList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("s");
        list.add("d");
        list.add("f");

        list.trimToSize();
    }
}
