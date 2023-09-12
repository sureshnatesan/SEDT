package mandatoryHomeWork.DSA.week11;

import org.junit.Assert;
import org.junit.Test;

public class LinesToWriteString {

	/*
	 * 
	 * https://leetcode.com/problems/number-of-lines-to-write-string/description/
	 * 
	 * Pseudo code
	 * 1. create a for loop to iterate and check if sum is equals 100
	 * 2. use the % and / div operator to create a new array;
	 * 3. 
	 * 
	 * 
	 * 
	 */
	@Test
	public void testData(){
		int[] widths= {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String s="abcdefghijklmnopqrstuvwxyz";
	
Assert.assertArrayEquals(new int[] {3,60},numberOfLines(widths, s) );
	}


	public int[] numberOfLines(int[] widths, String s) {
		int count=0;
		int sum=0;
		int temp=0;
		for(int i=0;i<s.length();i++) {
			temp=temp+widths[s.charAt(i)-'a'];
			sum=sum+widths[s.charAt(i)-'a'];
			if(sum>=100) {
				count++;
				if(sum>100) {
					i=i-1;
				}
				sum=0;
			}
		}

		if(temp%100!=0) {
			return new int[] {count+1,sum};
		}
		else if(temp%100==0){
			return new int[] {count,100};
		}
		return new int[] {};
	}
}
