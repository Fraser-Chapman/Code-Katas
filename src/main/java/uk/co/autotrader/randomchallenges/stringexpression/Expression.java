package uk.co.autotrader.randomchallenges.stringexpression;

public enum Expression {
    PLUS("plus", "+"),
    MINUS("minus", "-"),
    DIVIDEDBY("dividedby", "/"),
    TIMES("times", "*"),
    ZERO("zero", "0"),
    ONE("one", "1"),
    TWO("two", "2"),
    THREE("three", "3"),
    FOUR("four", "4"),
    FIVE("five", "5"),
    SIX("six", "6"),
    SEVEN("seven", "7"),
    EIGHT("eight", "8"),
    NINE("nine", "9");

    private final String key;
    private final String value;

    Expression(String key, String value) {

        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public String mapFromKeyToValue() {

        return null;
    }

    public String mapFromValuetoKey() {
        return null;
    }
}
