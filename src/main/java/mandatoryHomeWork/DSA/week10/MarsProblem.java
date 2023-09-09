package mandatoryHomeWork.DSA.week10;

import org.junit.Test;

public class MarsProblem {

	/*
	 * 
	 * https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true
	 * Pseudo code 
	 * 1. Create a for loop to iterate and use the substring method
	 * 2. if substring is not equal to "sos" increase count by 1
	 */

	@Test
	public void testData1(){
		System.out.println(marsExploration("SOSOOSOSOSOSOSSOSOSOSOSOSOS"));
	}

	public  int marsExploration(String s) {
		int count=0;
		System.out.println("length "+s.length());
        for (int i = 0; i < s.length(); i+=3) {
            if(s.charAt(i)!='S') {
                count++;
            }
             if(s.charAt(i+1)!='O') {
                count++;
            }
             if(s.charAt(i+2)!='S') {
                count++;
            }
        }
        return count;
	}

}
