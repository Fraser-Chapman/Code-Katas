package uk.co.autotrader.randomchallenges.animalvegetablemineral;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.Choice;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal.HoneyBadger;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal.HouseCat;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal.Lion;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.mineral.Coal;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.vegetable.Broccoli;

import java.util.*;

public class AnimalVegetableMineral {
    private static final String QUESTION_1 = "Animal, Vegetable or Mineral?";
    private static final String QUESTION_2 = "question 2";
    private static final String QUESTION_3 = "question 3";
    private static final String QUESTION_4 = "question 4";
    private static final String QUESTION_5 = "question 5";
    private static final String QUESTION_6 = "question 6";

    public static LinkedHashMap<Integer, String> questions;
    public static Choice choice;

    private static LinkedHashMap<Integer, String> buildInitialQuestions() {
        LinkedHashMap questions = new LinkedHashMap();
        questions.put(1, QUESTION_1);
        questions.put(2, QUESTION_2);
        questions.put(3, QUESTION_3);
        questions.put(4, QUESTION_4);
        questions.put(5, QUESTION_5);
        questions.put(6, QUESTION_6);

        return questions;
    }

    private static void printQuestions(LinkedHashMap<Integer, String> questions) {
        System.out.println("What would you like to ask? \n Please enter the corresponding number: ");
        for (int i = 1; i <= questions.size(); i++) {
            System.out.println(i + ": " + questions.get(i));
        }
    }

    private static Integer getUserQuestion() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private static String askQuestion(int questionNumber){
        switch (questionNumber) {
            case (1):
                questions.remove(1);
                return choice.getType();

        }
        throw new RuntimeException("Feature not yet implemented");
    }

    private static Choice selectRandomChoice() {
        List<Choice> choiceList = new ArrayList<>();
        choiceList.add(new HouseCat());
        choiceList.add(new Lion());
        choiceList.add(new HoneyBadger());
        choiceList.add(new Broccoli());
        choiceList.add(new Coal());

        Collections.shuffle(choiceList);
        return choiceList.get(0);
    }

    public static void main(String[] args) {
        choice = selectRandomChoice();
        questions = buildInitialQuestions();
        printQuestions(questions);
        System.out.println(askQuestion(getUserQuestion()));
    }
}