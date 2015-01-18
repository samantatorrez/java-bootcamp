package display;

/**
 * @author Samanta
 * @version 1.1
 * 
 */
public class PaymentPaypal implements Payment {
	private String email;
	private String password;

	public PaymentPaypal(String email, String pass) {
		this.email = email;
		this.password = pass;
	}

	@Override
	public void pay(double amount, ShoppingCart cart) {
		System.out.println(cart.calculateTotal() + " paid using paypal payment");

	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

}
