package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"six", "two", "jack", "ace", "queen"};
		String[] suits = {"clubs", "hearts"};
		int[] values = {6,2,11,1,12};
		
		Deck2 d = new Deck2(ranks, suits, values);
		d.deal();
		d.deal();
		d.deal();
		System.out.println(d.toString());
	}
}
