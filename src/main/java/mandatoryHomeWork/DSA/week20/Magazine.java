package mandatoryHomeWork.DSA.week20;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Magazine {

	/*
	 * 
	 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a code that will return true if the ransom note can be constructed from the magazines, otherwise, it will return false.

String ransomNote = "aabb";
String magazine = "aabbc";
// Output: true
	 */


	/*
	 * 
	 * Pseudo code
	 * 
	 * 
	 * 1.check the size of the ransom and mag, magazine is less return false
	 * 2. create a one frequency array and add the magazine and decrease the ransom
	 * 3. then check in the magazine and 
	 *
	 */

	@Test
	public void testData() {
		String ransomNote = "aabb";
		String magazine = "aabbc";
		System.out.println(soluctionmap(ransomNote,magazine));
	}

	private boolean soluction(String ransomNote, String magazine) {
		int[]s=new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			s[magazine.charAt(i)-'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			s[ransomNote.charAt(i)-'a']--;
			int c= s[ransomNote.charAt(i)-'a'];
			if(c<0) {
				return false;
			}
		}
		return true;
	}


	private boolean soluctionmap(String ransomNote, String magazine) {
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			map.put(ransomNote.charAt(i), map.getOrDefault(ransomNote.charAt(i), 0)-1);
			if(map.get(ransomNote.charAt(i))<0){
				return false;
			}
		}

		return true;
	}
}
