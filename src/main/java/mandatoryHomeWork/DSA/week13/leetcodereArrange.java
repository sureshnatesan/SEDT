package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class leetcodereArrange {

	/*
	 * 
	 * https://leetcode.com/problems/shuffle-string/description/
	 * 1. create a new string array with incices size
	 * 2. create a for to iterate and get s input and set in the new array indices position
	 * 
	 * Time Complexity:O(n)
	 * Space Complexity:O(n)
	 */
	
	
	
	@Test
	public void testData() {
		int[] a= {4,5,6,7,0,2,1,3};
		String s="codeleet";
		System.out.println(restoreString(s,a));
	}
	public String restoreString(String s, int[] indices) {
		char sum[]=new char [indices.length];
		for (int i = 0; i < indices.length; i++) {
			sum[indices[i]]=s.charAt(i);
		}
		return new String(sum);
	}
}
