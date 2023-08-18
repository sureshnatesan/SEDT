package mandatoryHomeWork.Foundation.week7;

import org.junit.Assert;
import org.junit.Test;

public class Squareofarray {

	/*1. Create a for loop to iterate 
	2. squares of the each value in array and replace in the same array
	3.After the squares of the each value, store the array with two for loop and create a temp int variable to store and assigin the value

	 * 
	 */
	
	@Test
	public void testData() {
		int[] a=new int[] {0,1,9,16,100};
		Assert.assertArrayEquals(a, soluction(new int[] {-4,-1,0,3,10}));
		Assert.assertArrayEquals(new int[] {9,49,81,100}, soluction(new int[] {3,7,9,10}));
		Assert.assertArrayEquals(new int[] {0,1,9,16,100}, soluction(new int[] {-4,-1,0,3,10}));
		
	}
	
	
	
	public int[] soluction(int a[]){
		for (int i=0;i<a.length;i++){
			a[i]=a[i]*a[i];
		}

		for (int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		return a;
	}

}
