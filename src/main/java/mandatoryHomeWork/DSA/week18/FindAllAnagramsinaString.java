package mandatoryHomeWork.DSA.week18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class FindAllAnagramsinaString {


	/*
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	 * 
	 */

	@Test
	public void testData(){
		System.out.println(findAnagrams("cbaebabacd","abc"));
	}
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list= new ArrayList<>();
		Map<Character,Integer> map= new HashMap<>();
		Map<Character,Integer> map1= new HashMap<>();
		if(s.length()<p.length()) return list;

		for (int i = 0; i < p.length(); i++) {
			map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0)+1);
		}

		for (int i = 0; i < p.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		if(map.equals(map1)) {
			list.add(0);
		}
		int left=0;
		int right=left+p.length();
		while(right<s.length()) {		
			if(map.containsKey(s.charAt(left))) {
				map.put(s.charAt(left), map.getOrDefault(s.charAt(left),0)-1);
			}
			if(map.get(s.charAt(left))==0) {
				map.remove(s.charAt(left));
			}
			left++;
			map.put(s.charAt(right), map.getOrDefault(s.charAt(right++), 0)+1);
			if(map.equals(map1)) {
				list.add(left);
			}
		}
		return list;
	}
}
