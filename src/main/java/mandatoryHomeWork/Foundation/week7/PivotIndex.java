package mandatoryHomeWork.Foundation.week7;
import org.junit.Test;

import junit.framework.Assert;

public class PivotIndex {


	/*
	 * 

	Postive test
	nums = [1,7,3,6,5,6]
	negative test
	nums = [1,2,3]
	edge test
	nums= [0,0,0,0,0]


	Pivot Index
	Pseudo code
	1.iterate uing for loop
	2.inside the for loop create two for loop and two variable
	3. compare the two variable and return the i value if return true



	code
	 */
	@Test
	public void postiveTest(){
		Assert.assertEquals(3,soluction(new int[] {1,7,3,6,5,6}));
		Assert.assertEquals(0,soluction(new int[] {2,1,-1}));
	}

	@Test
	public void negativeTest(){
		Assert.assertEquals(-1,soluction(new int[] {1,2,3}));
	}

	@Test
	public void edgeTest(){
		//Assert.assertEquals(0,soluction(new int[] {0,0,0,0,0}));
		Assert.assertEquals(2,soluction(new int[] {1,-1,2}));
	}
	public int soluction(int s[]){

		for(int i=0;i<s.length;i++){

			int left =0;
			int right =0;

			for(int l=i-1;l>=0;l--){
				left=left+s[l];
			}

			for(int r=i+1;r<s.length;r++){
				right=right+s[r];
			}

			if(left==right){
				return i;
			}

		}
		return -1;
	}


	/*
	 * Pseudo code
	 * 
	 * 1.create a two for loop
	 * 2. one for add the all sum and another for subtract
	 * 3.
	 */

	public int soluction1(int s[]){
		int sum=0;
		int left=0;
		for(int i=0;i<s.length;i++){
			sum=sum+s[i];
		}
		
		for(int l=0;l<s.length;l++) {
			sum=sum-s[l];
			left=left-s[l];
			
		}
		System.out.println(sum);
		System.out.println("left "+left);
		return left;
	}
}