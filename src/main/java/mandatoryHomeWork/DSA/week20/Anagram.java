package mandatoryHomeWork.DSA.week20;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Anagram {

	/*
	 * Given two strings, check if they are anagrams of each other.
String str1 = "listen";
String str2 = "silent";
// Output: true

	 */


	/*
	 * 
	 * 
	 * Pseudo code
	 * 1. create a map to store character and there counts in map
	 * 2. for second try to remove the each character from map
	 * 3. at the last try to find map is empty or not.
	 */


	@Test
	public void testData(){
		String s1="listen";
		String s2="silent";
		System.out.println(soluction(s1,s2));
	}

	public boolean soluction(String s1,String s2) {
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();

		if(s1.length()!=s2.length()) return false;
		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
			map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0)-1);
			
		}

		System.out.println(map);
		Set<Entry<Character, Integer>> entrySet = map.entrySet();

		for(Entry<Character, Integer> se:entrySet) {
			if(se.getValue()!=0) {
				return false;
			}
		}

		return true;
	}
}
