package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

public abstract class Feline extends Animal {

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public boolean hasTail() {
        return true;
    }

    @Override
    public boolean isCarnivore() {
        return true;
    }

    public boolean hasFur() {
        return true;
    }
}
