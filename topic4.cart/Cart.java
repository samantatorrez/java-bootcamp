package bootcamp412.topic4_1_and_2;

/**
 * Provides the functionalities of cart management
 * 
 * @author Samanta
 */
public interface Cart {
	public void addItem(String code, double price);

	public void addItem(String code, double price, int quantity);

	public void removeItem(String code);

	public void pay();

	public void pay(String user, String pass);

	public double calculateTotal();

	public boolean isEmpty();

	public boolean contains(String code);
}
