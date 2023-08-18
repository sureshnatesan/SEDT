package mandatoryHomeWork.Foundation.Week4Day1;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class ValidAnagram {


	/*
	 * 
	 * https://leetcode.com/problems/valid-anagram/
	 * 
	 * Pseudo code
	 * 
	 * 1. use the replace all mthd to remove the spaces in both string
	 * 2. then check for length, if length is not equals return false;
	 * 3.convert string 1&2 to char[] 1&2
	 * 4.use the Arrays.sort mtd for both array and comapre both the array
	 * 5. and return the value
	 */

	@Test
	public void testData(){
		Assert.assertEquals(true,soluction("CARDIOLOGIST", "DIS GARLIC TOO"));
	}
	
	@Test
	public void testData1(){
		Assert.assertEquals(true,soluction("anagram", "nagaram"));
	}
	
	@Test
	public void testData2(){
		Assert.assertEquals(false,soluction("rat", "car"));
	}
	
	public boolean soluction(String s, String t) {
		s=s.replaceAll("\\s", "").toLowerCase();
		t=t.replaceAll("\\s", "").toLowerCase();
		if(s.length()!=t.length()) {
			return false;
		}
		else {
			char[] s1=s.toCharArray();
			char[] t1 = t.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(t1);
			if(Arrays.equals(s1, t1)==true) {
				return true;
			}
			else {
				return false;
			}
		}
		
	}
}
