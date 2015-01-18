package manager;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Samanta
 * @version 1.5 Implements Subject
 */
public class ShoppingCart implements Subject {
	private Set<Observer> observers;
	private Counter counter;
	private HashMap<String, Product> items;

	public ShoppingCart() {
		this.items = new HashMap<String, Product>();
		this.counter = counter.getInstance();
		this.observers = new HashSet<Observer>();
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void doNotify(String note) {
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext()) {
			Observer observer = it.next();
			observer.doUpdate(note);
		}

	}

	/*
	 * Display info about all items in the cart
	 */
	public void displayItems() {
		Iterator<String> it = items.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			this.items.get(key).toString();
		}
	}

	/*
	 * incorporates notification when a product is added
	 */
	public void addItem(Item item) {
		this.items.put(item.getCode(), item);
		doNotify("new product is added");
	}

	/*
	 * incorporates notification when a price is changed
	 */
	public void changePrice(String code, double newPrice) {
		this.items.get(code).setPrice(newPrice);
		doNotify("the price of an item was changed");
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
	 * after paying delete items incorporates notification when a new
	 * transaction was made
	 */
	public void pay(Payment payment) {
		System.out.println("payment transaction number: " + counter.getSecuence());
		payment.pay(calculateTotal(), this);
		removeAllItems();
		doNotify("new transaction was made");
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
