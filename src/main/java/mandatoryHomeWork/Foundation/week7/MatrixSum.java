package mandatoryHomeWork.Foundation.week7;

import org.junit.Test;

import junit.framework.Assert;

public class MatrixSum {
	
	/*
	 * 
	 * Psuedo code
	 * 1.create a two for loop, one is used to iterate row and another one is for coloum
	 * 2. create a one variable to store the all values
	 */

	
	@Test
	public void postiveTest(){
		int[][] a= {{1,2,3},
			{4,5,6},
			{7,8,9}};
		Assert.assertEquals(45,soluction(a));
	}
	
	public int soluction(int a[][]) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum=sum+a[i][j];
			}
			
		}
		return sum;
	}
}
