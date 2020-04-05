//Author Name: Rebecca Steffan
//Date: 2/2/2020 
//Program Name: Steffan_text_analyzer
//Purpose: Read a file and determine how many times each word appears

package ch2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Text analyzer
 * 
 * @author bsteffan
 *
 */
public class Steffan_text_analyzer {
	public static void main(String[] args) throws FileNotFoundException {
		/** Reading file line by line */
		File file = new File("macbeth-1.txt");
		Scanner scan = new Scanner(file);

		Map<String, Integer> map = new HashMap<String, Integer>();

		while (scan.hasNext()) {
			String lowerCaseWord = scan.next().toLowerCase();
			if (map.containsKey(lowerCaseWord) == false)
				map.put(lowerCaseWord, 1);
			else {
				int count = (int) (map.get(lowerCaseWord));
				map.remove(lowerCaseWord);
				map.put(lowerCaseWord, count + 1);
			}
		}
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		List<Map.Entry<String, Integer>> sortedList = new ArrayList<Map.Entry<String, Integer>>(set);
		Collections.sort(sortedList, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return (b.getValue()).compareTo(a.getValue());

			}
		});
		List<Map.Entry<String, Integer>> sortedList2 = sortedList.subList(0, 20);

		for (Map.Entry<String, Integer> i : sortedList2) {

			System.out.println(i.getKey() + " -> " + i.getValue());
		}

	}

}
