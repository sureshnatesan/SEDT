package mandatoryHomeWork.DSA.week11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class isValid {

	/*
	 * 
	 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem?isFullScreen=true
	 * 
	 * Pseudo code
	 * 1. map
	 */
	 
	 @Test
	 public void testData(){
		 System.out.println(isValid("abcdefghhgfedecba"));
	 }

	public static String isValid(String s) {

		int count=0;

		Map<Character,Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}

			else{
				map.put(c,1);
			}
		}
		int[] check=new int[map.size()];
		int j=0;
		for (Map.Entry<Character,Integer> entry : map.entrySet()) {
			check[j]=entry.getValue();
			j++;

		}
		Arrays.sort(check);
		if(check[0]==check[check.length-1]) {
			return "YES";
		}

		else if(check[0]==1&&check[1]==check[check.length-1]) {
			return "YES";
		}
		else if(check[0]==check[1]&&check[1]==check[check.length-2]&&check[0]==check[check.length-1]-1) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

}
