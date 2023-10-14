package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    public int score; // change the access modifier to public
    private String name;

    // Constructor
    public Player(String name) {
        this.hand = new ArrayList<>();
        this.score = 0;
        this.name = name;
    }

    // Method to describe the player and the hand
    public void describe() {
        System.out.println("Player: " + this.name);
        for (Card card : this.hand) {
            card.describe();
        }
        System.out.println("Score: " + this.score);
    }

    // Method to flip a card
    public Card flip() {
        if (this.hand.size() > 0) {
            return this.hand.remove(0);
        } else {
            return null; // or throw an exception
        }
    }

    // Method to draw a card
    public void draw(Deck deck) {
        Card newCard = deck.draw();
        this.hand.add(newCard);
    }

    // Method to increment the score
    public void incrementScore() {
        this.score++;
    }
}
