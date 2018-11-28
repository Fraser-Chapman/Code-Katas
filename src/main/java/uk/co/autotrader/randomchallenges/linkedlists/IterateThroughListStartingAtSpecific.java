package uk.co.autotrader.randomchallenges.linkedlists;

import java.util.LinkedList;

public class IterateThroughListStartingAtSpecific {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        for (int i = (linkedList.size()/2); i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
