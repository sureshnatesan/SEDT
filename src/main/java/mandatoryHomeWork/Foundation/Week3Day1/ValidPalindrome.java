package mandatoryHomeWork.Foundation.Week3Day1;

import org.junit.Test;

import junit.framework.Assert;

public class ValidPalindrome {

	@Test
	public void testData() {
		String a= "A man, a plan, a canal: Panama";
		Assert.assertEquals(true, soluction(a));
	}
	
	@Test
	public void testData1() {
		String a= "race a car";
		Assert.assertEquals(false, soluction(a));
	}

	@Test
	public void testData2() {
		String a= " ";
		Assert.assertEquals(true, soluction(a));
	}
	public boolean soluction(String a) {
		String output="";
		a=a.toLowerCase();
		a= a.replaceAll("[^a-zA-Z0-9]", "");

		char[] charArray = a.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {

			output=output+charArray[i];
		}
		if(a.equals(output)) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public boolean soluction1(String a) {
		String output="";
		a=a.toLowerCase();
		a= a.replaceAll("[^a-zA-Z0-9]", "");

		char[] charArray = a.toCharArray();
		for (int i = a.length()-1; i >=0 ; i--) {

			output=output+a.charAt(i);
		}
		if(a.equals(output)) {
			return true;
		}
		else {
			return false;
		}
	}
}
