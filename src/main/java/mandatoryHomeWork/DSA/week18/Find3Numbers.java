package mandatoryHomeWork.DSA.week18;

import java.util.Arrays;

public class Find3Numbers {

	//n =  [3,5,8,1,2,0,6,4]
	// output=4,6,8
	
	
	/*
	 * Pseudo code
	 * 
	 * 1. Postive td
	 * n =  [3,5,8,1,2,0,6,4]
	// output=4,6,8
	 * 
	 * 2. Negative td
	 * 
	 * n=-8,-5,-8-3,4,3
	 * output=-8,-8,4
	 * 
	 * 
	 * 3.edge case
	 * n= 0,0,9
	 * output =-1
	 * n=-8,-5,-8-3,4,3
	 * output=-8,-8,4
	 * n= 2,2,1
	 * output =2,2,1
	 * 
	 */
	
	
	public int[] soluction1(int[] a) {
		if(a.length<3) {
			return new int[]{-1,-1};
		}

		Arrays.sort(a);
		int left=0;
		int right=0;
		
		left=a[0]*a[1];
		right=a[a.length-1]*a[a.length-2];
		
		if(left<right) {
			return new int[]{a[a.length-1],a[a.length-2],a[a.length-3]};
		}
		else {
			return new int[]{a[0],a[1],a[a.length-1]};
			
		}

	}
	
	
}
