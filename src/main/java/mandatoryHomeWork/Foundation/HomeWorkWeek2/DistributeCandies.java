package mandatoryHomeWork.Foundation.HomeWorkWeek2;
import org.junit.Test;

import junit.framework.Assert;

public class DistributeCandies {

	/*
	 * pseudo code
	 * 
	 * 1. first we have to find the no of different type candies
	 * 2. if type is greater than >n/2, we return n
	 * 3. if type is lesser than <n/2, we should return type;
	 * 4, use the sort logic first
	 * 
	 */

	@Test
	public void testData() {
		int[] a= {1,1,2,2,3,3};
		Assert.assertEquals(3, soluction(a));
	}
	
	@Test
	public void testData1() {
		int[] a= {1,1,2,3};
		Assert.assertEquals(2, soluction(a));
	}
	
	@Test
	public void testData2() {
		int[] a= {6,6,6,6};
		Assert.assertEquals(1, soluction(a));
	}

	public int soluction(int[] a) {
		int count=1;
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}


		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1]){
				count++;
			}
		}

		if(count>(a.length/2)) {
			return (a.length/2);
		}
		else
			return count;
	}

}
