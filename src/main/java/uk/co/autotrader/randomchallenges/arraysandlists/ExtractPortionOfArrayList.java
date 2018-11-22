package uk.co.autotrader.randomchallenges.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortionOfArrayList {
    public static void main(String[] args) {
        List<String> message = new ArrayList<>();
        message.add("fjvbd");
        message.add("Green");
        message.add("Apple");
        message.add("Hello");
        message.add("World!");
        message.add("Cssis");
        message.add("Purple");

        List<String> hiddenMessage = new ArrayList<>(message.subList(3, 5));

        System.out.println(hiddenMessage);
    }

}
