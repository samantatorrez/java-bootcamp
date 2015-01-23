package bootcamp34.topic3_4;

import static org.junit.Assert.*;

import org.junit.Test;

import bootcamp34.topic3_4.IntNumber;
import bootcamp34.topic3_4.Roman;

public class convertRomanIntTest {

	@Test
	public void test() {
		Roman roman = new Roman("MDLIII");
		int result = roman.toInt();
		assertEquals(result, 1553);

		roman = new Roman("CM");
		result = roman.toInt();
		assertEquals(result, 900);

		IntNumber number = new IntNumber(1553);
		String solution = number.toRoman();
		System.out.println(solution);
		assertEquals(solution, "MDLIII");

		number = new IntNumber(900);
		solution = number.toRoman();
		System.out.println(solution);
		assertEquals(solution, "CM");
	}

}
