package mandatoryHomeWork.DSA.week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class LongSubString {


	/*
	Pseudo code
	1. Create the 2 int variable namely left and right
	2. Create a for loop and add all character to set
	3. convert the set to string and use the sub string method
	4. check if we have substring is available for given input string

	5. if available, return the right count;
	 */

	@Test
	public void testData(){
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public int lengthOfLongestSubstring(String s) {
		int max=0;
		int i=0;
		int j=0;
		Set<Character> set = new HashSet<>();
		while (j < s.length()) {
	        if (!set.contains(s.charAt(j))) {
	            set.add(s.charAt(j++));
	            max = Math.max(max, set.size());
	        } else {
	            set.remove(s.charAt(i++));
	        }
	    }
	    return max;
	}
}


/*
 * Try to add the character in set if is contains any duplicate remove one character from set
 * so size will correct
 * 
 */
