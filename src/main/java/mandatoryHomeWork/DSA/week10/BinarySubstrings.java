package mandatoryHomeWork.DSA.week10;

import org.junit.Test;

public class BinarySubstrings {


	/*
	 * https://leetcode.com/problems/count-binary-substrings/
	 * 
	 * Pseudo code
	 * 1. create a for loop to iterate
	 * 2. create two in variable two store current and previous element count
	 * 3. use the if condtion to check, previous>=current, if true increase the count by 1
	 * 
	 *  
	 */

	//10101
	@Test
	public void testData() {
		System.out.println(soluction("10101"));
	}
	//0011
	public int soluction(String s) {

		int count=0;
		int current=1;
		int previous=0;
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				current++;
			}
			else {
				previous=current;
				current=1;
			}
			if(previous>=current) {
				count++;
			}
		}
		return count;
	}
}
