package mandatoryHomeWork.Foundation.week7;

import org.junit.Test;

import junit.framework.Assert;

public class Coins {


	/*

	Pseudo code
	1. create a two for loop and outer loop to used to get competed row count 
	2. create int variable to store the counts of coins
	3. in the inner loop increase the count variable
	 */
	@Test
	public void postiveTest(){
		Assert.assertEquals(3,soluction(8));
	}


	public int soluction(int n){
		int count=0;
		int coins=0;
		for (int i=1;i<n;i++){
			for(int j=1;j<i+1;j++){
				coins=j;
			}
			count=count+coins;
			if(count>=n){
				return i-1;
			}
		}
		return -1;
	}

}
