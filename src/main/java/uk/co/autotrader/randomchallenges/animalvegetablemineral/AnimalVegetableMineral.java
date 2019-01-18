package uk.co.autotrader.randomchallenges.animalvegetablemineral;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal.Cat;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal.HoneyBadger;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal.Lion;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.mineral.Coal;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.vegetable.Broccoli;

import java.util.*;

public class AnimalVegetableMineral {
    private static final String QUESTION_1 = "Animal, Vegetable or Mineral?";
    private static final String QUESTION_2 = "Does it have fur?";
    private static final String QUESTION_3 = "question 3";
    private static final String QUESTION_4 = "question 4";
    private static final String QUESTION_5 = "question 5";
    private static final String QUESTION_6 = "question 6";

    private static LinkedHashMap<Integer, String> questions;
    private static Choice choice;
    private static Scanner scanner = new Scanner(System.in);

    private static boolean hasGuessed = false;

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

    //TODO look at extracting more into this method as it doesn't really do what it says it goes.
    private static Integer getUserQuestion() {
        return Integer.parseInt(scanner.nextLine());
    }

    private static String askQuestion(int questionNumber){
        switch (questionNumber) {
            case (1):
                questions.remove(1);
                return choice.getType();

            case (2):
                questions.remove(2);

        }
        throw new RuntimeException("Feature not yet implemented");
    }

    private static Choice selectRandomChoice() {
        List<Choice> choiceList = new ArrayList<>();
        choiceList.add(new Cat());
        choiceList.add(new Lion());
        choiceList.add(new HoneyBadger());
        choiceList.add(new Broccoli());
        choiceList.add(new Coal());

        Collections.shuffle(choiceList);
        return choiceList.get(0);
    }

    private static void promptUserForGuess() {
        System.out.println("Would you like to guess what I'm thinking of? (y/n)");
        String input = scanner.nextLine().toLowerCase();

        if (input.equals("y")) {
            hasGuessed = true;
            guessChoice();
        }
    }

    private static void guessChoice() {
        System.out.println("Please enter your guess: ");
        String guess = scanner.nextLine().toLowerCase();
        if (guess.equals(choice.getName())){
            System.out.println("Congratulations! You guessed right!");
        }
        else {
            System.out.println("Wrong! The correct answer is: " + choice.getName());
        }
    }

    public static void main(String[] args) {
        choice = selectRandomChoice();
        questions = buildInitialQuestions();
        while (!hasGuessed) {
            printQuestions(questions);
            System.out.println(askQuestion(getUserQuestion()));
            promptUserForGuess();
        }
    }
}