package mandatoryHomeWork.DSA.week20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubstring {


	/*
	 * 
	 * 
	 * * 1. Longest Substring without Repeating Characters:
Given a string, find the length of the longest substring without repeating characters.
String input = "abcabcbb";
// Output: 3 (for "abc")  -> hashmap , 2 pointer
	 */


	/*
	 * 
	 * 
	 * 
	 * Pseudo code
	 * 1.create a set to add and check add return true are false,
	 * 2. cretae a max and counter variable 
	 * 3. is set add method return false, get size of set and update in the max value if counter is greather than max
	 * 4.And make the set to empty, if the add method return false
	 */

	@Test
	public void dataTest() {
		String s="ababcbb";
		soluction(s);
	}

	
	public void soluction1(String s) {
		HashMap<Character,Integer>map = new HashMap<>();
		int left=0,right=0,max=0,counter=0;
		while(left<s.length()&&right<s.length()) {
			map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
			if(map.get(s.charAt(right++))>1) {
				counter=map.size();
				if(max<counter) {
					max=counter;
				}
				map.clear();
				right=left++;
			}
		}
		
		System.out.println(max);
	}
	public void soluction(String s) {
		Set<Character> set = new HashSet<>();
		int left=0,right=0,max=0,counter=0;
		while(right<s.length()) {
			if(set.add(s.charAt(right))) {
				right++;
			}
			else if(set.add(s.charAt(right))==false) {
				counter=set.size();
				if(max<counter) {
					max=counter;
				}
				set.clear();
				right=left++;
			}
		}
		System.out.println(max);
	}
}
