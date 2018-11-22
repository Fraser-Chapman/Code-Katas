package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class TestIfListIsEmpty {
    public static void main(String[] args) {
        List<String> notEmpty = new ArrayList<>();
        notEmpty.add("sdcj");
        notEmpty.add("ssqa");
        notEmpty.add("gbgefe");

        List<String> empty = new ArrayList<>();

        if(!notEmpty.isEmpty()){
            System.out.println("Yes!");
        }
        else {
            System.out.println("No");
        }
        if(empty.isEmpty()){
            System.out.println("Yes!");
        }
        else {
            System.out.println("No");
        }
    }
}
