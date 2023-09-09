package mandatoryHomeWork.DSA.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;


public class AcronymOfWords {
	
	/*
	 * https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
	 * 
	 * Pseudo code

		1. get the first character of each words from input array and compare with s input
    */
	
	@Test
	public void testData() {
		
		String[] words = {"alice","bob","charlie"};
		List<String> asList = Arrays.asList(words);
				String s="abc";
		Assert.assertEquals(isAcronym(asList,s),true );
	}
	
    public boolean isAcronym(List<String> words, String s) {
       if(words.size()!=s.length()){
			return false;
		}
		for(int i=0;i<words.size();i++){
			if(words.get(i).charAt(0)!=(s.charAt(i))){
				return false;
			}
		}
		return true;
    }
    
	

}
