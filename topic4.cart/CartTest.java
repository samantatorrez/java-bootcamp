package bootcamp412.topic4_1_and_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CartTest {

	@Test
	public void test() {
		Cart cart = new ShoppingCart();
		cart.addItem("1234", 12);
		cart.addItem("111", 6);
		cart.addItem("333", 3, 2);
		assertEquals(24, cart.calculateTotal(), 24);
		assertEquals(cart.contains("111"), true);
		assertEquals(cart.contains("333"), true);
		assertEquals(cart.contains("1234"), true);

		cart.removeItem("111");
		assertEquals(cart.contains("111"), false);
		assertEquals(24, cart.calculateTotal(), 18);

		assertEquals(cart.isEmpty(), false);
		cart.pay("Dara", "1234");
		assertEquals(cart.isEmpty(), true);

		cart.addItem("1234", 12);
		cart.addItem("111", 7);
		cart.addItem("333", 3, 2);
		assertEquals(24, cart.calculateTotal(), 24);

		assertEquals(cart.isEmpty(), false);
		cart.pay();
		assertEquals(cart.isEmpty(), true);

	}

}
