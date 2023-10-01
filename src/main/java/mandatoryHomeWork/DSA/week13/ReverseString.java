package mandatoryHomeWork.DSA.week13;

import java.util.Arrays;

import org.junit.Test;

public class ReverseString {

	/*
	 * https://leetcode.com/problems/reverse-string-ii/
	 * Input: s = "abcdefg", k = 2
		Output: "bacdfeg"
		
		Pseudo code
		1.Create a stringbuilder to capture the expected string value
		2.create a two variable namely left and right, and count set as 1 initialized
		3. 

	 */
	
	@Test
	public void testData(){
		System.out.println(reverseStr("abcd",2));
	}

	 public String reverseStr(String s, int k) {
		 String[] s1;
		 boolean status=false;
		 StringBuilder sb = new StringBuilder();
		 if(s.length()%k==0) {
			 s1= new String[s.length()/k];
		 }
		 else {
			 s1= new String[s.length()/k+1];
			 status=true;
		 }   
	        int left=0;
	        int right=left+k;
	        
	        int i=1;
	        while(right<s.length()) {
	        	s1[i]=s.substring(left, right);
	        	left+=k;
	        	right=left+k;
	        	if(i%2!=0) {
	        		 StringBuilder sb1 = new StringBuilder(s1[i]);
	        		 sb.append(sb1.reverse());
	       
	        	}
	        	else {
	        		sb.append(s1[i]);
	        	}
	        	i++;
	        }
	        
	        if(status==true) {
	        	sb.append(s.substring(s.length()-s.length()%k));
	        }
	        return sb.toString();
	    }
	
}
