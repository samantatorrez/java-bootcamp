package offers;

/**
 * @author Samanta
 * @version 1.3 Implements Product
 */

public class Item implements Product {
	private String code;
	private Double price;

	public Item(String code, Double cost) {
		this.code = code;
		this.price = cost;
	}

	public String getCode() {
		return this.code;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return this.code + " ....... $ " + this.price;
	}
}
