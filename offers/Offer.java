package offers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samanta
 * @version 1.0 includes other individual items or other offers
 */
public class Offer implements Product {
	private String code;
	private double price;
	private List<Product> products;

	public Offer(String code, double price) {
		this.code = code;
		this.price = price;
		this.products = new ArrayList<Product>();
	}

	public String toString() {
		String display;
		display = this.code + " ....... $ " + this.price;
		for (int i = 0; i < products.size(); i++) {
			display = display + "/n/t" + products.get(i).toString();
		}
		return display;
	}

	@Override
	public double getPrice() {
		return this.price;
	}
}
