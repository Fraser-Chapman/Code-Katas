package uk.co.autotrader.randomchallenges.animalvegetablemineral;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.Choice;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.ComputerChoice;

import java.util.Scanner;

public class Game {
    private static final String QUESTION_1 = "Animal, Vegetable or Mineral?";
    private static final String QUESTION_2 = "Does it have fur?";
    private static final String QUESTION_3 = "How many legs?";
    private static final String QUESTION_4 = "question 4";
    private static final String QUESTION_5 = "question 5";
    private static final String QUESTION_6 = "question 6";

    private Scanner scanner = new Scanner(System.in);
    private final Choice choice;

    private static boolean hasGuessed = false;
    private final String[][] questionsArray;


    public Game() {
        ComputerChoice computer = new ComputerChoice();
        choice = computer.selectRandomChoice();

        questionsArray = new String[][]{{QUESTION_1, choice.getType()}, {QUESTION_2, choice.hasFur().toString()}, {QUESTION_3, choice.getNumberOfLegs().toString()}};
    }

    private void printQuestions() {
        System.out.println("What would you like to ask? \nPlease enter the corresponding number: ");
        for (int i = 0; i < questionsArray.length; i++) {
            System.out.println((i+1) + ": " + questionsArray[i][0]);
        }
    }

    private Integer getUserQuestion() {
        return Integer.parseInt(scanner.nextLine());
    }

    private String askQuestion(int questionNumber) {
        questionNumber--;
        return questionsArray[questionNumber][1];
    }

    private void promptUserForGuess() {
        System.out.println("Would you like to guess what I'm thinking of? (y/n)");
        String input = scanner.nextLine().toLowerCase();

        if (input.equals("y")) {
            hasGuessed = true;
            guessChoice();
        }
    }

    private void guessChoice() {
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
        Game game = new Game();

        while (!hasGuessed) {
            game.printQuestions();
            System.out.println(game.askQuestion(game.getUserQuestion()));
            game.promptUserForGuess();
        }
    }
}