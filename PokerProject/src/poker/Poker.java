package poker;

// TODO: Auto-generated Javadoc
/**
 * The Class Poker.
 */
public class Poker {
	
	/**
	 * Checks if is full house.
	 *
	 * @param cards the cards
	 * @param n the n
	 * @return true, if is full house
	 */
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isFullHouse(String cards[], int n) {
		return isThreeOfaKind(cards, n) && isTwoPairs(cards, n);
	}

	/**
	 * Checks if is three ofa kind.
	 *
	 * @param cards the cards
	 * @param n the n
	 * @return true, if is three ofa kind
	 */
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isThreeOfaKind(String cards[], int n) {
		int count = 0;
		for (int i=0; i<n-2; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1) &&
					cards[i+1].charAt(1) == cards[i+2].charAt(1)) {
				count++;
			}
		}
		if (count == 1)
			return true;
		else
			return false;
	}
	
	/**
	 * Checks if is two pairs.
	 *
	 * @param cards the cards
	 * @param n the n
	 * @return true, if is two pairs
	 */
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isTwoPairs(String cards[], int n) {
		int count = 0;
		for (int i=0; i<n-1; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1)) {
				count++;
				i++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;
	}
	
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isFourOfaKind(String cards[], int n) {
		int count = 0;
		for (int i=0; i<n-2; i++) {
			if (cards[i].charAt(1) == cards[i+1].charAt(1) &&
					cards[i+1].charAt(1) == cards[i+2].charAt(1) &&
					cards[i+2].charAt(1) == cards[i+3].charAt(1)) {
				count++;
			}
		}
		if (count == 1)
			return true;
		else
			return false;
	}
	
	public void bubbleSort(String cards[], int n)
	{
	    int i, j;
	    boolean swapped;
	    String temp;
	    for (i = 0; i < n - 1; i++) {
	        swapped = false;
	        for (j = 0; j < n - i - 1; j++) {
	            if (cards[j].charAt(1) > cards[j + 1].charAt(1)) {
	            	temp = cards[j];
	                cards[j] = cards[j + 1];
	                cards[j + 1] = temp;
	                swapped = true;
	            }
	        }
	 
	        // If no two elements were swapped
	        // by inner loop, then break
	        if (swapped == false)
	            break;
	    }
	}
	
	/**
	 * Test find bugs.
	 */
	public void testFindBugs() {
		String a=null;
		if(a.equals("")) return;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		String[] cards = new String[] {"C2", "D2", "H4", "H2", "S4"};
		Poker poker = new Poker();
		poker.bubbleSort(cards, 5);
		System.out.println(poker.isFullHouse(cards, 5));
	}
}
// end of Poker.java
