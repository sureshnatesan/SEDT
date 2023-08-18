package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import org.junit.Assert;
import org.junit.Test;

public class MoveZero {

	/*
	 * pseudo code
	 * 
	 * 1. create a two for loop
	 * 2.  compare inner loop ==0
	 * 3. if zero then, create a two variable inside the outer for loop
	 * use the swap concept
	 */

	@Test
	public void testdata() {
		int[] a= {0,1,0,3,12};
		Assert.assertArrayEquals(new int[] {1,3,12,0,0},soluction(a));	
	}

	@Test
	public void testdata1() {
		int[] a= {0};
		Assert.assertArrayEquals(new int[] {0},soluction(a));	
	}
	public int[] soluction(int[] a) {
		int temp=0;
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
