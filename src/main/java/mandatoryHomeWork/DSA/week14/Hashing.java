package mandatoryHomeWork.DSA.week14;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Hashing {
	
	
	public void soluction(){
		String key="SizeOfTheArray";
		int a=key.hashCode()>>>16;
		System.out.println(a);
		System.out.println(16-1&a);
		//a>>>16;
		
		Map<String, String> map= new HashMap<>();
		map.put("chennai", "TamilNadu");
		
	}

	@Test
	public void testData(){
		int [] a= {2,7,11,15};
		int k=9;
		
		
		System.out.println(twoSum(a,k));
	}

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map= new HashMap<>();
		int[] sum= new int[2];
		for (int i = 0; i < nums.length; i++) {
			map.put(i,nums[i]);
			
			if (nums[i] == target-nums[i]) {
				sum[1]= i;
	        }
		}
		
		for (int i = 0; i < nums.length; i++) {
			if(map.containsValue(target-nums[i])) {
				sum[0]=i;
				//sum[1]=map.get(target-nums[i]);
			}
			if (nums[i] == target-nums[i]) {
				sum[1]= i;
	        }
		}
		return sum;
	}
}
