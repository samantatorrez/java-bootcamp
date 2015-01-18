package display;

/**
 * @author Samanta
 * @version 1.1 amount change: int to double incorporate shoppingCart parameter
 */

public interface Payment {

	public void pay(double amount, ShoppingCart cart);
}
