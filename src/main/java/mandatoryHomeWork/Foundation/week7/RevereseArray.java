package mandatoryHomeWork.Foundation.week7;

import org.junit.Test;

public class RevereseArray {

	/*

	1.Undetstood
	Write a Java Program to reverse an array?
	char[] s = { 'a', 'b', 'c', 'd', 'e' };
	IP-->char[]
	OP--> Char[]

	2. test cases 

	Postive-->char[] s = { 'a', 'b', 'c', 'd', 'e' };
	Edge --> char[] s ={};
	Char[] s={ 1,1,1};
	Pseudo code
	1. find the length of the input array and create a for loop to iterate
	2. create a two int variable one with 0 and other with length-1;
	3. create the temp variable to store last index value of array
	 */
	@Test
	public void testData() {
		char[] s = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(soluction(s));
		char[] s1 = { '1','1','1'};
		System.out.println(soluction(s1));
		char[] s2 = {};
		System.out.println(soluction(s2));
		char[] s3 = { 'C', 'h', 'e', 'n', 'n','a','i' };
		System.out.println(soluction(s3));
	}
	public char[] soluction(char[] s){
		int b=s.length-1;
		for(int i=0;i<s.length;i++){
			if(i<b) {
				char temp=s[i];
				s[i]=s[b];
				s[b]=temp;
				b--;
			}
		}
		return s;
	}
}
