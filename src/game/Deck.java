package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    // Constructor
    public Deck() {
        this.cards = new ArrayList<>();
        // Populating the standard 52 cards
        for (int i = 2; i <= 14; i++) {
            for (String suit : new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}) {
                String name = "";
                if (i < 11) {
                    name = i + " of " + suit;
                } else if (i == 11) {
                    name = "Jack of " + suit;
                } else if (i == 12) {
                    name = "Queen of " + suit;
                } else if (i == 13) {
                    name = "King of " + suit;
                } else if (i == 14) {
                    name = "Ace of " + suit;
                }
                Card card = new Card(i, name);
                this.cards.add(card);
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to draw a card
    public Card draw() {
        if (this.cards.size() > 0) {
            return this.cards.remove(0);
        } else {
            return null; // or throw an exception
        }
    }
}
