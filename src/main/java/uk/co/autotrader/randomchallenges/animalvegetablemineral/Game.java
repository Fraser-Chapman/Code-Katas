package uk.co.autotrader.randomchallenges.animalvegetablemineral;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.Choice;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.ComputerChoice;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private final Choice choice;

    private boolean hasGuessed = false;
    private final String[][] questionsArray;

    private Game() {
        ComputerChoice computer = new ComputerChoice();
        choice = computer.selectRandomChoice();
        QuestionsBank questionsBank = new QuestionsBank(choice);
        questionsArray = questionsBank.questionsArray;
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

        while (!game.hasGuessed) {
            game.printQuestions();
            System.out.println(game.askQuestion(game.getUserQuestion()));
            game.promptUserForGuess();
        }
    }
}