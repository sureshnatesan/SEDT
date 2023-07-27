package homework_Week1;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeros {

	/*
	 * Move the zero
	 * 
	 * 1. create a two for loop
	 * 2. In side the for loop, create the temp veriable
	 * 3. if zero, shift the value
	 */

	@Test
	public void testdata() {
		int [] a= {0,1,0,3,12};
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, soluction(a));
	}
	
	@Test
	public void testdata1() {
		int [] a= {0};
		Assert.assertArrayEquals(new int[] {0}, soluction(a));
	}
//
	public int[] soluction(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==0) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a;

	}
}
