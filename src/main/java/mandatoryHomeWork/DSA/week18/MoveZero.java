package mandatoryHomeWork.DSA.week18;

import java.util.Arrays;

import org.junit.Test;

public class MoveZero {

	/*
	 * https://leetcode.com/problems/move-zeroes/
	 */

	@Test
	public void testData(){
		int [] a= {0,1,0,3,12};
		System.out.println(Arrays.toString(soluction(a)));
	}

	//0,1,0,3,12
	public int[] soluction(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==0) {
					a[i]=a[j];
					a[j]=0;
				}
			}
		}
		return a;
	}
	
	public int[] soluction1(int[] a) {
		int i=0;
		for(int nums:a) {
			if(nums!=0) {
				a[i]=nums;
				i++;
			}
		}
		while(i<a.length) {
			a[i++]=0;
		}
		return a;
	}
}
