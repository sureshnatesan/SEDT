package mandatoryHomeWork.DSA.week11;

import org.junit.Test;

public class ShuffleString {
	
	
	@Test
	public void testData(){
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		System.out.println(restoreString(s,indices));
	}
	 public String restoreString(String s, int[] indices) {
		 
		 char[] sum= new char[s.length()];
		 String a="";
		 for(int i=0;i<indices.length;i++) {
			sum[ indices[i]]=s.charAt(i);
		 }
		 
		 for(int i=0;i<sum.length;i++) {
			a=a+ sum[i];
		 }
		return a; 
	 }

}
