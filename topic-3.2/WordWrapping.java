package bootcamp32.topic3_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Class WordWrapping
 * 
 * word-wrapping algorithm
 * 
 * @author Samanta
 *
 */
public class WordWrapping {
	public List<String> wrapWord(String string, int rowLength) {
		String part1 = "";
		String part2 = "";
		List<String> rows = new ArrayList<String>();
		while (string.length() >= rowLength) {
			part1 = (String) string.subSequence(0, rowLength);
			rows.add(part1);
			part2 = string.substring(rowLength);
			string = part2;
		}
		rows.add(part2);
		return rows;
	}

	/*
	 * If the word size is less than the size of the row, the result is the
	 * word.If the word size is greater and is composed of words, words are
	 * separatedin a list. It is completed placing the words from the list
	 * before exceeding the size of the row.When it’s about to exceed it, it is
	 * added to the results list and aux gets empty.You keep completing it with
	 * the words in the listIf the word size is greater than the size of the
	 * row, the word is shortened
	 */

	public List<String> wrap(String string, int rowLength) {
		List<String> rows = new ArrayList<String>();
		if (string.length() <= rowLength) {
			rows.add(string);
		} else {
			String[] result = string.split("\\ ");
			String aux = "";
			for (int i = 0; i < result.length; i++) {
				if ((result[i].length() + aux.length()) <= rowLength) {
					aux = aux + result[i] + " ";
				} else if (result[i].length() <= rowLength) {
					rows.add(aux);
					aux = "";
					aux = aux + result[i] + " ";
				} else {
					rows.addAll(wrapWord(result[i], rowLength));
				}
			}
			if (!aux.equals("")) {
				rows.add(aux);
			}
		}
		return rows;
	}
}
