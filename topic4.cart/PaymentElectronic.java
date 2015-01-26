package bootcamp412.topic4_1_and_2;

/**
 * @author Samanta
 * @version 1.0
 */
public class PaymentElectronic implements Payment {
	private String email;
	private String password;

	public PaymentElectronic(String email, String pass) {
		this.email = email;
		this.password = pass;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount + " paid using electronic payment");

	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

}
