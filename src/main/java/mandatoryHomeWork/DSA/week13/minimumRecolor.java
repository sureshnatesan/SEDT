package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class minimumRecolor {
	/*
	 * 
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
	 * Pseudo code
	 * 1.try to find the count of white in within k size first
	 * 2. use the minimum operation to find the minvalue of count
	 * 3. after finding the w count in k size window
	 * 4. increase one side of window and remove the first pointer size  and check for the W count
	 * 5. Again use the min operator to find the min value
	 * Time Complexity 
	 */

	@Test
	public void testData() {
		// TODO Auto-generated method stub
		System.out.println(minimumRecolors("WBBWWBBWBW",7));
	}

	public int minimumRecolors(String blocks, int k) {
		
		int left=0;
		int count=0;
		int minvalue=Integer.MAX_VALUE;
		while(left<k) {
			if(blocks.charAt(left++)=='W') {
				count++;
			}
		}
		minvalue=Math.min(minvalue, count);
		while(left<blocks.length()) {
			if(blocks.charAt(left-k)=='W') {
				count--;
			}
			if(blocks.charAt(left++)=='W') {
				count++;
			}
			minvalue=Math.min(minvalue, count);
		}	
		return minvalue;			
	}
}
