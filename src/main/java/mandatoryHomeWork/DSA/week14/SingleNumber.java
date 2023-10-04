package mandatoryHomeWork.DSA.week14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class SingleNumber {

	/*
	 * 
	 * https://leetcode.com/problems/single-number/description/
	 * Pseudo code
	 * 1. Create a set and store all the input values
	 * 2. if it return false the remove the particular value from set
	 * 3. create a for loop and iterate the same step till the length of the input
	 * 4. return the ramining value
	 * 
	 * 
	 */

	@Test
	public void testData(){
		int[] a= {2,2,1};
		System.out.println(singleNumber(a));
		
		
	}
	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int[] sum = new int[1];
		for (int i = 0; i < nums.length; i++) {
			if(set.add(nums[i])==false) {
				set.remove(nums[i]);
			}
		}
		//int parseInt = Integer.parseInt(set.toString());
		return set.iterator().next();
	}

}
