package mandatoryHomeWork.DSA.week11;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;
import org.testng.Assert;



public class caloriesProblem {

	/*
	 * 
	 * Input: 
	 * 
	 * 
	 * Test Data 
	 * Postive Test data
	 * calories = [3,2], 
	 * k = 2, lower = 0, upper = 1
		Output: 1
		Negative Test Data
	 * 	calories = [1,2,3,4,5],
	 *  k = 1, lower = 3, upper = 3
	 *  Edge Case
	 *  calories = [3,2], 
	 * k = 1, lower = 2, upper = 3
		Output: 0
	 *  
	 * Pseudo code
	 * 
	 * 1.create a loop to iterate with given length and subtract with k
	 * 2. sum the input based on the k value
	 * 3. check with lower and upper case
	 */

	@Test
	public void testName() throws Exception {
		int [] c= {1,2,3,4,5};
		Assert.assertEquals(0, soluction(c,1,3,3));
		
	}


	@Test
	public void testName1() throws Exception {
		int [] c= {3,2};
		Assert.assertEquals(1, soluction(c,2,0,1));
	}

	@Test
	public void testName2() throws Exception {
		int [] c= {6,5,0,0};
	
		Assert.assertEquals(0, soluction(c,2,1,5));
	}
	
	@Test
	public void testName3() throws Exception {
		double max = Integer.MIN_VALUE;
		System.out.println(max);
		double  s= 5.000/3.89;
		System.out.println(s);
		System.out.println(5/3);
		System.out.println(Integer.MAX_VALUE-1/Integer.MIN_VALUE);
		int [] c= {3,2};
		Assert.assertEquals(2, soluction(c,1,1,1));
	}

	public int soluction(int[] c, int k, int low, int upp) {
		int count =0;
		for(int i=0;i<=c.length-k;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {		
				sum=sum+c[j];
			}
			if(sum<low) {
				count-=1;
			}
			 if(sum>upp) {
				count+=1;
			}
		}
		return count;
	}
}
