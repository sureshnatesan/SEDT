package mandatoryHomeWork.DSA.week14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

public class RansomNote {

	/*
	 * https://leetcode.com/problems/ransom-note/description/
	 * 
	 * 1.Input: ransomNote = "a", magazine = "b"
				Output: false
		2.Input: ransomNote = "ab", magazine = "b"
				Output: false
		2.Input: ransomNote = "bb", magazine = "b"
				Output: false

	 1.Input: ransomNote = "abc", magazine = "cba"
				Output: true
		2.Input: ransomNote = "ab", magazine = "baaab"
				Output: true
		2.Input: ransomNote = "bb", magazine = "baddfb"
				Output: true	

 1.Input: ransomNote = "", magazine = ""
				Output: true
		2.Input: ransomNote = "a b", magazine = "baaab"
				Output: true
		2.Input: ransomNote = "bb", magazine = "baddfb"
				Output: true
	 * 
	 * Pseudo code
	 * Map Apprach
	 * 1. Create a map to store the magazine string input
	 * 2. create second for loop,  one to add the magazine value and another is used to subtract the ransomenote value from map
	 * 3. During the subtract the map if you find the map doesn't contains the character or if the key value is zero
	 * 
	 * 
	 * Ascii app
	 * 1. create a short array to hold the magazine value
	 * 2. use the for loop to iterate the magazine character;
	 * 3. create one more for loop to iterate the ransomenote character and decrease the value by 1 and if you found map value is less than 0 return false
	 *
	 */

	@Test
	public void testData(){
		System.out.println(canConstructByConcerentHashMap("ab","ab"));
	}
	
	
	public boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length()>magazine.length()) return false;
		short[]sum = new short[26];
		for (int i = 0; i < magazine.length(); i++) {
			sum[magazine.charAt(i)-'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if(sum[ransomNote.charAt(i)-'a']<=0) return false;
			else {
				sum[ransomNote.charAt(i)-'a']--;
			}
		}
		return true;
	}

	public boolean canConstructByMap(String ransomNote, String magazine) {
		if(ransomNote.length()>magazine.length()) return false;
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if(!map.containsKey(ransomNote.charAt(i))) {
				return false;
			}
			if(map.get(ransomNote.charAt(i))<=0) {
				return false;
			}
			else {
				map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
			}
		}
		return true;
	}
	
	public boolean canConstructByConcerentHashMap(String ransomNote, String magazine) {
		if(ransomNote.length()>magazine.length()) return false;
		int left=0;
		int right=0;
		ConcurrentHashMap<Character,Integer> map = new ConcurrentHashMap<>();
//		for (int i = 0; i < magazine.length(); i++) {
//			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
//		}
		
		while(left<ransomNote.length()||right<magazine.length()) {
			if(right<magazine.length()) {
				map.put(magazine.charAt(right), map.getOrDefault(magazine.charAt(right), 0)+1);
				right++;
			}
			if(left<ransomNote.length()) {
				map.put(ransomNote.charAt(left), map.getOrDefault(ransomNote.charAt(left), 0)-1);
				left++;
			}
		}
		for(Entry<Character,Integer> entry:map.entrySet()){
			System.out.println(entry);
			if(entry.getValue()<=0) {
				map.remove(map.get(entry.getKey()));
			}
		}
		return map.isEmpty();
	}
	
	public void hj(){
		char a=' ';
		char b='a';
		
		
	}
	
	
	
	/*
	 * 
	 * 
	 * 
	 * Pseudo code
	 * 1. create a for loop and iterate the input
	 * 2. use the indexof method to find;
	 */
	
	@Test
	public boolean testData1(String a){
		for (char i = 'a'; i <='z'; i++) {
			if(a.indexOf(i)==-1) {
				return false;
			}
		}
		return true;
	}
	
	
	@Test
	public boolean testData12(String a){
		if(a.length()<26) return false;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)!=' ')set.add(a.charAt(i));
		}
		if(set.size()<26) return false;
		return true;
	}
}
