package mandatoryHomeWork.DSA.week20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;

public class GroupAnagrams {
	
	/*
	 * 
	 * Given an array of strings, group anagrams together.
String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	 */

	
	
/*
 * 
 * Pseudo code
 * 1.create a map to add each character
 * 2. compare first map value to other values
 */
	
	
	@Test
	public void testData(){
		String [] s1= {"eat", "tea", "tan", "ate", "nat", "bat"};
		soluction(s1);
	}

	public void soluction(String[] s1) {
		HashMap<Character, Integer> map= new HashMap<>();
		for (int i = 0; i < s1[1].length(); i++) {
			
		}
	}
	
	
	@Test
	public void testGroupAnagrams() {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		// {"eat", "tea", "tan", "ate", "nat", "bat"};
		// aet      aet
		groupAnagrams(strs);
	}

	// strs --> n --> 6 words
	
	private void groupAnagrams(String[] strs) {
		
		HashMap<String, List<String>> map = new HashMap<>();
		
		// O(n*mlogm)
		for (String word : strs) {
			// convert into character array
			char[] chars = word.toCharArray(); // characters inside n --> 3 --> m
			
			// sort it
			Arrays.sort(chars);
			
			// char[] to String
			String sortedWord = new String(chars);
			System.out.println(sortedWord);
			
			// if the given sorted word is inside the map?
			if(!map.containsKey(sortedWord)) {
				map.put(sortedWord, new ArrayList<String>());
			}
			
			// in all cases - add the word to the list
			map.get(sortedWord).add(word);
			
		}
		
		System.out.println(new ArrayList<>(map.values()));
		
	}
	
	
	
	
}
