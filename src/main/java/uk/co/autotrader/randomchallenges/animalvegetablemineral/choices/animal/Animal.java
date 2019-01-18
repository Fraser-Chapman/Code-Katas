package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.Choice;

public abstract class Animal implements Choice {

    @Override
    public Integer getNumberOfLegs() {
        return 2;
    }

    @Override
    public String getType() {
        return "Animal";
    }
}
