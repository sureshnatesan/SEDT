package mandatoryHomeWork.DSA.week12;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetusing2Pointer {

	/*
	 * 
	 * 
	 * Pseudo code
	 * 1. create a while loop and create a two int variable;
	 * 2.
	 * 
	 */

	@Test
	public void testData(){
		//[2,3,5,7], target = 9
		//[2,3,5,7], target = 6
		//[2,3,5,7], target = 2
		//[2,3,5,7], target = 5
		//[4,4,4,4,4], target = 8
		//[], target =0
		
		Assert.assertArrayEquals(new int[] {0,3}, soluction12(new int[] {2,3,5,7},9));
		//Assert.assertArrayEquals(new int[] {0,0}, soluction(new int[] {2,3,5,7},6));
		Assert.assertArrayEquals(new int[] {0,1}, soluction12(new int[] {2,3,5,7},5));
		//Assert.assertArrayEquals(new int[] {0,1}, soluction(new int[] {4,4,4,4},8));
	}

	
	public int[] soluction12(int[] a,int n){
		int[] sum=new int[2];
		int start=0;
		int end =a.length-1;
		while(start<a.length-1) {
			if(a[start]+a[end]>n) {
				end--;
			}
			if(a[start]+a[end]<n) {
				start++;
			}
			if(a[start]+a[end]==n) {
				 sum[0]=start;
				 sum[1]=end;
				 return sum;
			}
			
		}
		return sum;
}
	
	public int[] soluction(int[] a,int n){
		int[] sum=new int[2];
		int start=0;
		int end =a.length-1;
		while(start<end) {
			if(a[start++]+a[end--]==n) {
				 sum[0]=start-1;
				 sum[1]=end+1;
				 return sum;
			}
		}
		return sum;
	}
	
	public int[] soluction1(int[] a,int n){
		int[] sum=new int[2];
		int start=0;
		int end =a.length-1;
		while(start<a.length-1) {
			if(a[start]+a[end--]==n) {
				 sum[0]=start;
				 sum[1]=end+1;
				 return sum;
			}
			if(end==0) {
				start++;
				end=a.length-1;
			}
		}
		return sum;
}
}
