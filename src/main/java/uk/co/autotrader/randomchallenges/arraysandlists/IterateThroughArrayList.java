package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class IterateThroughArrayList {

    //Write a Java program to iterate through all elements in a array list.

    public static void main(String[] args) {
        List<Integer> timesTable = new ArrayList<>();
        timesTable.add(1);
        timesTable.add(2);
        timesTable.add(3);
        timesTable.add(4);
        timesTable.add(5);
        timesTable.add(6);
        timesTable.add(7);
        timesTable.add(8);
        timesTable.add(9);
        timesTable.add(10);

        System.out.println("The two times table is:");
        for(int number : timesTable){
            System.out.println(number * 2);
        }

        System.out.println("The three times table is:");
        for(int number : timesTable){
            System.out.println(number * 3);
        }
    }
}
