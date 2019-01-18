package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.mineral;

public class Coal extends Mineral {
    @Override
    public boolean isRare() {
        return false;
    }

    @Override
    public boolean isShiny() {
        return false;
    }

    @Override
    public String getName() {
        return "coal";
    }
}