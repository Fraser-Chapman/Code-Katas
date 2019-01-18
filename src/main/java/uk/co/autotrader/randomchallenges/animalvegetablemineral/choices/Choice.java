package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices;

public interface Choice {
    default public String getType() {
        return "choice";
    }

    String getName();


    default public Integer getNumberOfLegs() {
        return 0;
    }

    default public Boolean hasFur() {
        return false;
    }
    default public Boolean isShiny() {
        return false;
    }

    default public Boolean isRootVegetable() {
        return false;
    }

    default public Boolean isDomesticated() {
        return false;

    }

    default public Boolean isCarnivore() {
        return false;

    }

    default public Boolean hasTail() {
        return false;

    }
}
