package mandatoryHomeWork.Foundation.Week5;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseString {


	/*
	 * 
	 * 
	 * 
	 * Pseudo code
	 * 1. Use the split operation with spaces
	 * 2. Create a two for loop to iterate
	 * 3. reverese the each word and reverese them and replace them in original string

	 */
	@Test
	public void testData(){
		Assert.assertEquals("eW era retseT", soluction("We are Tester"));
	}


	public String soluction(String s) {
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String temp="";
			for (int j = split[i].length()-1; j >=0; j--) {
				temp=temp+split[i].charAt(j);
			}
			s=s.replace(split[i], temp);
			temp="";
		}
		return s;
	}

}
