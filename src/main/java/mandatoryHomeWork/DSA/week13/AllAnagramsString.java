package mandatoryHomeWork.DSA.week13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AllAnagramsString {


	/*
	 * 
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
	 * Pseudo code
	 * 1.create a left and right int variable and left will be 0 and right became right is equal to left+p of length
	 * 2. create a for loop to iterate  and store them in int array with size of 26
	 * 3. use the sliding window approach to create one more for loop to store the p size of the s input 
	 *Time Complexity :O(n)
	 *Space Complexity: O(n)
	 *
	 *
	 */


	@Test
	public void testData(){
		System.out.println(findAnagrams1("abab","ab"));
	}

	public List<Integer> findAnagrams1(String s, String p) {
		int[] p1 = new int[26];
		int[] s1 = new int[26];
		List<Integer> list = new ArrayList<>();
		if(s.length()<p.length()){
			return list;
		}
		for (int i = 0; i < p.length(); i++) {
			p1[p.charAt(i)-'a']++;
		}
		for (int i = 0; i < p.length(); i++) {
			s1[s.charAt(i)-'a']++;
		}
		if(Arrays.equals(s1,p1)) {
			list.add(0);
		}
		int left =0;
		int right =left+p.length();
		while(right<s.length()) {
			s1[s.charAt(left)-'a']--;
			s1[s.charAt(right)-'a']++;
			if(Arrays.equals(p1,s1)) {
				list.add(left+1);
			}
			left++;
			right =left+p.length();
		}
		return list;
	}
	
	/*
	public List<Integer> findAnagrams(String s, String p) {
		int left =0;
		int right =left+p.length();
		List<Integer> list = new ArrayList<>();

		while(right<=s.length()) {
			String sum=s.substring(left, right);
			char[] ch=sum.toCharArray();
			Arrays.sort(ch);
			char[] charArray = p.toCharArray();
			Arrays.sort(charArray);
			if(Arrays.equals(ch, charArray)) {
				list.add(left);
			}
			left++;
			right =left+p.length();
		}
		return list;
	}*/


}
