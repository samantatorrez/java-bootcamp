package bootcamp34.topic3_4;

/**
 * Class IntNumber
 * 
 * The idea is to create a class that has the functionality of changing a number to roman format.
 * A dictionary that stores the translation is implemented.
 * The minimum translations are placed to run the tester.
 * The amounts of millions, hundreds, tens, hundreds and decimals are separated.
 *
 * @author Samanta
 */
import java.util.HashMap;
import java.util.Map;

public class IntNumber {
	private int number;
	private Map<Integer, String> dictionary;

	public IntNumber(int i) {
		this.number = i;
		initialize();
	}

	public void initialize() {
		dictionary = new HashMap<Integer, String>();
		dictionary.put(0, "");
		dictionary.put(1, "I");
		dictionary.put(3, "III");
		dictionary.put(4, "IV");
		dictionary.put(5, "V");
		dictionary.put(9, "IX");
		dictionary.put(10, "X");
		dictionary.put(40, "XL");
		dictionary.put(50, "L");
		dictionary.put(90, "XC");
		dictionary.put(100, "C");
		dictionary.put(400, "CD");
		dictionary.put(500, "D");
		dictionary.put(900, "CM");
		dictionary.put(1000, "M");
	}

	public int getThousand() {
		int thousand = (int) (number / 1000);
		return thousand * 1000;
	}

	public int getHundred() {
		int rest = number - getThousand();
		int hundred = (int) (rest / 100);
		return hundred * 100;
	}

	public int getTens() {
		int rest = number - getThousand();
		rest = rest - getHundred();
		int tens = (int) rest / 10;
		return tens * 10;
	}

	public int getUnit() {
		int rest = number - getThousand();
		rest = rest - getHundred();
		rest = rest - getTens();
		return rest;
	}

	public String toRoman() {
		String solution = "";
		solution = this.dictionary.get(getThousand()) + this.dictionary.get(getHundred()) + this.dictionary.get(getTens())
				+ this.dictionary.get(getUnit());
		return solution;
	}
}
