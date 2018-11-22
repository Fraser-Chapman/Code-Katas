package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(1);

        if (list1.equals(list2)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        list2.set(3, 1);

        if (list1.equals(list2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
