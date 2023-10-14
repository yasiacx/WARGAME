package game;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            if (card1 != null && card2 != null) {
                card1.describe();
                card2.describe();

                if (card1.getValue() > card2.getValue()) {
                    player1.incrementScore();
                    System.out.println("Player 1 gets a point.");
                } else if (card1.getValue() < card2.getValue()) {
                    player2.incrementScore();
                    System.out.println("Player 2 gets a point.");
                } else {
                    System.out.println("It's a tie. No point awarded.");
                }
            } else {
                System.out.println("The deck is empty. Cannot proceed further.");
                break;
            }
        }

        System.out.println("Final Score:");
        System.out.println("Player 1: " + player1.score);
        System.out.println("Player 2: " + player2.score);

        if (player1.score > player2.score) {
            System.out.println("Player 1 wins!");
        } else if (player1.score < player2.score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}

