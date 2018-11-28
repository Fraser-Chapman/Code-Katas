package uk.co.autotrader.randomchallenges.linkedlists;

import java.util.LinkedList;

public class IterateInReverseOrder {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("sentence");
        linkedList.add("a");
        linkedList.add("is");
        linkedList.add("This");

        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }
    }
}
