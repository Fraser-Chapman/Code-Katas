package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

public abstract class Feline extends Animal {

    @Override
    public Integer getNumberOfLegs() {
        return 4;
    }

    @Override
    public Boolean hasTail() {
        return true;
    }

    @Override
    public Boolean isCarnivore() {
        return true;
    }

    public Boolean hasFur() {
        return true;
    }
}
