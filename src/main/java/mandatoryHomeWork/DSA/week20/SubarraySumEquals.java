package mandatoryHomeWork.DSA.week20;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SubarraySumEquals {


	/*
	 * 
	 * https://leetcode.com/problems/subarray-sum-equals-k/
	 * 
	 * Pseudo code
	 * 1. create a left and right variable, both start at zero position
	 * 2. use the if condition to check left is not equal to right
	 * 3. if both equals , check for only one left or right variable with k
	 * 4. if s[left} alone match k, increment and right by one and increase the counter
	 * 5. k is greather than sum , increment right alone, then check 
	 *  6. still k is greather than sum , increase the right again
	 *  7. if sum is greather than k increase the left alone and check
	 *6. 
	 *
	 *
	 */

	@Test
	public void testData() {
		int[] s= {1,3,4,2,4};
		//int[] s= {1,1,1};
		int k=4;
		soluction1(s,k);
	}

	private void soluction(int[] s, int k) {
		int left=0,right=0,counter=0;
		int sum=0;
		sum=s[left];
		while(left<s.length && right<s.length) {
			if(sum<k) {
				right++;
				sum+=s[right];
			}
			if(sum>=k) {
				if(sum==k) {
					counter++;
				}
				sum-=s[left++];
			}
		}
		System.out.println(counter);
	}

/*
 * int[] s= {1,1,1};
		int k=2;
 */
	private void soluction1(int[] s, int k) {
		int left=0,right=0,counter=0;
		int sum=0;
		sum=s[left];
		while(left<s.length && right<s.length) {
			if(sum==k) {
				counter++;
				left++;
				right++;
			}
			else if(sum<k) {
				right++;
				sum+=s[right];
			}
			else  {
				left++;
			}
		}
		System.out.println("count : "+counter);
	}


	private void subArraySum(int[] nums, int k) {
		int sum = 0, result = 0, key = sum - k;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i]; key = sum - k;
			if (map.containsKey(key)) {
				result += map.get(key);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		System.out.println(result);
	}



}
