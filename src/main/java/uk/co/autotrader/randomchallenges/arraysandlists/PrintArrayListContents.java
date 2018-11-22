package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayListContents {
    public static void main(String[] args) {
        //Write a Java program to create a new array list,
        //add some colors (string) and print out the collection.

        List<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Blue");
        colours.add("Green");
        colours.add("Yellow");

        for(String colour : colours) {
            System.out.println(colour);
        }
    }
}
