package game;

public class Card {
    private int value;
    private String name;

    // Constructors
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to describe a card
    public void describe() {
        System.out.println("Card Name: " + this.name + ", Value: " + this.value);
    }
}
