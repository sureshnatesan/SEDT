package mandatoryHomeWork.Foundation.week7;

import org.junit.Assert;
import org.junit.Test;

public class GoodPair {


	/*
	 * https://leetcode.com/problems/number-of-good-pairs/description/
	 * 
	 * 1. Understanding question
2.ip--> int[], op-->int
3. Test data
Postive 
{1,2,3,1,1,3}
{-1,1,1,1}

negative 
{-0,-5,-5,0}
{5,5,5,5}
Edge cases
{};


Pseudo code

1. Create two for loop and iterate && create one int variable to store count.
2. check if outer for loop value is equals to inner for loop value
3. return the count.
	 */

	@Test
	public void testData() {
		Assert.assertEquals(4, soluction(new int[] {1,2,3,1,1,3}));
		Assert.assertEquals(6, soluction(new int[] {1,1,1,1}));
		Assert.assertEquals(0, soluction(new int[] {1,2,3}));
		
	}

	public int soluction(int a[]){
		int count=0;
		for (int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
				}
			}

		}
		return count;
	}


}
