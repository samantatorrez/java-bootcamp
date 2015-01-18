package payments;

/**
 * @author Samanta
 * @version 1.0
 */
public class Item {
	private String code;
	private int price;

	public Item(String code, int cost) {
		this.code = code;
		this.price = cost;
	}

	public String getCode() {
		return this.code;
	}

	public int getPrice() {
		return price;
	}

}
