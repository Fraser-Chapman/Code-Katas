package uk.co.autotrader.randomchallenges.rockpaperscissors;

public class Player {
    private Input input;

    public Player(Input input) {
        this.input = input;
    }
    
    public Input getInput() {
        return input;
    }
    
    public void setInput(Input input) {
        this.input = input;
    }
}
