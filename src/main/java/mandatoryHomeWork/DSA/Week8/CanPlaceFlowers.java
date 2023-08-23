package mandatoryHomeWork.DSA.Week8;

import java.util.Arrays;

import org.junit.Test;

public class CanPlaceFlowers {

	/*
	 * https://leetcode.com/problems/can-place-flowers/
	 * 
	 * Pseudo code
	 * 1. check the input length, if length is 1 && value is 0, return true
	 * 2. check the input length , if length is 1 and value is also 1 return false
	 * 3. check for first two index , if both are zero, make first index as 1 and increase the count variable
	 * 4. repeate the above step for last indeex and index -1 , and make last index as 1 and increase the value by 1
	 * 
	 */
	@Test
	public void testData() {
		System.out.println(canPlaceFlowers(new int[]{1},0));
	System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1},1));
		//System.out.println(canPlaceFlowers(new int[]{0,0,1,0,1},1));
	}


	public boolean canPlaceFlowers(int[]flowerbed , int n) {
		int count =0;
		int sum =0;

		if(flowerbed.length==1) {
			if(flowerbed[0]==0) {
		
					return true;
		
			
			}
			else if(flowerbed[0]==1&& n==0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if(flowerbed.length>1) {
			if(flowerbed[0]==0&&flowerbed[1]==0) {
				sum++;
				flowerbed[0]=1;
			}
			if(flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0) {
				sum++;
				flowerbed[flowerbed.length-1]=1;
			}
		}
		
		
		for(int i=1;i<flowerbed.length-1;i++){
			if(flowerbed[i-1]==0&&flowerbed[i]==0&&flowerbed[i+1]==0){
				sum++;
				flowerbed[i]=1;
			}
		}

		if (sum>=n){
			return true;
		}
		else{
			return false;
		}
	}
}
