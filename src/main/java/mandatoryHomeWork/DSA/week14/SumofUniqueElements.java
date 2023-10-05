package mandatoryHomeWork.DSA.week14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class SumofUniqueElements {

	/*
	 * https://leetcode.com/problems/sum-of-unique-elements/
	 * Pseudo
	 * 1.Create map and store all the values in the map
	 * 2. Iterate the map and count only if the value is 1
	 * 3. and return the sum;
	 */
	
	@Test
	public void testData(){
		int[] a= {1,1,3,1};
		System.out.println(sumOfUnique(a));
	}

	public int sumOfUnique(int[] nums) {
		Map<Integer,Integer> map= new HashMap<>();
		int count=0;
		for(int i=0;i<nums.length;i++){
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
			if(map.get(nums[i])==1) {
				count+=nums[i];
			}
			else if(map.get(nums[i])==2){
				count-=nums[i];
			}
		}
		return count;
	}

}
