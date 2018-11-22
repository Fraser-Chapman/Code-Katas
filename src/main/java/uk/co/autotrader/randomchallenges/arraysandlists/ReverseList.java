package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> sentence = new ArrayList<>();
        sentence.add("sentence.");
        sentence.add("a");
        sentence.add("is");
        sentence.add("This");

        System.out.println(sentence.toString());

        Collections.reverse(sentence);

        System.out.println(sentence);
    }
}
