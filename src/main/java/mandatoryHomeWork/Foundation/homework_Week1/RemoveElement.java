package mandatoryHomeWork.Foundation.homework_Week1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElement {
	
	
	
	/*
	 * Pseduo code
	 * 1. find the length of the array
	 * 2. find the count of the target elements
	 * 3. create one output array
	 * 4.
	 */

	@Test
	public void testdata() {
		int [] a= {2, 3, 3, 4, 5};
		Assert.assertArrayEquals(new int[] {2,4,5}, soluction(a, 3));
	}
	
	@Test
	public void testdata1() {
		int [] a= {2, 2};
		Assert.assertArrayEquals(new int[] {}, soluction(a, 2));
	}
	
	
	
	public int[] soluction(int[] a, int target) {
		
		List<Integer> sd= new ArrayList<>();
		
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==target) {
				
			}
			else {
				sd.add(a[i]);
			}
		}
		
		int[] output =new int[sd.size()];

		for (int i = 0; i < sd.size(); i++) {
			output[i]=sd.get(i);
		}
		
		return output;

	}
}
