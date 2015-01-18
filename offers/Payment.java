package offers;

/**
 * @author Samanta
 * @version 1.1 amount change: int to double incorporates shoppingCart parameter
 */

public interface Payment {

	public void pay(double amount, ShoppingCart cart);
}
