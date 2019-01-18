package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal.Cat;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal.HoneyBadger;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal.Lion;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.mineral.Coal;
import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.vegetable.Broccoli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerChoice {

    private Choice choice = selectRandomChoice();

    public Choice selectRandomChoice() {
        List<Choice> choiceList = new ArrayList<>();
        choiceList.add(new Cat());
        choiceList.add(new Lion());
        choiceList.add(new HoneyBadger());
        choiceList.add(new Broccoli());
        choiceList.add(new Coal());

        Collections.shuffle(choiceList);
        return choiceList.get(0);
    }

    public Choice getChoice() {
        return choice;
    }
}
