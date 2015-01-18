package manager;

/**
 * @author Samanta
 * @version 1.1
 * 
 */
public class PaymentCreditCard implements Payment {
	private String name;
	private String creditNumber;

	public PaymentCreditCard(String name, String creditNumber) {
		this.name = name;
		this.creditNumber = creditNumber;
	}

	@Override
	public void pay(double amount, ShoppingCart cart) {
		System.out.println(amount + "paid using credit card payment");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the creditNumber
	 */
	public String getCreditNumber() {
		return creditNumber;
	}

}
