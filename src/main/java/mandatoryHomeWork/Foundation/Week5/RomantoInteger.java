package mandatoryHomeWork.Foundation.Week5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class RomantoInteger {

	/*https://leetcode.com/problems/roman-to-integer/
	 * Pseudo code
	 * 
	 * 1. create a map and store all the roman& int values
	 * 2. Iterate through the for loop and use charAt method
	 * 3. check if i is greather than i+1 if true add the values else subtract the values
	 * 
	 */

	@Test
	public void testData() {
		Assert.assertEquals(58, soluction("LVIII"));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals(50, soluction("L"));
	}
	
	@Test
	public void testData2() {
		Assert.assertEquals(3, soluction("III"));
	}
	
	@Test
	public void testData3() {
		Assert.assertEquals(1994, soluction("MCMXCIV"));
	}
	
	public int soluction(String s) {
		int sum=0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		if(s.length()<=1) {
			return (map.get(s.charAt(0)));
		}
		for (int i = 0; i <=s.length()-2; i++) {
			if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))) {
				sum=sum+map.get(s.charAt(i));
			}
			else {
				sum=sum-map.get(s.charAt(i));	
			}		
		}
		sum=sum+map.get(s.charAt(s.length()-1));
		return sum;
	}

}
