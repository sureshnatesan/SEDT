package mandatoryHomeWork.DSA.week13;

import java.util.Arrays;

import org.junit.Test;

public class FindSubArrayLength {


	/*
	 * 1,2,3,4,5 5-2
	 * 
	 * 
	 * 
	 * Pseudo code
	 * 1.
	 */

	@Test
	public void testData(){
		int[] a= {1,2,3,4,5};
		System.out.println(soluction1(a,13));
	}
	private int soluction(int[] a,int k) {
		Arrays.sort(a);
		if(a[a.length-1]>k)return 1;
		int right=a.length-1;
		int left =right-1;
		int sum=a[right];
		while(left>=0) {
			sum+=a[left--];
			if(sum>k) return right-left;
		}

		return -1;
	}
	private int soluction1(int[] a,int k) {
		int left=0;
		int right=0;
		int window=Integer.MAX_VALUE;
		int count=Integer.MAX_VALUE;
		int sum=0;
		while(left<a.length&& right<a.length) {

			while(sum>k) {
				window= right+1-left;
				left++;
			}
			if(window<count) {
				count=window;
			}
			sum+=a[right++];
		}

		return count;
	}
}
