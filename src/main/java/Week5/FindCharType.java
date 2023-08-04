package Week5;

import org.junit.Test;

import junit.framework.Assert;

public class FindCharType {
	
	
	/*
	 * Pseudo code
	 * 
	 * 1. Check input with , equalto/greather than a/A and less than/ equals to z/z
	 * will return the Alphabet 
	 * 2. 2nd check for number if input is equals/greather than 0 and <=9
	 * return number 
	 *3. else return special charater
	 *
	 *
	 */
	
	@Test
	public void testData(){
		Assert.assertEquals("Alphabet", soluction('c'));
		Assert.assertEquals("Alphabet", soluction('Z'));
		Assert.assertEquals("Alphabet", soluction('a'));
	}
	
	@Test
	public void testData1(){
		Assert.assertEquals("Number", soluction('8'));
		Assert.assertEquals("Number", soluction('0'));
		Assert.assertEquals("Number", soluction('9'));
	}
	
	@Test
	public void testData12(){
		Assert.assertEquals("Special Character", soluction('!'));
		Assert.assertEquals("Special Character", soluction('/'));
		Assert.assertEquals("Special Character", soluction('+'));
	}
	
	public String soluction(char a) {
		
		if(a>='0'&&a<='9') {
			return "Number";
		}
		else if(a>='a'&&a<='z'|| a>='A'&& a<='z') {
			return "Alphabet";
		}
		else {
			return "Special Character";
		}
	}
}
