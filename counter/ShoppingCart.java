package counter;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Samanta
 * @version 1.2 Incorporate a counter for payment transaction number
 */
public class ShoppingCart {
	private Counter counter;
	private HashMap<String, Item> items;

	public ShoppingCart() {
		this.items = new HashMap<String, Item>();
		this.counter = counter.getInstance();
	}

	public void addItem(Item item) {
		this.items.put(item.getCode(), item);
	}

	public void removeItem(Item item) {
		this.items.remove(item.getCode());
	}

	/*
	 * incorporate removeAllItems
	 */
	public void removeAllItems() {
		this.items.clear();
	}

	public Double calculateTotal() {
		Double sum = 0.0;
		Iterator<String> it = items.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			sum = sum + items.get(key).getPrice();
		}
		return sum;
	}

	/*
	 * after paying delete items
	 */
	public void pay(Payment payment) {
		System.out.println("payment transaction number: " + counter.getSecuence());
		payment.pay(calculateTotal(), this);
		removeAllItems();
	}

	/*
	 * return the most expensive price
	 */
	public Double getExpensive() {
		Iterator<String> it = items.keySet().iterator();
		String expensiveKey = it.next();
		Double expensivePrice = items.get(expensiveKey).getPrice();

		while (it.hasNext()) {
			String key = it.next();
			if (items.get(key).getPrice() > expensivePrice) {
				expensivePrice = items.get(key).getPrice();
				expensiveKey = key;
			}
		}
		return items.get(expensiveKey).getPrice();
	}

	/*
	 * return the cheapest price
	 */
	public Double getCheapest() {
		Iterator<String> it = items.keySet().iterator();
		String cheapKey = it.next();
		Double cheapPrice = items.get(cheapKey).getPrice();

		while (it.hasNext()) {
			String key = it.next();
			if (items.get(key).getPrice() < cheapPrice) {
				cheapPrice = items.get(key).getPrice();
				cheapKey = key;
			}
		}
		return items.get(cheapKey).getPrice();
	}
}
