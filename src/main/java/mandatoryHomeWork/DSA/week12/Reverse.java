package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

public class Reverse {
	
	
	public void rev(){
		String s="Super";
		String sum="";
		for(int i=s.length()-1;i>=0;i--) {
			sum=sum+s.charAt(i);
		}
		System.out.println(sum);
	}
	
	@Test
	public void testData(){
		System.out.println(revusing2Point("Super"));
	}
	
	
	
	public String revusing2Point(String s){
		char[] charArray = s.toCharArray();
		int a=s.length()-1;
		int b=0;
		while(b<a) {//O(n/2)
				char temp=charArray[b];
				charArray[b++]=charArray[a];
				charArray[a--]=temp;
			}		
		return new String(charArray);
	}
	
}
