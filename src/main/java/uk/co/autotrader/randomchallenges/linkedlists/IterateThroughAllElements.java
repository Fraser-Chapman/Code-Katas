package uk.co.autotrader.randomchallenges.linkedlists;

import java.util.LinkedList;

public class IterateThroughAllElements {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        for (int integer : linkedList) {
            System.out.println(integer);
        }
    }
}
