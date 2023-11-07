package mandatoryHomeWork.DSA.week17;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MajorityElement {
	/*
	 * https://leetcode.com/problems/majority-element/description/
	 */
	
	
	 public int majorityElement(int[] a) {
		 Map<Integer,Integer> map= new HashMap<>();
		 int count=0;
		 int sum=0;
		 for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
	 
		 for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue()>count) {
				count=entry.getValue();
				sum=entry.getKey();
			}
		 }
		 return sum;
	 }

}
