package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class AddElementToStartOfList {
    //Write a Java program to insert an element into the array list at the first position.

    public static void main(String[] args) {

        List<String> sentence = new ArrayList<>();
        sentence.add("is");
        sentence.add("a");
        sentence.add("sentence.");

        System.out.println(sentence.toString());
        System.out.println("oops");

        sentence.add(0, "This");

        System.out.println(sentence.toString());
    }
}
