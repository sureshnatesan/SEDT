package mandatoryHomeWork.DSA.week12;

import org.junit.Assert;
import org.junit.Test;

public class SlidingWindows {
//
	//@Test
	public void testData(){
		Assert.assertEquals(12, getMaxmium(new int[] {1,5,2,3,7,1},3));
	}
	
	//@Test
	public void testData1(){
		Assert.assertEquals(7, getMaxmium(new int[] {1,5,2,3,7,1},1));
	}
	
	//@Test
	public void testData2(){
		Assert.assertEquals(0, getMaxmium(new int[] {1,6,9,5},6));
	}
	
	//@Test
	public void testData3(){
		Assert.assertEquals(98, getMaxmium(new int[] {-9,-867,-768,9,89,-0},3));
	}
	
	@Test
	public void testData4(){
		int a= Integer.MAX_VALUE+Integer.MAX_VALUE;
		System.out.println(a);
}
	
	
	//1,3,5,2,7,1
	public int getMaxmium(int[] nums, int k) {
		 //1. one pointer should work
		if(k>nums.length) {
			return 0;
		}
		 int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
		 // not needed second pointer as this is balanced traversal ,right = k-1;

		  //2. Do the required operation till k index
		 while(pointer < k)
		  currentSum += nums[pointer++];

		 //3. continue the operation for rest of the array
		 while( pointer < nums.length){
		  max = Math.max(currentSum, max);
		 // currentSum += nums[pointer] - nums[pointer-k];
		  //pointer++;
		  currentSum += nums[pointer];
		  currentSum-= nums[pointer++-k];
		  }

		 return Math.max(currentSum, max);
	}
}
