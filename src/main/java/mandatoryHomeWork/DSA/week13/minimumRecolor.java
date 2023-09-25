package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class minimumRecolor {
	/*
	 * 
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
	 * Pseudo code
	 * 1.try to find the maximum consecutive of black
	 * 2. check if the given K is equals to or than grather than K, if greater than retu 0
	 * 3. if not meet the condition, replace the w to b and check;
	 */

	@Test
	public void testData() {
		// TODO Auto-generated method stub
		System.out.println(minimumRecolors("WBBWWBBWBW",7));
	}

	public int minimumRecolors(String blocks, int k) {
		
		int left=0;
		int count=0;
		int sum=Integer.MIN_VALUE;
		while(left<blocks.length()-k) {
			String a=blocks.substring(left, left+k);
			count=0;
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i)=='W') {
					count++;
				}
			}
			if(sum<count) {
				sum=count;
			}
			left++;
		}
		return count;
	}
}
