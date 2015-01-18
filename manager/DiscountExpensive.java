package manager;

/**
 * @author Samanta Strategy pattern
 * @version 1.0
 */
public class DiscountExpensive implements Discount {

	private int percent;

	public DiscountExpensive(int percent) {
		this.percent = percent;
	}

	@Override
	public Double apply(ShoppingCart cart) {
		return cart.getExpensive() * this.percent / 100;
	}

}
