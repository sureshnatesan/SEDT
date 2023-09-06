package mandatoryHomeWork.DSA.week10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class IsIsogram {

/*
 * Isomorphic Strings
https://leetcode.com/problems/isomorphic-strings/description/
 */
	@Test
	public void testData(){
		String s="bbbaaaba";
		String t="aaabbbba";
		isIsomorphic(s,t);
	}
	public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()){
			return false;
		}
		
		int[] s_arr=new int[256];
		int[] t_arr=new int[256];
		for (int j = 0; j < s.length(); j++) {
			if(s_arr[s.charAt(j)]!=t_arr[t.charAt(j)]) {
				return false;
			}
			int s_siz=(int)s.charAt(j);
			int t_siz=(int)t.charAt(j);
			s_arr[s_siz]=j+1;
			t_arr[t_siz]=j+1;
		}
		return true;
	}
}
