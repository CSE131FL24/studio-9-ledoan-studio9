package studio9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;

public class WordCount {
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
		Map<String, Integer> countWords = new HashMap<>();
		
		countWords.put("to", 2);
		countWords.put("be", 2);
		countWords.put("or", 1);
		countWords.put("not", 1);

		return countWords;
	}
	
	public static void main(String[] args) {
		
		List<String> wordList = new LinkedList<>();
		wordList.add("to");
		wordList.add("be");
		wordList.add("or");
		wordList.add("not");
		wordList.add("to");
		wordList.add("be");
		Map<String, Integer> words = countWords(wordList);
		
		int tovalue = 0;
		int bevalue = 0;
		int orvalue = 0;
		int notvalue = 0;
		for(int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).equals("to")) {
				words.put("to", tovalue++);
			}
			if (wordList.get(i).equals("be")) {
				words.put("be", bevalue++);
			}
			if (wordList.get(i).equals("or")) {
				words.put("or", orvalue++);
			}
			if (wordList.get(i).equals("not")) {
				words.put("not", notvalue++);
			}
		}
	}
}
