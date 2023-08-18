package mandatoryHomeWork.Foundation.Week5;

import org.junit.Test;

import junit.framework.Assert;

public class AlternatingSum {
	/*
	 * https://leetcode.com/problems/alternating-digit-sum/submissions/

       Pseudo code
       1. Convert the given into to string
       2. iterate using for loop
       3.use the moduler operator to get 1 or 0
       4. if not 0 then add the value , else subtract the value from sum.
	 * 
	 */
	
	
	@Test
	public void testData() {
	Assert.assertEquals(4, soluction(521));
	}
	
	@Test
	public void testData1() {
	Assert.assertEquals(1, soluction(111));
	}
	
	@Test
	public void testData2() {
	Assert.assertEquals(0, soluction(886996));
	}

	public int soluction(int a) {
		String s=String.valueOf(a);
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if((i+1)%2!=0) {
				sum+=(s.charAt(i)-'0');
			}
			else {
				sum-=(s.charAt(i)-'0');
			}
		}
		return sum;
	}

}
