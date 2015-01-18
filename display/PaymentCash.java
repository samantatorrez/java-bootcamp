package display;

/**
 * @author Samanta
 * @version 1.1
 * 
 */
public class PaymentCash implements Payment {

	@Override
	public void pay(double amount, ShoppingCart cart) {
		System.out.println(amount + "paid using cash payment");

	}

}
