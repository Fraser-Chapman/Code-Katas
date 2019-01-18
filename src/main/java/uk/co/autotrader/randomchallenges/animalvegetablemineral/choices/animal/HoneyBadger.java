package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

public class HoneyBadger extends Animal {
    public Integer getNumberOfLegs() {
        return 4;
    }

    public Boolean hasTail() {
        return true;
    }

    public Boolean hasFur() {
        return true;
    }

    public Boolean isCarnivore() {
        return false;
    }

    public Boolean isDomesticated() {
        return false;
    }

    public String getName() {
        return "honey badger";
    }
}
