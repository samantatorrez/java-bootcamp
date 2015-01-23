package bootcamp32.topic3_2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import bootcamp32.topic3_2.WordWrapping;

public class wordWrappedTest {

	@Test
	public void test() {
		WordWrapping wordWrapping = new WordWrapping();
		List<String> rows = new ArrayList<String>();
		String string = "abcdefghijklmopqrstuvwxyz12345";
		int rowLength = 60;
		rows = wordWrapping.wrap(string, rowLength);
		assertEquals(rows.size(), 1);
		assertEquals(rows.get(0), "abcdefghijklmopqrstuvwxyz12345");

		rows.clear();
		string = "Hello Word!";
		rowLength = 7;
		rows = wordWrapping.wrap(string, rowLength);
		assertEquals(rows.size(), 2);
		assertEquals(rows.get(0), "Hello ");
		assertEquals(rows.get(1), "Word! ");

		rows.clear();
		string = "a b c d e f";
		rowLength = 3;
		rows = wordWrapping.wrap(string, rowLength);
		assertEquals(rows.size(), 3);
		assertEquals(rows.get(0), "a b ");
		assertEquals(rows.get(1), "c d ");
		assertEquals(rows.get(2), "e f ");

		rows.clear();
		string = "Excelent";
		rowLength = 5;
		rows = wordWrapping.wrap(string, rowLength);
		assertEquals(rows.size(), 2);
		assertEquals(rows.get(0), "Excel");
		assertEquals(rows.get(1), "ent");
	}

}
