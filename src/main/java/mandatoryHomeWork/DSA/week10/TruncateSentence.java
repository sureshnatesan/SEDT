package mandatoryHomeWork.DSA.week10;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class TruncateSentence {

	/*
	 * https://leetcode.com/problems/truncate-sentence/
	 * Pseudo code
	 * 1. use the split method to split the word.
	 * 2. use the for loop to iterate the word.
	 * 
	 */


	@Test
	public void testData() {
		String s= "Hello how are you Contestant";
		int k = 4;
		System.out.println(soluction(s,k));
	}
	public String soluction(String s,int k) {
		String[] split = s.split(" ");
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(split[i]+" ");
		}
		return sb.toString().trim();
	}

}
