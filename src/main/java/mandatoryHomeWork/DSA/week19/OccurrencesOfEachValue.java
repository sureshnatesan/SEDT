package mandatoryHomeWork.DSA.week19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class OccurrencesOfEachValue {
	/*
	 * 
	 * Pseudo code
	 * 
	 * 1. Create a map to store value
	 * 
	 */

	@Test
	public void testData() {
		int[] a= {1,2,2,1,1,3};
		System.out.println(soluction(a));
	}

	private boolean soluction(int [] a) {
		Map<Integer,Integer> map= new HashMap<>();
		Set<Integer> set= new HashSet<>();
		
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		for (int i = 0; i < a.length; i++) {
			int c=map.get(a[i]);
			map.remove(a[i]);
			
			if(map.containsValue(c)) {
				return false;
			}
		}
		return true;
	}
}
