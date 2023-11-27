package mandatoryHomeWork.DSA.week19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class FindDifferences {

	
	/*
	 * https://leetcode.com/problems/find-the-difference-of-two-arrays/
	 */
	
	

	@Test
	public void testData(){
		int[] a= {1,2,3};
		int[] b = {2,4,6};
		soluction1(a,b);
	}
	
	private void soluction1(int[] s1, int[] s2) {
		List<Integer>list1= new ArrayList<>();
		List<Integer>list2= new ArrayList<>();
		
		Map<Integer,Integer> map= new HashMap<>();
		Map<Integer,Integer> map1= new HashMap<>();
		for (int i = 0; i < s1.length; i++) {
			list1.add(s1[i]);
			map.put(s1[i], 0);
		}
		for (int i = 0; i < s2.length; i++) {
			if(map.containsKey(s2[i])) {
				map.remove(s2[i]);
			}
			map1.put(s2[i], 0);
		}
			
		for (int i = 0; i < s1.length; i++) {
			if(map1.containsKey(s1[i])) {
				map1.remove(s1[i]);
			}
		}
		
		System.out.println(map);
		System.out.println(map1);
	}
}
