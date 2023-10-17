package mandatoryHomeWork.DSA.week16;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MostCommonWord {


	/*
	 * 
	 * https://leetcode.com/problems/most-common-word/description/
	 * 
	 */

	@Test
	public void soluction(){
		String[] p= {"bob", "hit"};
		System.out.println(mostCommonWord("Bob. hIt, baLl",p));
	}

	public String mostCommonWord(String paragraph, String[] banned) {
		String symbols="!?',;.";
		int value=0;
		String sum="";
		HashMap<String,Integer>mp=new HashMap<>();
		HashMap<String,Boolean>ban=new HashMap<>();

		paragraph = paragraph.replaceAll("[-+.^:,]","");

		String[]arr=paragraph.split(" ");
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i].replace(" ","");
			arr[i]=arr[i].toLowerCase();
			mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
		}
		for(int i=0;i<banned.length;i++){
			mp.remove(banned[i]);
		}

		for(Map.Entry<String, Integer> entry:	mp.entrySet()) {
			if(entry.getValue()>value) {
				value=entry.getValue();
				sum=entry.getKey();
			}
		}
		return sum;
	}
}
