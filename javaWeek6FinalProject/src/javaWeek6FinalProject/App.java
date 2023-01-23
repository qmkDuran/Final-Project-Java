package javaWeek6FinalProject;

public class App {
	public static void main(String[] args) {
		// Instantiating new Deck
		Deck deck = new Deck();

		// Instantiating two new players
		Player playerOne = new Player("Michael");
		Player playerTwo = new Player("Super Mario");

		// Shuffle the deck (with test):
		// System.out.println(deck.toString());
		deck.shuffle();
		// System.out.println(deck.toString());

		// Each player drawing their cards and adding to their hand
		for (int i = 0; i < 26; i++) {
			playerOne.draw(deck);
			playerTwo.draw(deck);
		}
		// Testing the describe method for Player class
		// playerOne.describe();
		// playerTwo.describe();

		// Comparing values and changing scores
		int playerOneValue, playerTwoValue;

		for (int i = 0; i < 26; i++) {

			playerOneValue = playerOne.flip().getValue();

			playerTwoValue = playerTwo.flip().getValue();

			if (playerOneValue > playerTwoValue) {
				playerOne.incrementScore();
				System.out.println(playerOne.getName() + " wins this round!");
			} else if (playerTwoValue > playerOneValue) {
				playerTwo.incrementScore();
				System.out.println(playerTwo.getName() + " wins this round!");
			} else {
				System.out.println("Draw");
			}
			System.out.println("Score - " + playerOne.getName() + ": " + playerOne.getScore() + " "
					+ playerTwo.getName() + ": " + playerTwo.getScore() + "\n");
		}

		// Displaying final score and winner of the game.
		System.out.println("Final Score - " + playerOne.getName() + ": " + playerOne.getScore() + " "
				+ playerTwo.getName() + ": " + playerTwo.getScore() + "\n");
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println(playerOne.getName() + " wins the game!");
		} else if (playerTwo.getScore() > playerOne.getScore()) {
			System.out.println(playerTwo.getName() + " wins the game!");
		} else {
			System.out.println("The game is a draw!");
		}

	}// end of main method

}// end of class