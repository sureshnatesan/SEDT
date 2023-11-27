package mandatoryHomeWork.DSA.week19;

import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicatesfromSortedArrayII {
	/*
	 * Remove Duplicates from Sorted Array II
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

	 */


	@Test
	public void testData() {
		int[] s= {0,0,1,1,1,1,2,3,3,3};
		soluction1(s);
	}
	private void soluction1(int[] s) {
		int k=2;
		for (int i = 2; i < s.length; i++) {
			if(s[i]==s[i-2]) {
				s[i]=Integer.MAX_VALUE;
			}
		}
		System.out.println(Arrays.toString(s));
		
	}
	private void soluction(int[] s) {
//0,0,1,1,1,1,2,3,3};
		int left=0, right=0;
		int counter=0,  k=0;
		while(right<s.length) {
			if(s[left]==s[right]) {
				right++;
				counter++;
				if(counter>2) {
					s[right]=Integer.MAX_VALUE;
				}
			}
			
			else if(s[left]!=s[right]) {
				left=right++;
				counter=1;
			}
		}
		System.out.println(Arrays.toString(s));
	}


}
