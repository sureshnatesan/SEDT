package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetElement {
	
	/*
	 * Pseudo code
	 * 1. Create one for loop to iterate the array
	 * 2. then compare with the target value
	 * 3. if compare value is not equal to target value add them in the ou
	 * output array/ in a String
	 * 
	 */
	
	@Test
	public void testData() {
		int[] a= {2, 3, 3, 4, 5};
		//2,4,5
		Assert.assertArrayEquals(new int[]{2,4,5}, soluction(a, 3));
		soluction(a, 3);
	}
	
	@Test
	public void testData1() {
		int[] a= {2, 2};
		Assert.assertArrayEquals(new int[]{}, soluction(a, 2));
		soluction(a, 3);
	}
	
//	public int[] soluction1(int[] a, int target) {
//		String sum="";
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]!=target) {
//				sum=sum+a[i];
//			}
//		}
//		
//		int[] output =new int[sum.length()];
//	}
//	
	public int[] soluction(int[] a, int target) {
		String sum="";
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=target) {
				sum=sum+a[i];
			}
		}
		
		int[] output =new int[sum.length()];
		for (int i = 0; i < sum.length(); i++) {
			output[i]=Character.getNumericValue(sum.charAt(i));
		}

		return output;
	}

}
