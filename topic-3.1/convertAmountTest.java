package bootcamp3.topic3_1;

import static org.junit.Assert.*;

import org.junit.Test;

import bootcamp3.topic3_1.Amount;

public class convertAmountTest {

	@Test
	public void test() {
		Amount amount = new Amount(2523.04);
		String text = amount.toString();
		assertEquals("two thousand five hundred twenty-three and 04/100 dollars", text);

		amount = new Amount(5223.004);
		text = amount.toString();
		assertEquals("five thousand two hundred twenty-three and 004/1000 dollars", text);

		amount = new Amount(5210.004);
		text = amount.toString();
		assertEquals("five thousand two hundred ten and 004/1000 dollars", text);

		amount = new Amount(5211.004);
		text = amount.toString();
		assertEquals("five thousand two hundred eleven and 004/1000 dollars", text);
	}

}
