package mandatoryHomeWork.DSA.week13;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SubarrayDivision {

	/*
	 * 
	 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
	 * 
	 * Pseudo code
	 * 1. find the sum of input with the window size as m;
	 * 2. create a while loop and iterate till length of the input
	 * 3.if is equals or greather than d increase count
	 * 
	 */
	
	@Test
	public void testData(){
		int[] a = {1,4};
	List<Integer> a1=new ArrayList<>();
	for (int i = 0; i < a.length; i++) {
		a1.add(a[i]);
	}
	
	System.out.println(birthday(a1,4,1));
	}
//int[] a = {1,2,1,3,2};
	public static int birthday(List<Integer> s, int d, int m) {
		int sum=0;
		int left=0;
		int count=0;
		for (int i = 0; i < m; i++) {
			sum+=s.get(i);
		}
		if(sum==d) {
			count++;
		}
		while(left+m<s.size()) {
			sum+=s.get(left+m)-s.get(left);
			if(sum==d) {
				count++;
			}
			left++;
		}
		return count;
	}
}
