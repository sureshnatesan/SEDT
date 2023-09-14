package mandatoryHomeWork.DSA.week11;

import org.junit.Test;

public class DigitValue {

	/*
	 * 
	 * https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/
	 * 
	 * Pseudo code
	 * 1. Create a int[] array with given int string size
	 * 2. conver the character to int
	 * 
	 */
	//1210"

	@Test
	public void testData(){
		System.out.println(digitCount("1210"));
	}
	public boolean digitCount(String num) {
		int[] sum= new int[num.length()];
		for(int i=0;i<num.length();i++) {
			sum[i]=Character.getNumericValue(num.charAt(i));
		}
		
		for(int i=0;i<num.length();i++) {
			int count=0;
			for(int j=0;j<num.length();j++) {
				if(i==Character.getNumericValue(num.charAt(j))){
					count++;
				}
			}
			if(sum[i]!=count) {
				return false;
			}
		}
		return true;
	}

}
