package mandatoryHomeWork.DSA.week18;

public class ContainerWithMostWater {
	
	/*
	 * https://leetcode.com/problems/container-with-most-water/description/
	 * 
	 * 
	 * Pseudo code
	 * 
	 * 1. create a while to iterate
	 * 2. create int left and right value
	 */
	
	
	   public int maxArea(int[] height) {
	        int sum=height.length-1;
	        int max=0;
	        int left=0;
	        int right=height.length-1;
	        
	        while(left<right){
	            int min1 = Integer.min(height[left], height[right]);
	           int min=min1*sum;
	            if(max<min) {
	            	max=min;
	            }
	            if(min1==height[left]) {
	            	left++;
	            	sum--;
	            }
	            else {
	            	right--;
	            	sum--;
	            }
	        }
	        
	        return max;
	    }

}
