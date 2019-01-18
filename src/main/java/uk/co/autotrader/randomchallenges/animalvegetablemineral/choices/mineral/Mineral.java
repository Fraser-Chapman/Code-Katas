package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.mineral;

import uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.Choice;

public abstract class Mineral extends Choice {
    public abstract boolean isRare();
    public abstract boolean isShiny();

    public String getType() {
        return "Mineral";
    }
}
