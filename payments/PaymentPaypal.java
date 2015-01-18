package payments;

/**
 * @author Samanta
 * @version 1.0
 */
public class PaymentPaypal implements Payment {
	private String email;
	private String password;

	public PaymentPaypal(String email, String pass) {
		this.email = email;
		this.password = pass;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using paypal payment");

	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

}
