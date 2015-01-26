package bootcamp412.topic4_1_and_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Samanta
 * @version 1.0
 * 
 */
public class ShoppingCart implements Cart {

	private Map<String, Item> items;

	public ShoppingCart() {
		this.items = new HashMap<String, Item>();
	}

	@Override
	public void addItem(String code, double price) {
		if (items.containsKey(code)) {
			items.get(code).increase();
		} else {
			this.items.put(code, new Item(code, price));
		}
	}

	@Override
	public void addItem(String code, double price, int quantity) {
		Item item = new Item(code, price);
		item.setQuantity(quantity);
		this.items.put(code, item);
	}

	@Override
	public void removeItem(String code) {
		this.items.remove(code);
	}

	@Override
	public double calculateTotal() {
		double sum = 0;
		Iterator<String> it = items.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			sum = sum + items.get(key).getPrice() * items.get(key).getQuantity();
		}
		return sum;
	}

	private void clear() {
		this.items.clear();
	}

	@Override
	public void pay() {
		PaymentCash cash = new PaymentCash();
		double amount = calculateTotal();
		cash.pay(amount);
		clear();
	}

	@Override
	public void pay(String user, String pass) {
		PaymentElectronic electronic = new PaymentElectronic(user, pass);
		double amount = calculateTotal();
		electronic.pay(amount);
		clear();
	}

	@Override
	public boolean isEmpty() {
		if (items.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(String code) {
		if (items.containsKey(code)) {
			return true;
		}
		return false;
	}

}
