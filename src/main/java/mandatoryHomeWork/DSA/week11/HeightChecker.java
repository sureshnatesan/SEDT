package mandatoryHomeWork.DSA.week11;

import java.util.Iterator;

import org.junit.Test;

public class HeightChecker {

	/*
	 * https://leetcode.com/problems/height-checker/description/
	 * Pseudo code
	 * 
	 * 1. sort the given input array
	 * 
	 */
	
	@Test
	public void testData(){
		int[] a= {1,1,4,2,1,3};
		System.out.println(heightChecker(a));
	}
	
	public int heightChecker(int[] a){
		int count=0;
		
		int [] s=new int[a.length];
		for(int c=0;c<a.length;c++) {
			s[c]=a[c];
		}
		
		int [] d=sortthearray(s);
		for(int i=0;i<d.length;i++) {
			
			if(a[i]!=d[i]) {
				count++;
			}
		}
	return count;
	}


	public int[] sortthearray(int[] s) {
		int[] heights = s;
		int max=Integer.MAX_VALUE;
		int temp;
		for (int i = 0; i < heights.length; i++) {
			for (int j = i+1; j < heights.length; j++) {
				if(heights[i]>heights[j]) {
					temp=heights[i];
					heights[i]=heights[j];
					heights[j]=temp;
				}
			}
		}
		

		return s;
	}
}
