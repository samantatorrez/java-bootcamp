package payments;

/**
 * @author Samanta
 * @version 1.0
 */
public class PaymentCash implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println(amount + "paid using cash payment");

	}

}
