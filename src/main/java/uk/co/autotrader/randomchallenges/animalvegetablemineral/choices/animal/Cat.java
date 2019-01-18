package uk.co.autotrader.randomchallenges.animalvegetablemineral.choices.animal;

public class Cat extends Feline {

    @Override
    public boolean isDomesticated() {
        return true;
    }

    @Override
    public String getName() {
        return "cat";
    }
}
