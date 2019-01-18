package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.Choice;

public abstract class Animal implements Choice {

    @Override
    public int getNumberOfLegs() {
        return 2;
    }

    @Override
    public String getType() {
        return "Animal";
    }
}
