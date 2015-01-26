package bootcamp412.topic4_1_and_2;

/**
 * @author Samanta
 * @version 1.0
 */
public class Item {
	private String code;
	private double price;
	private int quantity;

	public Item(String code, double cost) {
		this.code = code;
		this.price = cost;
		this.quantity = 1;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void increase() {
		this.quantity++;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCode() {
		return this.code;
	}

	public double getPrice() {
		return price;
	}

}
