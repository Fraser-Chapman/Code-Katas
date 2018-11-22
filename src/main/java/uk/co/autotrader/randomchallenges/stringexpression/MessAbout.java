package uk.co.autotrader.randomchallenges.stringexpression;

import java.util.Arrays;
import java.util.List;

public class MessAbout {
    public static void main(String[] args) {

        Character result = '/';

        List<Character> operators = Arrays.asList('+', '-', '*', '/');

        for (Character operator : operators) {
            if (result.equals(operator)) {
                System.out.println("Yes");
                break;
            }
            else{
                System.out.println("No");
            }
        }
    }
}
