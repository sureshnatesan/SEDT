package mandatoryHomeWork.Foundation.Week4Day1;

import org.junit.Test;

import junit.framework.Assert;

public class ExcelSheetColumnNumber {

	/*
	 * https://leetcode.com/problems/excel-sheet-column-number/
	 * Pseudo code
	 * IP:String
	 * OP:int
	 * 1. find the length of the string
	 * 2. use the while to iterate and use the math.pow mthd to use the power
	 * of methode
	 * 
	 */

	@Test
	public void testData(){
		Assert.assertEquals(701, soluction("ZY"));
	}
	
	@Test
	public void testData1(){
		Assert.assertEquals(28, soluction("AB"));
	}
	
	@Test
	public void testData2(){
		Assert.assertEquals(1, soluction("A"));
	}

	public int soluction(String s) {
		int n=s.length()-1;
		double sum=0;
		int k=0;
		while(n>=0) {
			sum=sum+(Math.pow(26, k++)* (s.charAt(n)-64));
			n--;
		}
		return (int)sum;
	}
}
