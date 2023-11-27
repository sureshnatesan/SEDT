package mandatoryHomeWork.DSA.week20;

import org.junit.Test;

public class GetNumberFromString {

	
	/*
	 * 
	 * 1. Java program -
Input - Siv2nan3a Te4t5r
Output - 23+45 = 68//written in for loops need optimised ones
	 	System.out.println(s.replaceAll("\\D", ""));
	 	it is used to get number from string
	 */
	
	@Test
	public void testData(){
		String s="Siv2nan3a Te4t5r";
		StringBuilder sb = new StringBuilder();
		

		
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))|| Character.isSpaceChar(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
		String val = sb.toString();
		int sum=0;
		String[] split2 = val.split(" ");
		for (int i = 0; i < split2.length; i++) {
			sum+=Integer.parseInt(split2[i]);
		}
		System.out.println(sum);
	}
}
