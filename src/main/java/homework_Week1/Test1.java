package homework_Week1;

import java.util.Arrays;

import org.junit.Test;

public class Test1 {

	@Test
	public void testData() {
		System.out.println(isPalindrome("race a car"));
	}

	 public boolean isPalindrome(String a) {
	       String output="";
			a=a.toLowerCase();
	        a=a.replaceAll("[^A-Z0-9a-z]","");
	        for(int i= a.length()-1;i>=0;i--){
	            output=output+a.charAt(i);
	        }

	        if(a.equals(output)){
	            return true;
	        }
	        return false;
	    }
	 
	 
	public boolean isPowerOfThree(int n) {
		int i=0;
		while(i<=n){
			if(n==0){
				return false;
			}
			if((Math.pow(3,i++))==n){
				return true;
			}
		}
		return false;
	}
}
