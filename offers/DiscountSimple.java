package offers;

/**
 * @author Samanta Strategy pattern
 * @version 1.0
 */
public class DiscountSimple implements Discount {
	private int percent;

	public DiscountSimple(int percent) {
		this.percent = percent;
	}

	@Override
	public Double apply(ShoppingCart cart) {
		return cart.calculateTotal() * percent / 100;

	}

}
