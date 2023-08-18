package mandatoryHomeWork.Foundation.Week5;

import org.junit.Test;

import junit.framework.Assert;

public class FindNearestNum {

	/*
	 * https://practice.geeksforgeeks.org/problems/nearest-multiple-of-102437/1?page=5&category[]=Mathematical&sortBy=submissions
    Pseudo code
    1. Convert string to int
    2. use the % operator and use the / opertor to get the div value and reminder value
    3. muliple by 10 for the div and check if mod is greater than 6 then add+10
    else, return div*10;


	 */

	@Test
	public void testData() {
		Assert.assertEquals("10", soluction("15"));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals("10", soluction("4"));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals("30", soluction("29"));
	}


	public String soluction(String n){
		long a = Long.parseLong(n);
		long rem= a%10;
		if(a<10) {
			return "10";
		}
		a=a/10;
		if(rem>5) {
		    a=a*10+10;
			return String.valueOf(a);
		}
		else {
		    a=a*10;
			return String.valueOf(a);
		}
	}

}
