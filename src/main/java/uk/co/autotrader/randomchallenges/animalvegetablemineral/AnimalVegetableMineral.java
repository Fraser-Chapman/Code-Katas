package uk.co.autotrader.randomchallenges.animalvegetablemineral;

import java.util.ArrayList;
import java.util.List;

public class AnimalVegetableMineral {

    private static final String QUESTION_1 = "question 1";
    private static final String QUESTION_2 = "question 2";
    private static final String QUESTION_3 = "question 3";
    private static final String QUESTION_4 = "question 4";
    private static final String QUESTION_5 = "question 5";
    private static final String QUESTION_6 = "question 6";

    public static void printQuestions(List<String> questions) {
        int count = 0;

        for (String question : questions) {
            count++;
            System.out.println(count + ": " + question);
        }
    }

    private static List<String> buildInitialQuestions() {
        List<String> questions = new ArrayList<>();
        questions.add(QUESTION_1);
        questions.add(QUESTION_2);
        questions.add(QUESTION_3);
        questions.add(QUESTION_4);
        questions.add(QUESTION_5);
        questions.add(QUESTION_6);

        return questions;
    }

    public static void main(String[] args) {
        List<String> questions = buildInitialQuestions();
        printQuestions(questions);
    }
}
