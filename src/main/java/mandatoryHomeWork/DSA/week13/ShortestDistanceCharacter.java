package mandatoryHomeWork.DSA.week13;

import java.util.Arrays;

import org.junit.Test;

public class ShortestDistanceCharacter {
	
	/*
	 * https://leetcode.com/problems/shortest-distance-to-a-character/description/
	 * Pseudo code
	 * 1. create a int[] with the given the string input size;
	 * 2. find the given ch char, so increament the right alone;
	 * 
	 *
	 * 
	 */
	
	@Test
	public void testData(){
		Arrays.toString(shortestToChar("loveleetcode",'c'));
	}
	
	  public int[] shortestToChar(String s, char c) {
	        int[] sum= new int[s.length()];
	        
	        int left=0;
	        int right=0;
	        
	      for (int i = 0; i < s.length(); i++) {
			while(left<s.length()&&right<s.length()) {
				if(left>=0) {
					
				}
			}
		}
	        
	    
	      return sum;  
	    }

}
