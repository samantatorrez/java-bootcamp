package bootcamp3.topic3_1;

/**
 *Class Amount
 *
 * The idea is to create a class that has the functionality to change the price of number to text.
 * A dictionary that stores the translation is implemented.
 * The minimum translations are placed to run the tester.
 * The following amounts are separated: millions, hundreds, tens, hundreds and decimals.
 * Special cases referred: less than 20
 * 
 * @author Samanta
 */

import java.util.HashMap;

public class Amount {
	private double amount;
	private HashMap<Integer, String> dictionary;

	public Amount(final double amount) {
		this.amount = amount;
		this.dictionary = new HashMap<Integer, String>();
		inicializate();
	}

	public void inicializate() {
		this.dictionary.put(1, "one");
		this.dictionary.put(2, "two");
		this.dictionary.put(5, "five");
		this.dictionary.put(3, "three");
		this.dictionary.put(10, "ten");
		this.dictionary.put(11, "eleven");
		this.dictionary.put(20, "twenty");
	}

	public String toString() {
		int integerPart = (int) amount;
		String aux = Double.toString(amount);
		String[] result = aux.split("\\.");
		String decimal = result[1];
		decimal.substring(2);

		String pow = Integer.toString((int) Math.pow(10, decimal.length()));

		int thousand = (int) (integerPart / 1000);
		int rest = integerPart - thousand * 1000;
		int hundred = (int) (rest / 100);
		rest = rest - hundred * 100;
		int tens = (int) (rest / 10);
		int unit = rest - tens * 10;
		String twoDigit;
		if (tens >= 2) {
			twoDigit = dictionary.get(tens * 10) + "-" + dictionary.get(unit);
		} else {
			twoDigit = dictionary.get(tens * 10 + unit);
		}
		return dictionary.get(thousand) + " thousand " + dictionary.get(hundred) + " hundred " + twoDigit + " and " + decimal + "/" + pow
				+ " dollars";
	}
}
