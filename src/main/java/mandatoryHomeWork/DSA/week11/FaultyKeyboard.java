package mandatoryHomeWork.DSA.week11;

import java.util.Iterator;

import org.junit.Test;

public class FaultyKeyboard {
	
	
	/*
	 * https://leetcode.com/problems/faulty-keyboard/description/
	 * Pseudo code
	 * 1.use the for loop to iterate 
	 * 2. use the char At method and check for i
	 */

	@Test
	public void testData(){
		System.out.println(finalString1("poiinter"));
	}
	
	 public String finalString(String s) {
		 StringBuilder sb= new StringBuilder();
		 for (int i=0;i<s.length();i++) {
			 if(s.charAt(i)!='i') {
				 sb.append(s.charAt(i));
			 }
			 else if(s.charAt(i)=='i') {
				 sb.reverse();
			 } 
		 }
		 return sb.toString();
	    }
	 
	 
	 public String finalString1(String s) {
		String sum="";
		String out="";
		 for (int i=0;i<s.length();i++) {
			 if(s.charAt(i)!='i') {
				 sum=sum+s.charAt(i);
			 }
			 else if(s.charAt(i)=='i') {
				 out="";
				 for (int j=sum.length()-1;j>=0;j--) {
					 out=out+sum.charAt(j);
				 }
				 sum=sum.replaceAll(sum, out);
				 System.out.println("jhj  -> "+sum);
			 } 
		 }
		 return sum;
	    }
}
