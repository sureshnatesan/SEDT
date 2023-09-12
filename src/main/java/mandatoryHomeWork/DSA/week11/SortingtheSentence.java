package mandatoryHomeWork.DSA.week11;

import java.util.Iterator;

import org.junit.Test;

public class SortingtheSentence {
	
	
	/*
	 * 
	 * https://leetcode.com/problems/sorting-the-sentence/
	 * Pseudo code
	 * 1. use the split method to split the input string
	 * 2. use the charAt() and character.getNumerical value
	 * 
	 */
	
	@Test
	public void testData(){
		System.out.println(sortSentence1("is2 sentence4 This1 a3"));
	}

	
	 public String sortSentence1(String s) {
		  //StringBuilder sb= new StringBuilder();
		 String d="";
		 String[] a= s.split(" ");
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a.length;j++) {
				 int numericValue = Character.getNumericValue(a[j].charAt(a[j].length()-1));
				  if(i==numericValue-1) {
					  d=d+" "+a[j];
				  }
			 }
		 }
				  return d.replaceAll("\\d","").trim();
	  }
	 
	
	  public String sortSentence(String s) {
		  StringBuilder sb= new StringBuilder();
		 String[] a= s.split(" ");
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a.length;j++) {
				 int numericValue = Character.getNumericValue(a[j].charAt(a[j].length()-1));
				  if(i==numericValue-1) {
					  sb.append(a[j] +" ");
				  }
			 }
		 }
				  return sb.toString().replaceAll("\\d","").trim();
	  }
}
