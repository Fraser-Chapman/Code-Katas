package uk.co.autotrader.randomchallenges.animalvegetablemineral;

public interface Choice {
    default public String getType() {
        return "choice";
    }

    String getName();


    default public int getNumberOfLegs() {
        return 0;
    }

    default public boolean hasfur() {
        return false;
    }
    default public boolean isShiny() {
        return false;
    }

    default public boolean isRootVegetable() {
        return false;
    }

    default public boolean isDomesticated() {
        return false;

    }

    default public boolean isCarnivore() {
        return false;

    }

    default public boolean hasTail() {
        return false;

    }
}
