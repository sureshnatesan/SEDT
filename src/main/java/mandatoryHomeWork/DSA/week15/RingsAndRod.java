package mandatoryHomeWork.DSA.week15;

import org.junit.Test;

public class RingsAndRod {
	/*
	 * 
	 * https://leetcode.com/problems/rings-and-rods/
	 */

	@Test
	public void testData(){
		System.out.println(countPoints("B0B6G0R6R0R6G9"));
	}
	public int countPoints(String rings) {
		int count=0;
		int[] r= new int[10];
		int[] b= new int[10];
		int[] g= new int[10];
		for (int i = 0; i < rings.length(); i+=2) {
			if(rings.charAt(i)=='B') {
				int a=rings.charAt(i+1)-'0';
				b[a]++;
			}
			else if(rings.charAt(i)=='R') {
				int a=rings.charAt(i+1)-'0';
				r[a]++;
			}
			else if(rings.charAt(i)=='G') {
				int a=rings.charAt(i+1)-'0';
				g[a]++;
			}
		}
		for (int i = 0; i < g.length; i++) {
			
			if(r[i]>0&&g[i]>0&&b[i]>0) {
				count++;
			}
		}
		return count;
	}
}
