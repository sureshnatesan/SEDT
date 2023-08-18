package mandatoryHomeWork.Foundation.HomeWorkWeek3;
import org.junit.Test;

import junit.framework.Assert;

public class FirstPalindromic {

	/*
	 * https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
	 * 
	 * Pseudo code
	 * 1.Input String Array
	 * 2. Output: String
	 * 1. Create a for loop and get iterated
	 * 2. reverese the string with help of local variable and comapre if true, return the string
	 */

	@Test
	public void testData() {
		Assert.assertEquals("ada", Soluction(new String[] {"abc","car","ada","racecar","cool"}));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals("racecar", Soluction(new String[] {"notapalindrome","racecar"}));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals("", Soluction(new String[] {"def","ghi"}));
	}

	public String Soluction(String[] a) {
		String local="";
		for(String s:a) {
			for (int i = s.length()-1; i >=0; i--) {
				local=local+s.charAt(i);
			}
			if(s.equals(local)) {

				return local;
			}
			else {
				local="";
			}
		}

		return local;
	}
}
