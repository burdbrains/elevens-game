import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {	// rename to just "Tester" //

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Ace", "Spades", 1);
		Card card2 = new Card("ace", "spades", 1);
		Card card3 = new Card("AcE", "HeArts", 1);

		/*System.out.println(card3.toString());
		System.out.println(card3.suit());
		System.out.println(card3.rank());
		System.out.println(card3.pointValue());

		System.out.println(card1.matches(card2));*/


		ArrayList<String> ranks = new ArrayList<String>(Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"));
		ArrayList<String> suits = new ArrayList<String>(Arrays.asList("Spades", "Clubs", "Diamonds", "Hearts"));
		ArrayList<Integer> values = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));

		Deck deck = new Deck(ranks, suits, values);

		// System.out.println(deck.isEmpty());

		System.out.println(deck.size());
		System.out.println(deck.deal().toString());
		System.out.println(deck.size());

		System.out.println(deck.toString());

	}
}
