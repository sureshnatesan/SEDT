package mandatoryHomeWork.DSA.week12;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class ReplacetheChar {


	@Test
	public void Soluction() {

		String s= "Booking.com";
		int count=1;
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='o') {
				sb.append(returndollar(count++));
			}
			else {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

	@Test
	public void testData(){
		reverseString(new char[] {'h','e','l','l','o'});
	}
	
	
	public void reverseString(char[] s) {
		int left=0;
		int right=s.length-1;

		while(left<right){
			char temp=s[left];
			s[left++]=s[right];
			s[right--]=temp;
		}
		System.out.println(Arrays.toString(s));
	}

	public String returndollar(int a) {
		String d="";

		while(a>0) {
			d+='$';
			a--;
		}
		return d;
	}
}
