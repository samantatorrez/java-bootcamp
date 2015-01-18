package offers;

/**
 * @author Samanta Singleton Pattern what it does is creates a single instance
 *         and sets the counter to zero . When getsecuence is called the counter
 *         increases by one
 */
public class Counter {
	private int secuence;

	private static Counter counter = null;

	private Counter() {
		this.secuence = 0;
	}

	public static Counter getInstance() {
		if (counter == null) {
			counter = new Counter();
		}
		return counter;
	}

	public int getSecuense() {
		secuence++;
		return this.secuence;
	}

	public int getSecuence() {
		return this.secuence;
	}
}
