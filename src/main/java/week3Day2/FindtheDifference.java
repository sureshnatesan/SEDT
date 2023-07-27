package week3Day2;

import org.junit.Test;

import junit.framework.Assert;

public class FindtheDifference {
	
	
	/*
	 * https://leetcode.com/problems/find-the-difference/description/
	 * pseudo code
	 * 1. use two for loop
	 * 2. create int count variable
	 * 3.if count == 2
	 * return char
	 * 
	 */
	
	
	@Test
	public void testData() {
		System.out.println(soluction("abcd", "abcde"));
		Assert.assertEquals(true, 'e'-soluction("abcd", "abcde")==0);
	}

	@Test
	public void testData2() {
		System.out.println(soluction("abcd", "abcde"));
		Assert.assertEquals(true, 'a'-soluction("abcd", "abcda")==0);
	}
	
	@Test
	public void testData1() {
		System.out.println(soluction("", "y"));
		Assert.assertEquals(true, 'y'-soluction("", "y")==0);
	}
	
	public Character soluction(String a, String b) {

		for (int i = 0; i < a.length(); i++) {
			b=b.replaceFirst(a.charAt(i)+"", "");
		}
		return b.charAt(0);
	}

}
