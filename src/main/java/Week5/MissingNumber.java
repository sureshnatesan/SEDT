package Week5;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MissingNumber {
	
	/*
	 * 
	 * Pseudo code
	 * ip->int[], int
	 * op-> int
	 * 
	 * 1. Sort the array and create a for loop to iterate
	 * 2.check the array values vs i+1, if not equals, return i+1;
	 * 
	 *  */
	
	@Test
	public void testData() {
		int [] a= {1, 2, 3, 5};
		int s=5;
		Assert.assertEquals(4, missingNumber(a,s));
	}
	
	@Test
	public void testData1() {
		int [] a= {};
		int s=1;
		Assert.assertEquals(-1, missingNumber(a,s));
	}
	
	public int missingNumber(int array[], int n) {
        Arrays.sort(array);
        if(array.length==0) {
        	return-1;
        }
        for(int i=0;i<n-1;i++){
            if(array[i]!=i+1){
                return i+1;
            }
            String s="";
            
        }
        return -1;
    }

}
