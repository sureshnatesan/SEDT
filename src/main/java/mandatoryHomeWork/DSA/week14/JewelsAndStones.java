package mandatoryHomeWork.DSA.week14;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JewelsAndStones {
	
	/*
	 * https://leetcode.com/problems/jewels-and-stones/
	 */

	@Test
	public void testData(){
System.out.println(numJewelsInStones("aA","aAAbbbb"));
	}
	public int numJewelsInStones(String jewels, String stones) {

		Map<Character,Integer> map= new HashMap<>();
		int count=0;
		for(int i=0;i<stones.length();i++){
			Integer a = map.getOrDefault(stones.charAt(i),0);
			map.put(stones.charAt(i),a+1);
		}

		for(int i=0;i<jewels.length();i++){
			count+=map.getOrDefault(jewels.charAt(i),0);
	}

		return count;
	}

}
