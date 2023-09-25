package mandatoryHomeWork.DSA.week13;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class ReveString {


	/*
	 * 
	 * String a= "RADAR"
	 * String b= "@^&&^@"
	 */

	//@Test
	public void testdata(){
		System.out.println(soluction("RADAR"));
		System.out.println(soluction("@^&&^@"));
		System.out.println(soluction("radaR"));

		System.out.println(testing("@^&&^@"));
	}


	public boolean soluction(String a) {
		int left=0;
		int right=a.length()-1;
		while(left<right) {
			if(a.charAt(left++)!=a.charAt(right--)) {
				return false;
			}
		}
		return true;
	}

	public boolean soluction1(String a) {
		int left=0;
		int right=a.length()-1;
		while(left<right) {
			if(Character.toLowerCase(a.charAt(left++))!=Character.toLowerCase(a.charAt(right--))){
				return false;
			}
		}
		return true;
	}
	private boolean testing(String s) {


		int left= s.length()/2-1;
		int right;
		if(s.length()%2!=0) right=(s.length()/2)+1;
		else right=s.length()/2;

		while((left>=0)&&(right<s.length())){
			if(s.charAt(left--)!=s.charAt(right++)) return false;
		}
		return true;
	}
	@Test
	public void testdata1(){
		System.out.println(revnumber(121));
	}

	private boolean revnumber(int s) {
		int sum=s;
		int rev=0;
		int rem=0;
		while(s>0) {
			rem=s%10;
			rev=(rev*10)+rem;
			s=s/10;	
		}
		if(rev==sum) {
			return true;
		}
		else return false;
	}
	
	@Test
	public void testData(){
		System.out.println(Arrays.toString(revarray("this is a Tst")));
	}

	private boolean testing1(String s) {


		int left= s.length()/2-1;
		int right;
		if(s.length()%2!=0) right=(s.length()/2)+1;
		else right=s.length()/2;

		while((left>=0)&&(right<s.length())){
			if(Character.toLowerCase(s.charAt(left--))!=Character.toLowerCase(s.charAt(right++))) return false;
		}
		return true;
	}
	private boolean[] revarray(String s) {
		String[] split = s.split(" ");
		boolean[] sum= new boolean[split.length];
		for (int i = 0; i < split.length; i++) {
			sum[i]=testing1(split[i]);
		}
		return sum;
	}
}
