package mandatoryHomeWork.DSA.week9;

import org.junit.Test;

import junit.framework.Assert;

public class DigitwithCharacter {
	
	/*
	 * https://leetcode.com/problems/replace-all-digits-with-characters/description/
	 * 
	 * Pseudo code
	 * 1.Create a for loop to iterate the string
	 * 2.use the character.numerical value method to get numeric value
	 * 3. add the both character+numerical value and convert it to character
	 * 4. use the replace first method to change the value
	 * 
	 */
	@Test
	public void testData(){
		Assert.assertEquals("abcdef", replaceDigits("a1c1e1"));
	}
	
	  public String replaceDigits(String s) {
	    for (int i = 1; i < s.length(); i+=2) {
			int a=Character.getNumericValue(s.charAt(i))+s.charAt(i-1);
			s=s.replaceFirst(s.charAt(i)+"", (char)a+"");
		}
	    return s;
	    }
}
