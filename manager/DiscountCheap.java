package manager;

/**
 * @author Samanta Strategy pattern
 * @version 1.0
 */
public class DiscountCheap implements Discount {
	private int percent;

	public DiscountCheap(int percent) {
		this.percent = percent;
	}

	@Override
	public Double apply(ShoppingCart cart) {
		return cart.getCheapest() * this.percent / 100;
	}
}
