package uk.co.autotrader.randomchallenges.animalvegetablemineral;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.Choice;

public class QuestionsBank {

    private static final String QUESTION_1 = "Animal, Vegetable or Mineral?";
    private static final String QUESTION_2 = "Does it have fur?";
    private static final String QUESTION_3 = "How many legs?";
    private static final String QUESTION_4 = "Is it a domesticated animal?";
    private static final String QUESTION_5 = "Does it have a tail?";
    private static final String QUESTION_6 = "Is is a root vegetable?";


    public final String[][] questionsArray;

    public QuestionsBank(Choice choice) {
        this.questionsArray = questionsArrayBuilder(choice);
    }

    private String[][] questionsArrayBuilder(Choice choice) {
        String[][] array = new String[][]{{
                QUESTION_1, choice.getType()},
                {QUESTION_2, choice.hasFur().toString()},
                {QUESTION_3, choice.getNumberOfLegs().toString()},
                {QUESTION_4, choice.isDomesticated().toString()},
                {QUESTION_5, choice.hasTail().toString()},
                {QUESTION_6, choice.isRootVegetable().toString()}
        };

        return array;
    }
}
