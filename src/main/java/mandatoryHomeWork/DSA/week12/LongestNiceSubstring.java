package mandatoryHomeWork.DSA.week12;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LongestNiceSubstring {
	
	
	
	/*
	 * 
	 * https://leetcode.com/problems/longest-nice-substring/description/
	 * Pseudo code
	 *YazaAay
	 * 1.
	 */

	@Test
	public void testData(){
		System.out.println(longestNiceSubstring("YazaAay").toString());
	}
	
	  public List longestNiceSubstring(String s) {
	        char[] arr = s.toCharArray();
	       String sum="";
	      int left =0;
	      int right =1;
	      String count="";
	     List<String> list = new ArrayList<>();
	     
	      while(left<s.length()-1){
	    	  sum=sum+arr[left];
	    	  boolean lower=false;
		      boolean upper=false;
	          while(Character.toLowerCase(arr[left])==Character.toLowerCase(arr[right])) {
	        	  
	        	  if(Character.isLowerCase(arr[left])||Character.isLowerCase(arr[right])) {
	        		  lower=true;
	        	  }
	        	  if(Character.isUpperCase(arr[left])||Character.isUpperCase(arr[right])) {
	        		  upper=true;
	        	  }
	          }
	          sum=s.substring(left,right+1);
	          if(lower==true &upper==true) {
	        	 list.add(sum);
	          }
	          left++;
	          right+=1;
	      }
	      
	      return list;
	    }
}
