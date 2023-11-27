package mandatoryHomeWork.DSA.week19;

import org.junit.Test;

public class TwoStringArraysEquivalent {

	
/*	
	@Test
	public void testData(){
		String [] a= {"a", "cb"};
		String[] b= {"ac","b"};
		System.out.println(arrayStringsAreEqual(a,b));
	}
	*/
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		
		boolean status =false;
		StringBuilder sb= new StringBuilder();
		StringBuilder sb1= new StringBuilder();
		for (int i = 0; i < word1.length; i++) {
			sb.append(word1[i]);

		}
		for (int i = 0; i < word2.length; i++) {
			sb1.append(word2[i]);
		}

		if(sb.toString().equals(sb1.toString())) {
			status =true;
		}
		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		return status;
    }
}
