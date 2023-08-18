package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import org.junit.Assert;
import org.junit.Test;

public class SquaresSortedArray {
	
	/*
	 * Pseudo code
	 * 1. create one for loop and using the * operator a[i]=a[i]*a[i];
	 * 2. use the sort logic
	 */

	@Test
	public void testData() {
		int[] a= {-4,-1,0,3,10};
		Assert.assertArrayEquals(new int[] {0,1,9,16,100}, soluction(a));
	}
	
	@Test
	public void testData1() {
		int[] a= {-7,-3,2,3,11};
		Assert.assertArrayEquals(new int[] {4,9,9,49,121}, soluction(a));
	}
	
	public int[] soluction(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			a[i]= a[i]*a[i];
		}
		int temp=0;
		//swap logic
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a;
	}
}
