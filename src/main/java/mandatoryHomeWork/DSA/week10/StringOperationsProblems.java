package mandatoryHomeWork.DSA.week10;

import org.junit.Test;

public class StringOperationsProblems {

	/*
	 * 
	 * String input = "I Lov!@#$%e My Country";
		String output = "I evo!@#$%L yM yrtnuoC";

		String input = "Nature i*^***%$s a g^%$ift";
		String output = "erutaN s*^***%$i a t^%$fig";

	 * Pseudo code
	 * 1. use the split method to get each character
	 * 2. reverse the each character
	 * 3. use the replace["^a-zA-Z0-9"]
	 */


	@Test
	public void testdata(){
		System.out.println(soluction("I Lov!@#$%e My Country"));

	}

	public String soluction(String s) {
		String[] split = s.split(" ");
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < split.length; i++) {
			for (int j = split[i].length()-1; j>=0; j--) {//0(n)^2
				if(Character.isLetter(split[i].charAt(j))){
					sb.append(split[i].charAt(j));	
				}	
			}
		}
		for (int j = 0; j < s.length(); j++) {
			if(!Character.isLetter(s.charAt(j))){
				//sb.insert();	
				sb.insert(j, s.charAt(j));
			}
		}
		return sb.toString().trim();
	}
}
