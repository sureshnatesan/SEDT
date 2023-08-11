package Week6;

import org.junit.Test;

import junit.framework.Assert;

public class StraightLine {


	/*
	 * 
	 * https://leetcode.com/problems/check-if-it-is-a-straight-line/
	 * 
	 * Pseudo code
	 * 1. create a for loop to iterate with the specific input length
	 * 2. create two int[] to store the x and y values differences
	 * 3. Create one more for loop to check the difference are same or not
	 */

	@Test
	public void postive(){
		Assert.assertEquals(true,checkStraightLine(new int[][] {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
	}
	
	@Test
	public void negative(){
		Assert.assertEquals(false,checkStraightLine(new int[][] {{1,1},{2,2},{3,4},{4,5},{5,6},{6,7}}));
	}
	
	
	public boolean checkStraightLine(int[][] coordinates) {
        int count=0;
		int[] a= new int[coordinates.length-1];
		int[] b= new int[coordinates.length-1];
		if(coordinates.length<2){
			return true;
		}
		for (int i = coordinates.length-1; i >=1; i--) {
			int count1 =(coordinates[i][0])-(coordinates[i-1][0]);
			int count2= (coordinates[i][1])-(coordinates[i-1][1]);
			if(count1<0) {
				count1=count1*-1;
			}
			else if(count2<0) {
				count2=count2*-1;
			}
			a[count]=count1;
			b[count]=count2;
			count++;
			
		}
		for (int i = 0; i < b.length-1; i++) {
			if(a[i]!=a[i+1]||b[i]!=b[i+1]) {
				return false;
			}
		}
		return true;
    }

}
