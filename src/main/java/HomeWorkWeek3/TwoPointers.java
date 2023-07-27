package HomeWorkWeek3;

import org.junit.Test;

public class TwoPointers {
	
	/*
	 * https://leetcode.com/problems/merge-strings-alternately/editorial/
	 * 
	 * Pseudo code
	 * 1. 
	 */

	@Test
	public void testData() {
		soluction("ab","pqrs");

	}
	
	public void soluction(String n1,String n2) {
		int n= n1.length();
		int m= n2.length();
		int i=0,j=0;
		String result="";
		
		while (i<n||j<m) {
			 if (i < n) {
				 result=result+n1.charAt(i++);
			 }
			 if (j < m) {
				 result=result+n2.charAt(j++);
			 }
		}
		System.out.println(result);

	}
}
