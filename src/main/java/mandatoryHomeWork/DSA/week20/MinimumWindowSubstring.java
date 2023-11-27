package mandatoryHomeWork.DSA.week20;

import java.util.HashMap;

import org.junit.Test;

public class MinimumWindowSubstring {


	/*
	 * 2. Minimum Window Substring:
Given a string S and a string T, find the minimum window in S that contains all the characters of T in complexity O(n).
String S = "ADOBECODEBANC";
String T = "ABC";
// Output: "BANC"  --> hash map
	 */

	/*
	 * Pseudo code
	 * 1. create two variable namely left and right respective
	 * 2. left start at zero and right at t.length-1
	 * 3. create two map, one for storing t and another for s
	 * 4.create min and counter variable to store min window
	 * 
	 * 
	 */

	@Test
	public void testData() {
		String s="ADOBECODEBANC";
		String t="ABC";
		soluction(s,t);
	}

	private void soluction(String s,String t) {
		int left=0,right=0,min=Integer.MAX_VALUE,count=0;
		HashMap<Character,Integer> mapS= new HashMap<>();
		HashMap<Character,Integer> mapT= new HashMap<>();

		for (int i = 0; i < t.length(); i++) {
			mapT.put(t.charAt(i), mapT.getOrDefault(mapT.get(t.charAt(i)), 0)+1);
		}
		/*for (int i = 0; i < s.length(); i++) {
			mapS.put(s.charAt(i), mapS.getOrDefault(mapS.get(s.charAt(i)), 0)+1);	
		}*/

		while(left<s.length()&&right<t.length()) {
			count=0;
			mapS.put(s.charAt(right), mapS.getOrDefault(s.charAt(right), 0)+1);		
			if(mapS.size()>=mapT.size()) {
				for (int i = 0; i < t.length(); i++) {
					if(mapS.containsKey(t.charAt(i))) {
						if(mapS.get(t.charAt(i))>=mapT.get(t.charAt(i))) {
							count=mapS.size();
							right=left++;
						}
					}
					
				}
				right++;
			}
			else {
				right++;
			}
			if(count<min) {
				min =count;
			}
		}
		System.out.println(min); 
	}



}
