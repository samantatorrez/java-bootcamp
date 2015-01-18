package display;

/**
 * @author Samanta
 * @version 1.2 Incorporate toString function
 */

public class Item {
	private String code;
	private Double price;

	public Item(String code, Double cost) {
		this.code = code;
		this.price = cost;
	}

	public String getCode() {
		return this.code;
	}

	public Double getPrice() {
		return price;
	}

	public String toString() {
		return this.code + " ....... $ " + this.price;
	}
}
