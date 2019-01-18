package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

public abstract class Feline extends Animal {

    @Override
    public int howManyLegs() {
        return 4;
    }

    @Override
    public boolean hasTail() {
        return true;
    }

    @Override
    public boolean hasFur() {
        return true;
    }

    @Override
    public boolean isCarnivore() {
        return true;
    }

}
