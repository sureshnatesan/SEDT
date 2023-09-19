package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

public class LexicographicallySmallestPalindrome {

	
	/*
	 * https://leetcode.com/problems/lexicographically-smallest-palindrome/description/
	 * 
	 * Pseudo code
	 * 1.create a while loop and two int variable
	 * 2. use the if condition to check if start and end character are same, if not update with lowest char
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void testData(){
		System.out.println(makeSmallestPalindrome("ay"));
	}
	
	 public String makeSmallestPalindrome(String s) {
	        int start =0;
	        int end =s.length()-1;
	        char[] charArray = s.toCharArray();
	        if(s.length()==1) return s;
	        //if(s.length()==2) return s.charAt(end)+""+s.charAt(0);
	        while(start<end) {
	        	if(charArray[start]!=charArray[end]) {
	        		if(charArray[start]<charArray[end]) {
	        			charArray[end]=charArray[start];
	        		}
	        		else {
	        			charArray[start]=charArray[end];
	        		}
	        	}
	        	
	        	start++;
	        	end--;
	        }
	        return new String(charArray);
	    }
}
