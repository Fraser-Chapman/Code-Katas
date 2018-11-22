package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElementFromArrayList {

    //Write a Java program to retrieve an element (at a specified index) from a given array list.

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Jill");
        names.add("Kevin");

        System.out.println(names.get(1));
    }
}
