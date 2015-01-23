package bootcamp34.topic3_4;

/**
 * Class Roman
 * 
 * The amounts are added and the exceptions are subtracted 
 * Special cases: "IV" "IX" "XL" "XC" "CD" "CM"
 * 
 * @author Ciel
 *
 */

public class Roman {
	private String roman;

	public Roman(String string) {
		this.roman = string;
	}

	public int count(char a) {
		int count = 0;
		for (int i = 0; i < roman.length(); i++) {
			char c = roman.charAt(i);
			if (c == a) {
				count++;
			}
		}
		return count;
	}

	public int exception() {
		int count = 0;
		char ant = 'w';
		for (int i = 0; i < roman.length(); i++) {
			char c = roman.charAt(i);
			if (i != 0) {
				ant = roman.charAt(i - 1);
			}
			if ((c == 'V' || c == 'X') && (ant == 'I')) {
				count = count + (1 * 2);
			} else if ((c == 'L' || c == 'C') && (ant == 'X')) {
				count = count + (10 * 2);
			} else if ((c == 'D' || c == 'M') && (ant == 'C')) {
				count = count + (100 * 2);
			}
		}
		return count;
	}

	public int toInt() {
		int result = 0;
		result = (count('M') * 1000) + (count('D') * 500) + (count('C') * 100) + (count('L') * 50) + (count('X') * 10) + (count('V') * 5)
				+ (count('I') * 1);
		result = result - exception();
		return result;
	}

}
