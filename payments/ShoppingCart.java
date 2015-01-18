package payments;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Samanta
 * @version 1.0
 */
public class ShoppingCart {
	// map of items
	private HashMap<String, Item> items;

	public ShoppingCart() {
		this.items = new HashMap<String, Item>();
	}

	public void addItem(Item item) {
		this.items.put(item.getCode(), item);
	}

	public void removeItem(Item item) {
		this.items.remove(item.getCode());
	}

	public int calculateTotal() {
		int sum = 0;
		Iterator<String> it = items.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			sum = sum + items.get(key).getPrice();
		}
		return sum;
	}

	public void pay(Payment payment) {
		int amount = calculateTotal();
		payment.pay(amount);
	}
}
