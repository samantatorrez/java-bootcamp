package bootcamp412.topic4_1_and_2;

/**
 * @author Samanta
 * @version 1.0
 */
public class PaymentCash implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println(amount + "paid using cash payment");

	}

}
