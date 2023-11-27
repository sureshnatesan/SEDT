package mandatoryHomeWork.DSA.week19;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class UnCommanWords {

	/*
	 * 
	 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
	 */

	@Test
	public void testData(){
		String s1 = "fd kss fd";
		String s2 = "fd fd kss";		
		System.out.println(Arrays.toString(soluction1(s1,s2)));

	}

	private String[] soluction1(String s1, String s2) {
		s1=s1+" "+s2;
		String sum="";
		Map<String,Integer> map= new HashMap<>();
		String[] split = s1.split(" ");
		
		for (int i =0; i < split.length; i++) {
			map.put(split[i].trim(), map.getOrDefault(split[i], 0)+1);
		}
		
		for(Map.Entry<String,Integer> entry :  map.entrySet()) {
			if(entry.getValue()==1&&(!entry.getKey().equals(""))) {
				sum=sum+" "+entry.getKey();
			}
		}
		String[] split2 = sum.trim().split(" ");
		if(sum.trim().split(" ").length==1&&split2[0].equals("")) {
			return new String[] {};
		}
		return sum.trim().split(" ");
	}

	private String[] soluction(String s1, String s2) {
		s1=s1+" "+s2;
		int a=1;
		String[] split = s1.split(" ");
		Arrays.sort(split);
		System.out.println(Arrays.toString(split));
		for (int i = 1; i < split.length; i++) {
			if(!split[i].equals(split[i-1])) {
				//sum=sum+" "+split[i];
				split[a++]=split[i];
			}
		}
		return split;
	}
}
