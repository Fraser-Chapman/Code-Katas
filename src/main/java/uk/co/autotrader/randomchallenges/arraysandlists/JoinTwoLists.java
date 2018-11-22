package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoLists {
    public static void main(String[] args) {
        List<String> part1 = new ArrayList<>();
        List<String> part2 = new ArrayList<>();

        part1.add("This");
        part1.add("is");

        part2.add("a");
        part2.add("sentence");

        List<String> complete = new ArrayList<>();
        complete.addAll(part1);
        complete.addAll(part2);

        System.out.println(complete);
    }
}
