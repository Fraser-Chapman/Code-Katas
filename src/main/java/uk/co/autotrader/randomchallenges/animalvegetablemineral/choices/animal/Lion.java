package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

public class Lion extends Feline {
    @Override
    public Boolean isDomesticated() {
        return false;
    }

    @Override
    public String getName() {
        return "lion";
    }
}
