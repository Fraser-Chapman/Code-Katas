package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

public class HoneyBadger extends Animal {
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
        return false;
    }

    @Override
    public boolean isDomesticated() {
        return false;
    }

    @Override
    public String getName() {
        return "honey badger";
    }
}
