package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

public class HoneyBadger extends Animal {
    public int getNumberOfLegs() {
        return 4;
    }

    public boolean hasTail() {
        return true;
    }

    public boolean hasFur() {
        return true;
    }

    public boolean isCarnivore() {
        return false;
    }

    public boolean isDomesticated() {
        return false;
    }

    public String getName() {
        return "honey badger";
    }
}
