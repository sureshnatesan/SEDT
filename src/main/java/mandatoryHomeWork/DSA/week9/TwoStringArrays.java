package mandatoryHomeWork.DSA.week9;

import org.junit.Test;

public class TwoStringArrays {
	
	/*
	 * 
	 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
	 * 
	 * Test Data
	 * 1.{"we", "are in India"},{"we", "are ""in ""India"}
	 * 2. {"Nature","is" "so", "beautiful"},{"Nature","is"," so beautiful"}
	 * 3.{"Fire"}{"Fire"}
	 * 4.{},{}
	 * Pseudo code
	 * 1. 1. create a for loop for each input array
	 * 2. create two variable to store each string array value
	 * 3. if both array equals return the true else return false
	 * 
	 * 
	 */

	@Test
	public void testData(){
		System.out.println(arrayStringsAreEqual(new String[]{"we", "are in India"},new String[]{"we", "are ","in ","India"}));
	}
	
	   public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		  
		   String sum1="";
		   String sum2="";
		 for (int i = 0; i < word1.length; i++) {
			sum1=sum1+word1[i];
		}
		 for (int i = 0; i < word2.length; i++) {
			 sum2=sum2+word2[i];
		}
		   if(sum1.equals(sum2)) {
			   return true;
		   }
		   return false;
	   }

}
