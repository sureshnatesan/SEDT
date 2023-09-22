package mandatoryHomeWork.DSA.week12;

import java.util.Iterator;

import org.junit.Test;

public class SubStringAllThree {

	/*
	 * https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
	 * 1.create a two while loop and create a two point left and right respectively
	 * 2.use the index of method to find wheather the character is present are not
	 * 3. 
	 * 
	 * 
	 */
	@Test
	public void testData(){
		String d="aacbacaaabababacabbaaabcacbccbbcbbbaabbbbababccacbaaabaacabcccbcacccbaccabccbccbacbaaabaabbcabcbaacacacbacccababaaccbcabacbbcbabcbbaaabcabbabcabcbccbcaacaaaaacabbccbbbbabaccbaccabababaabaccbaccacabbbccabbaabaccaabaaaacbaabacaacabbcbcbcbbaacbaaabccbbbbbaabcbabacccbcbbacabaabababacccbabbababcbabaccccaaaaababcacaacabbbbaacbaccaaaabbacccbaaaccabcccccaabbcaaccabacbbcbcbcbabbabbacbcaacbcacaabbbcbacaabaacbccbcccaabbcbacbbccccbcaaaccbacabbcbcbacccbcaacccbaabbaccabcbccbbcaccacabcabcaaccccababbbabbacbaabccbacbbabccaacbcaaccabaabacabbcbcbacbbbaacbabaaaccacbcccaacbcbbccbcbaabcbbbcbbcccbacbbacabccccccabccbccbcabcccabcacbcbbbcccccabcaccbcabccacbbaacabbcbccbabbbabcabcaccbabacbaaccacabccbcbacaabbaacccbbcccaabccccbbccabcbabbcbcabccacacbbbabaaccacbccacbbcaaacbbbbaacaccbaaabbbaaaacaacabccccbbcbaccaaababbbaaabbccbabcbbbcaaaaaabbbcbabacaaabaccacbbaabcbaacacaababaaabcacbcacbbbcbbccaaaccabbcccccabcbcaccbcacbcccabaaaaabaacacbcbabaacabcabcbaccbabbababacbbcabbacbabaccabbcbcbaacbcccccccabcaabbcbabbacaabccbbbbbbbccccacaabcbbcabbbbbcbacaaacbcbacccbbcbbbbcbccaaabcacaaabccaaccbcaabaccccaaacacbacbbcbaacbabbcbcabcabbaaccbcbabccccbabbaabcccacabccbccccbcbccbcccbbbacbcacabcabcccabbbbccaaaabbbbbccbbbbabbabaaabbacbbbcbcbcbbbbacbbcbaaaaaacaabababccaaabcacacbbacacccbccabcbabcaaccabacbbccbbacbaabccaacbbccbbccacbbaaccbcbaccbbaacbbcabaababcccacccabbbbcbbbabbcbabacacccbcaacbccacabcbbbaaacbaacccacacaacacccbbbaabcaacabccbbcccbaabbaabaccabaacabbabcabaaabbcccaacbbacbabccacbbacccccbcbcbbacbcaaccaaaabbcabcbcbbabcacbaccbccccccacbbcaaacacabbbbaabbbacabbccccacacabccababccbbbbbcbaabacccaaacaccbcbccbbcacaacbaaacbbcbbccacbbbbbbbcacccaabcacacccbbcacababcabcaaabbcacbcbbbcccabbbcacbbaaabbaacaabbccbaacababbcccaccbacabacabcaaccaabcacabaaccaccccccaabbaccabacacbacaaabbbcbacaccbccbcbcacbcbabbbabcbaccacbbabbbbbbcbaaabaaacccacbcacacbbcaacaacaacbbbcaccacccaababaccbbcaabcabbcbacbacbabccacbbbcaabaacaabccacaccbacabccaccbcacaacbcbccabacaccccabbcbbbbacaacabababccbaaaccabbaaccacbcbaabccababacaabbaccacbabcccbbbbbacbabbccbacccbacbbbcaccaaccaabbbcacbcabcacbbccaabbaacacabbcbbbbcbacacabbcbccaacabbaabcccbaaabcbaccbacacbbbcaabbcaabbcacaccccccbaaaacaccacbbaabbbccbacaabaabcaaaacaacaabbabcbbbcaacaaccbcbcbbabaacccccbccbbacbaccbcccccbccccbcbabccbcbccbbbacabbbacbacbbccabbacababccabbabbbcaacabaccaacbbcbaacccaccccbbbbbcbaabacacacaacbbacacbccbacccbbbacaabbcbcbbcaccbccbbabacbacaccccbbbaaaccccaabaaaacabccaaaaacbbacacababbcccbaaabaaccbabbbaacaccaaaaabaabcaabaaacbbacabaacaaaaaccaacabcbcbacacbabbbbccbcbababbaccaaabbcbbbbbbbbbbcabababcacccaabccaaaacbabcbabbbabacbbaacbacabcaacacbcbcbcccbbcaababccaaabbcbabaabccaaaaabcbaaaabccccccbbccbacbababaaaaaaabbaabacaccaabccacbaccccaabbcaabbcbabacbccccbcbcabbbabaccbaababbbbbbabacbaabbcabbcccbcbcbcabababbccccabbabcaaccaacaaccbcbcbcaccbbabccccbaccbacbbbaccccbabbaaababcbacbbacacabcacabbabbaabaacccbaccbbbccbacccbcabcacababbccccacbbcbbaaacaacbabbabbccacacbbbbbacbaacacacabbbbcabacbbbbbcaabcbccbcababacaaabcaacabababcbbbabbcbbccbccbbbaabababacacbbbcccbccbccbbbcbcaaacacaabcabbabbbcccbababbcbcaabcbccaaacbbacbabababaaccababbbccccbaaaacaaabccababccccbcaabaaacbcbacaacbcaabcabcbabbacbacaacaccbabcaaaabbabcccccbcbabbcbbbbbcaaaaaaaacbbcbcaaacaabbbaaccbbbccacbaccbcabaaccabaabaababcabacbabcccaacccbcccbacbbcbbaaacccbaabaaacccaacbaabbcacbcbbcaccabcbbabbbbcabcaccbbbccabccbccbcccbbcabaaababbbcbaacababbccbcbacacabcabbacbcccacbaacbccccccbacbcbccaaaacaaaccbaacaaaacbccbbcabcaacbaabcbbbbaaacacbbbbcaaaaababbaabacccbabcccabbbcbaaccbcabbcaaabcabccbacbaaabcaabbcccccbbcbacbabaabbcbcaacbbcbbcabacccbccacccabbbabaabcbabccacbbacababcaacababcabaaaacbbbacbcbbacbcabcaaccabbcbcbcacbbcaaaaabbaaaccabbcaaababacbaccbccbbaaaaacbccbacabbcaaaabaccbbbbbbaaacbaaabbcbaacaaaacaccccabcacabacaaaaaabcaccbabacbbbcbbcccbbaabcbacacacabaabbabccbcacaacbcbcbcaaabcbbcacbaccccaaaabaacbbaaaaccbbaacbcacbaaabcbbccbbcabbbbbcabcaacccbaabcbabaccabbcabcabcccbacabcbcbcabcbacbabbacabcccaabcaabbbcbcbccacbcacaaababbacbcccbabbaabccaabcabaaaabaababcccaababccbaaccbbbcbbbbcaabccbabaccccccabbcbbbcbbcbbabcccccabacabcbabcbbaabaaaabaaaabcccbaabacbccabcbabbbcbbaacbcbbbcccbcbaaabbbaccbcaaccacabcabccccaabacacbbbbcacaabaaabbccbbcbbbaccaaccbaaaaaabacbbcccbccbcbacbbaaccbaccaccbcabbcaccbbcacbcbccaccbcccabbcacaaccbbabcaabcccbcacbcbccbccabccbababbcccaccacccbbbbcaccbacbbbabaacababaaaaaaacaccaabbabaabccaaccbabcbcccabcacaacbabaacacbcbccbbbacabccacccabcbabcababbabcacacaacbbcabcbbcbabacbccbaaacabbbabcabbacbaaabbaacbccaaabbcbbcbcaaabbccabaacabcaabcbcbaaabbcbcbbccbbcbbcabacbbbcaaccaacacbbbbcaabaccabcbbabcaccbacbcabbabccbbabbcbababccbbbbabbbabbcbcbcabaacabaccbabacccbaabacbcbcacaabacbaacbccabbcaaabbcccabbbaabbccbcacccabcbcaacbacbcbabababaacbbcbbabababcaaacbcaccbacbbabaccaaaccccbcccaabcacacbcaacbcbaaaacbccbccbaccbbacbcbcaccbbccbccaaccaaabacbaaccacabbbacbbaaacbbbbbbcabbbbcacbabaabababbabbacccbbbbbccbacbbbaacacbbcbcbababcaaacbbacaacacbbcbabcbcaacacaaabcaabbaabccaaacacbbaaaacbabcbacabaaacaaacccacbacbabcbaccbbccccaaccabcbbabccbbccaaabcbaccbcbbabacbcbcaacabacacabcacbbcabaccabcbcababbbacaacacbaacbbbcbacccbbacaccacacbaabcabaabcbcacaacbbbaacbabaaaaccbccbbcccaabacaacbaccabcabcacacabccbbcabbabbabacbbcaabbbcabccacbbaaaacacbbcabccbaccaaabbbbababcbaaccbcbaaabcabacacccaabacccbaaaccaaacbbbaacaabcbcbbcabbbbbbbababacabaaacbacaacbccbaccbacaaabbaacaabccbcabcbaacabacbcabbaaaccbbbbcbbccccaabbccbbcabbaabbccaabcccaacbacabccaacccbcabbaabbcbcbacbacccabbaccbccaacaaabaaccccbcbaaaaccacacaaacbabbcaabbbcacacbaccbbbccbbbbbcacccacabaaacaabaababbbbcccccacbbacaabccbacbbacccbbcbaababbbbbaccccaacbbabacaccbbbcaaccaacacccbcbbbaacbbcccbbcbabacbcbbccbbbbaabbccbcacbaaabcabacbbaaaaabccbabcbbabaacbbccbcbcacccaaacbbaabcbbabbabbccabcbabcbcacaaabbbbababaccccabcbaccbaaccabababcabbcbaaabbbbccabbccbaababaabbaccbcaacbaabaacbccabcbcbbbcccbacaaabaccaaacabaabccbbcccbcccccbbbbaccababcabaabbccabcacabcccbbacccaccbcaaaacaaacbaabbcbcbacabababbbcaacaabccaaacabcabccbcbabaabaacbaabaabccbbaaabacaacaaccbaaacbccabaababbcababcabcaabbcaabbcabcbbbaabcaccccaabccacbbaaaabacaabbcbbbbccccccbbaacbaccababaaccaacbabbcbaacacbbaccaabcaccbbbcaacbaaaaabacbbcbaacbcbbcbcbbaabbbaccbbabbcbcbcccaacabbabacacabbcbccaabacbcabbaabcaababccbccabaccbbbaccbbabcabbbcaacaabcaabcbcaacbcabbcabbcbcbbcacaacaacccbbcaacabaabcccbcbcbbbbbbbbbccbaacbbccbbcbcabcbbbabaccbaabaccccbabcbbbacacbbabbcbbabbbcabaacbaababccbcabaaacbbccbbbabaaacbbbabbbbbccbacbabaccaccbabbabbbcbbabaabbbabcaabaababbacccacacbbccbbbbbbaababacbcccbbaaabbbbbbcabcbcccaccabacababccaaacccaaacbaccccbbcbabcbbcbbbcccabcbbabbcabcaaaccaabbaabbcabccbacbaaaacbcbbabcaccacaacacaaabcbbbcbcabacbbcacbacabbacbccbbacccacbbbbbccbbbcaabbaaabacacbaaabcaacbbcbaaabcbccbcbaabbaaaabababccbcabbcabcbaaccabcabbabbbaaabacaacabbaccacacaaaabaabbabccbcbcacccaaabbacbacbabcbbaaabcaabaaaabaacbbccccbbcaaabccabababbbbccaaaaaacbcbaaccbacbcbaacbabaaababacabbccccbbaacbbbcbacbacbbcacacbbbacaabbcbcaacbabbcabbcabababbaababaccabababbccbcaccaccaabbbcbbcacccccbabccbaacbabacbbabacaabbcccbbccbabaacbccaaacacbaaabacbccbbccbabbaababcbabcbbbabbcabccacbbabcbbbcaacacaabbacabbbcaccabcbbcccbbcbbaaacbcbabccaababbccbbcbabacabacbccaaababaaabaacbaaabacbbbbacbccacaccccbaacccaabaabcbcacbbbabbabbacccabcaccbabaccaaabcbcbcaabbcbacaabcabcccbaabbbbcbcbcbcccaaacaaccbbcaaaacbacacacacaabcbcccbbbbaaccbaabaaabbabcaabccabcbaacacaaabacbcbaccaacabcababbbbaccacacabaccbccbcabbbabcccbaaacabacabbcbcbaaabaccabcccccccbbcabccbcbbabccaaaaabcbcabcbabbbbbaabaaabcccccbccbbcbbcbbabbcbacacaccaabaccbbbabbabaababcccaccbaaababcccabbcaaabacbabbacacababbcacbcccbaaaabbcaacabbcabaabcacbbcacacaacbbbcbacbaababbaacbbbbbccccacaabcaabbcbbcbabcbaabbabccbaccbccaacbbbbbaacbaaabbacccaaabbbbabaaabbaaaabcbbbbacbabbbccbababbcccaabbaabbbaaccccbbbbaabbacabacbcbabacbacbbcacaacccbcccaaacbbccbbcbcbcbcaababcbcbccaacbbcabbbcaaccccaacccbbaccaccaaccbccbccacbcaaaaaabbbaaabaaababbccabccacbbcababcabccbabcbabbbbaabcbcacabaabbbabbbcabaccaaacbbbaaaaabaababbabcabacaccaacabcbcaaacccccbcbcbcbbcccacbabaaaaaacbbcacaccabcccacccabbbcacbcbaacbaccbacbabccbcaccabaaccaacaccaaacbbacccccabbccabbbabaaacacbaccaababccbcaccccacbabacacbcbcccbbbcbcbcabcbacbacbcabccccbcbacbbaabccabcabacbababbaaabbbbaccbababcccbccaabaacababcbbaccacbcacabbcbbbabcacccaccbcccaababccaaccbccbcacabaaabbccbabccbabaccbabbbccccacababbaacbabcbbccccababbcbbbaccacaabbaaccbabcbbabaabcbacacacbbacabcababacbcbaccbbabaaccccbccbbbababababaaaaaaabbbcccbabccbaccacabcbacacccbbbcccaabaacacbabbbcacbccabaccbacccabacaabbacabcabbbcaacbccbccbbbabccccbabacbabacabcccccbacbcabcaaacabaabacababcacbcbabcaacaacbaaabaacaaccaacbcacbbabbcbaccababbcaaacbbaaaaccaaaccbccaccabaaabacbcaaabaccabcabbcccabcaacabbcacabbcbcaccaabbaababccbbccabaccacacbccbaaccbaacbbccabcababcbbacabbacabcbbacaabcbbcaccabcbcccbaccbbcbbbaaaccbcbaaabbbaccbcccbcbccacaabbbcbaabaaabaabcaacabbaacacbcaabcbabccaccaabccaacbabcccbaaccccbbcbbabbabbcbababbabcacabbbbcbabccaccaccababccccaacccabacbbccacacaacbaacaaaccaccccccacbbcacacacabbaaccbbbabbbbbbbccabacccbbcaabababcccbaacacabbccccaaaccbaccbaaacbbaacbbacaabbcacbcbbbccacaccaccacabaabaabacbccbccaccbacbbacacabacbbcaabbacbcbabbaabcacacabbcabbccaccbbcccccbbbbaaccaaabcabbcaabcbaaacacaabaabbbcacabbcaccaacbaaaccabcacaaccacbccbcabbaccbcccbaccbabccabaabbaccbbcaacbbbabbbaabbbacbbbabccaccbbaacaacabbbcababbacbbbbcbccaccabbcaacbcbaacccaacaaaaccaabcbaccabccaacacaaababccacbbbacbbbcbaaacbabbbcccbacaabbcbcabcbbccbaacaccacacbbbbcccccbbbbabcbacabccacaaabbbcbabcacacbbcabaaaabbccabaccaabaccbaccaacaccbaccaabcabacccbbaaccbabcbaacaaaccbcacbaacababacacbaaabcbbcccacacbccaacccbcbcacabcabccbccbbbbbacaaabaaccccacbacbbacabccbccbcaababbbacabcbaaccaaccacacccccaaabbabbbcabaaaaaaabcbbbacababcbbaccbccccaabbbaaabbbccbbcccaccacababbccaababcabbcababbaacacaaabcacbbccbccbbbbcbaaccbcacbbbcacaabcabaccaacacbcacbbccbabcbaccbccacbbcbaababaccaaccababbcbacabaabbaacccaaccaaaabcabcbbbabbccbcabbaaacabcaabccbcabcbabaac";
		String d1="aaacb";
		System.out.println(numberOfSubstrings22(d1));
	}

	public int numberOfSubstrings22(String s) {
		int left=0;
		int right=0;
		int count=0;
		int[] sum= new int[3];
		//"aaacb";
		
		while(right<s.length()) {
				sum[s.charAt(right)-'a']+=1;
					
			while(sum[0]>0&&sum[1]>0&&sum[2]>0) {
				count+=s.length()-right;
				sum[s.charAt(left++)-'a']-=1;
			}
			right++;
		}
	
		return count;
	}
	public int numberOfSubstrings(String s) {
		int count=0;
		int left=0;
		int right =left+2;
		
		while(left<s.length()-2&& right<=s.length()) {
			if(right==s.length()&&left<s.length()-2) {
				left++;
				right =left+2;
			}
			String  sum="";
			if(right<s.length()) {
				sum= s.substring(left, right+1);
			}
			if((sum.indexOf('a')!=-1)&&(sum.indexOf('b')!=-1)&&(sum.indexOf('c')!=-1)) {
				count++;
				count+=s.substring(right+1).length();
				left++;
				right =left+2;	
			}
			else {
				right++;
			}
		}
		return count;
	}
}
