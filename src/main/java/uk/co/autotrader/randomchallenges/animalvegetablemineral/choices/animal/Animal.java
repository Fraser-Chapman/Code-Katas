package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.Choice;

public abstract class Animal extends Choice {
    public abstract int howManyLegs();
    public abstract boolean hasTail();
    public abstract boolean hasFur();
    public abstract boolean isCarnivore();
    public abstract boolean isDomesticated();

    public String getType() {
        return "Animal";
    }
}
