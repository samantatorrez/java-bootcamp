package counter;

/**
 * @author Samanta
 * @version 1.1 Change price: int to Double
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

}
