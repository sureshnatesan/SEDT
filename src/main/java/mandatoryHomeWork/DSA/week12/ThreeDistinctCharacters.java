package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

public class ThreeDistinctCharacters {

	/*https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
	 * 
	 * 
	 * 
	 * Pseudo code
	 * 1.create a three variable namely count, left and right respectively
	 * 2. use the while condition to iterate and if condition to check distinct word;
	 */

	@Test
	public void testData(){
		System.out.println(countGoodSubstrings("aababcabc"));
	}

	public int countGoodSubstrings(String s) {
		int count=0;
		int left=0;
		int right =2;
		if(s.length()<3) return 0;
		while(left<s.length()&&right<s.length()) {
			if(s.charAt(left)!=s.charAt(right)&&s.charAt(left)!=s.charAt(right-1)&&s.charAt(right)!=s.charAt(right-1)) {
				count++;
			}
			left++;
			right++;
		}
		return count;
	}

	public int countGoodSubstrings1(String s) {
		int count=0;
		int left=0;
		int right =2;
		if(s.length()<3) return 0;
		while(left<s.length()&&right<s.length()) {
			if(s.charAt(left)!=s.charAt(right)&&s.charAt(left)!=s.charAt(right-1)&&s.charAt(right)!=s.charAt(right-1)) {
				count++;
			}
			left++;
			right++;
		}
		return count;
	}
}
