package mandatoryHomeWork.DSA.week20;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RomantoInteger {

	/*
	 * https://leetcode.com/problems/roman-to-integer/
	 * 
	 * Pseudo code
	 * 1. create a map to store all the value
	 * 2. iterate each character to for loop
	 * 3. if i is greather than or equals to i+1;
	 * 4. create a sum value and add on it
	 * 5. when i is less than i+1, subtract the value from sum
	 * 6. return the sum
	 * 
	 * 
	 */

	@Test
	public void testDat() {
		String s ="III";
		System.out.println(soluction(s));

	}

	private int soluction(String s) {
		Map<Character,Integer> map = new HashMap<>();
		map.put('I' , 1);
		map.put('V' , 5);
		map.put('X' , 10);
		map.put('L' , 50);
		map.put('C' , 100);
		map.put('D' , 500);
		map.put('M' , 1000);

		int sum=0;
		
		
		for (int i = 0; i < s.length()-1; i++) {
			if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))) {
				sum+=map.get(s.charAt(i));
			}
			else {
				sum-=map.get(s.charAt(i));
			}
		}
		sum+=map.get(s.charAt(s.length()-1));
		return sum;
	}



}
