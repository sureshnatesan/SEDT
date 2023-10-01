package mandatoryHomeWork.DSA.week14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

public class Anagram {


	/*
	 * 
	 * 
	 * https://leetcode.com/problems/valid-anagram/
	 * 
	 * 
	 */

	@Test
	public void testData(){
		System.out.println(isAnagram("aaca","aaac"));
	}
	
	public static boolean isAnagramByArray(String s1, String s2) {
		short[] sum = new short[26];
		for (int i = 0; i < s1.length(); i++) {
			sum[s1.charAt(i)-'a']++;
			sum[s2.charAt(i)-'a']--;
		}
		for (int i = 0; i < sum.length; i++) {
			if(sum[i]!=0) return false;
		}
		return true;
	}
	
	public static boolean isAnagram(String s1, String s2) {

		if(s1.length()!=s2.length()) return false;
		//ConcurrentHashMap<Character,Integer> map1 = new ConcurrentHashMap<>();
		Map<Character,Integer> map1 = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			//Integer count = map1.getOrDefault(s1.charAt(i), 0);
			map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
			
			//Integer count1 = map1.getOrDefault(s2.charAt(i), 0);
			map1.put(s2.charAt(i), map1.getOrDefault(s2.charAt(i), 0)-1);
/*
			if(map1.containsKey(s1.charAt(i))) {
				map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
			}
			else {
				map1.put(s1.charAt(i),1);
			}
			if (map1.containsKey(s2.charAt(i))){
				map1.put(s2.charAt(i),map1.get(s2.charAt(i))-1);
			}
			else {
				map1.put(s2.charAt(i),-1);
			}
		*/	
			if(map1.get(s2.charAt(i))==0) {
				map1.remove(s2.charAt(i));
			}
			if(map1.containsKey(s1.charAt(i))) {
				if(map1.get(s1.charAt(i))==0) {
					map1.remove(s1.charAt(i));
				}
			}
			
		}
	/*	for (Entry<Character, Integer> entry : map1.entrySet()) {
			System.out.println(entry);
			if(entry.getKey()=='a') {
				map1.remove(entry.getKey());
			}
	}*/
	
		return map1.isEmpty();
	}
}
