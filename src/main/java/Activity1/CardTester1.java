package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card1 c1 = new Card1("queen", "hearts", 12);
		Card1 c2 = new Card1("six", "diamonds", 6);
		Card1 c3 = new Card1("six", "diamonds", 6);
		
		System.out.println(c1.suit());
		System.out.println(c2.rank());
		System.out.println(c3.pointValue());
		System.out.println(c1.matches(c2));
		System.out.println(c2.matches(c3));
		System.out.println(c3.toString());

	}
}
