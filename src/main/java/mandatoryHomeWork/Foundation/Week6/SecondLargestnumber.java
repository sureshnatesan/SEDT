package mandatoryHomeWork.Foundation.Week6;

import org.junit.Test;

import junit.framework.Assert;

public class SecondLargestnumber {

	/*
	 * Pseudo code
	 * 1. create to for loop to iterate to find the max value from array
	 * 2. create one more for loop to get the second value and it should be less than max and greather than other values
	 * 3
	 */

	@Test
	public void testData(){
	//	Assert.assertEquals(94,soluction(new int[] {100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89}));
	}

	@Test
	public void testData1(){
		//Assert.assertEquals(856,soluction(new int[] {100,134, 436, 437, 94, 984, 512, 856, 356,87,984}));
		Assert.assertEquals(856,soluction1(new int[] {100,134, 436, 437, 94, 984, 512, 856, 356,87,984}));
		
	}
	
	public int soluction(int[] a) {
		int max=0;
		int second=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>second && a[i]<max) {
				second=a[i];
			}
		}
		return second;
	}
	
	public int soluction1(int[] a) {
		int first=0;
		int second=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>first) {
first=a[i];
			}
			if(a[i]>second&&a[i]<first) {
				second=a[i];
			}
		}
return second;
	}
}
