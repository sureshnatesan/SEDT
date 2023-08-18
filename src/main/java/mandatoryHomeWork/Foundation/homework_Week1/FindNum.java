package mandatoryHomeWork.Foundation.homework_Week1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindNum {


	/*
	 * psudeo code
	 * 
	 * 1. Find the length of the array 
	 * 2. sort the array
	 * 3. find the first value in array and add them with one
	 * 4. find the result value is value in array , if its available 
	 * 5 We should return the resulted value  
	 * 6. else we should return 0
	 */
	
	@Test
	public void testdata() {
		int[] a= {1, 2, 3};
		Assert.assertEquals(2, soluction(a));
	}
	
	@Test
	public void testdata1() {
		int[] a= {1, 1, 3, 3, 5, 5, 7, 7};
		Assert.assertEquals(0, soluction(a));
	}

	@Test
	public void testdata2() {
		int[] a= {1, 1, 2};
		Assert.assertEquals(2, soluction(a));
	}


	public int soluction(int[] a) {
		Arrays.sort(a);
		int sum =a[0]+1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==sum) {
				return a[i];
			}
		}

		return 0;
	}
}
