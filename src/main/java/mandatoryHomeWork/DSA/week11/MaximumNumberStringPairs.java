package mandatoryHomeWork.DSA.week11;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class MaximumNumberStringPairs {
	
	/*
	 * 
	 * https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/
	 * Pseudo code
	 * 1. create a for loop to iterate and convert each word to char[]
	 * 2. sort and compare 
	 * 
	 */
	
	@Test
	public void testData(){
	//	System.out.println(maximumNumberOfStringPairs1(new String[]{"cd","ac","dc","ca","zz"}));
		//Assert.assertEquals(2, maximumNumberOfStringPairs1(new String[]{"cd","ac","dc","ca","zz"}));
	}
	
	 public int maximumNumberOfStringPairs(String[] words) {
		 int count=0;
		 for(int i=0;i<words.length;i++) {
			 
			 for(int j=i+1;j<words.length;j++) {
				 char[] charArray1 = words[i].toCharArray();
				 char[] charArray2 = words[j].toCharArray();
					Arrays.sort(charArray1);
					Arrays.sort(charArray2);
				 if( Arrays.equals(charArray1, charArray2)) {
					 count++;
				 }
			 }
		 }
		 return count;
	    }
	 /* not working
	 public int maximumNumberOfStringPairs1(String[] words) {
		 int count=0;
		 for(int i=0;i<words.length;i++) {
			 
			 for(int j=i+1;j<words.length;j++) {
				if(words[i].indexOf(words[j].charAt(0))!=-1&&words[i].indexOf(words[j].charAt(0))!=-1) {
					count++;
	
				}
					
				}
			 }
		
		 return count/2;
	    }*/
}
