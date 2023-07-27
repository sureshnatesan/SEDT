package homework_Week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumber {

	/*
	 * Psudeo code
	 * 1. We should return the unique number -> Create a map with <Integer,Integer>
	 * 2. use the for loop to iterate the input array
	 * 3. return the key which give us 1;
	 */

	@Test
	public void testData() {
		int[] a= {2,2,1};
		Assert.assertEquals(1, returnSingleNumber(a));
	}
	
	@Test
	public void testData1() {
		int[] a= {4,1,2,1,2};
		Assert.assertEquals(4, returnSingleNumber(a));
	}

	@Test
	public void testData2() {
		int[] a= {1};
		Assert.assertEquals(1, returnSingleNumber(a));
	}


	public int returnSingleNumber(int[] a ) {
		Map<Integer, Integer> map= new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);	
			}
			else {
				map.put(a[i], 1);	
			}
		}
		Set<Integer> keySet = map.keySet();
		for(Integer value:keySet) {
			if(map.get(value)==1) {
				return value;
			}
		}
		return -1;
	}
}
