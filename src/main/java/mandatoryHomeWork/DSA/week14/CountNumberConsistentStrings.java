package mandatoryHomeWork.DSA.week14;

import org.junit.Test;

public class CountNumberConsistentStrings {

	/*
	 * 
	 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
	 * 
	 * Pseudo code
	 * 1. create a int array with size of 26
	 * 2. all the character of allowed in the array;
	 * 3. create the for loop to iterate the string array;
	 * 3.
	 */

	@Test
	public void testData(){
		String allowed = "ab";
		String[] words = {"ad","bd","aaab","baa","badab"};
		System.out.println(countConsistentStrings(allowed,words));
	}


	public int countConsistentStrings(String allowed, String[] words) {
		int[] sum= new int[26];
		int count=0;
		for (int i = 0; i < allowed.length(); i++) {
			sum[allowed.charAt(i)-'a']++;
		}
		int left=0;
		while(left<words.length) {
			//words[left].toCharArray();
			for (int i = 0; i < words[left].length(); i++) {
				if(sum[words[left].charAt(i)-'a']==0) {
					left++;
					break;
				}
				if(i==words[left].length()-1) count++;
			}
			left++;
		}
		return count;
	}
}
