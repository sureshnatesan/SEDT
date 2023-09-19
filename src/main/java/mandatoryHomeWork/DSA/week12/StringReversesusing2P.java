package mandatoryHomeWork.DSA.week12;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class StringReversesusing2P {


	/*
	 * 
	 * 
	 * 
	 * Pseudo code
	 * 1. split the given input by spaces
	 * 2. 
	 */


	@Test
	public void testData(){
		System.out.println(rev("I Lov!@#$%e My Country"));
	}

	//1,3,5,2,7,1
	public String rev(String a){
		String s[]=a.split(" ");

		for (int i = 0; i < s.length; i++) {
			int left=0;
			int right=s[i].length()-1;
			char sum[]= s[i].toCharArray();
			while(left<right&&i<s.length){
				if(Character.isAlphabetic(sum[left])&&Character.isAlphabetic(sum[right])){
					char dd= sum[left];
					sum[left++]=sum[right];
					sum[right--]=dd;
				}
				else if(!Character.isAlphabetic(sum[left])) {
					left++;

				}
				else if(!Character.isAlphabetic(sum[right])) {
					right--;	
				}
			}
			s[i]=new String(sum);
		}
		return s.toString();
	}
}
