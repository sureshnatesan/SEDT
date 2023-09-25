package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class ConsecutiveCharacters {


	/*
	 * 
	 * https://leetcode.com/problems/consecutive-characters/description/
	 * Pseudo code
	 * 1. create a two variable namely , left and right and both should start from same point
	 * 2. use the if condition to check, left are right are equals,if equals increament the right alone
	 * 3. else assigin the right value to left
	 */


	@Test
	public void testData(){
		System.out.println(maxPower1("abbcccddddeeeee"));
	}


	public int maxPower(String s) {
		int left=0;
		int right=left;
		int count=0;
		int sum=Integer.MIN_VALUE;
		while(right<s.length()) {
			if(s.charAt(left)==s.charAt(right++)) {
				count++;
			}
			else {
				count=0;
				left=right;
			}
			if(sum<count) {
				sum=count;
			}
		}
		return sum;  
	}

	public int maxPower1(String s) {
		int left=0;
		int right=left;
		int count=0;
		while(right<s.length()) {
			if(s.charAt(left)==s.charAt(right)) {
				right++;
			}
			else {
				if(count<right-left) {
					count=right-left;
				}
				left=right;
			}	
		}       
		return count;   
	}
}
