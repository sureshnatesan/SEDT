package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class ConsecutiveOnes {
	
	/*
	 * https://leetcode.com/problems/max-consecutive-ones/description/
	 * 
	 * Pseudo code
	 * 1. create two vatiable, namely left and right
	 * 
	 * 
	 */
	
	@Test
	public void testData(){
		int[] a= {1,1,0,1,1,1};
		System.out.println(soluction1(a));
	}
	
public int soluction1(int[] a) {
		
		int left=0;
		int right =left;
		int count=0;
		int sum=Integer.MIN_VALUE;
		
		while(left<a.length&& right<a.length) {
			if(a[left]==1) {
				right++;
				count++;
			}
			else {
				count=0;
				left=right;
			}
			if(sum<count) {
				sum=count;
			}
		}

		return sum;
	}

	public int soluction(int[] a) {
		
		int left=0;
		int count=0;
		int sum=Integer.MIN_VALUE;
		
		while(left<a.length) {
			if(a[left++]==1) {
				count++;
			}
			else {
				count=0;
			}
			if(sum<count) {
				sum=count;
			}
		}

		return sum;
	}
}
