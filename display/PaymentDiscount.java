package display;

/**
 * @author Samanta
 * @version 1.1 this payment method also has discount
 */

public class PaymentDiscount implements Payment {
	private Payment payment;
	private Discount discount;

	public PaymentDiscount(Payment payment, Discount discount) {
		this.payment = payment;
		this.discount = discount;
	}

	@Override
	public void pay(double amount, ShoppingCart cart) {
		double calculate = cart.calculateTotal() - discount.apply(cart);
		payment.pay(calculate, cart);

	}

}
