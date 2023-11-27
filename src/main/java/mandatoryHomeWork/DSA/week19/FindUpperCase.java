package mandatoryHomeWork.DSA.week19;

public class FindUpperCase {


	/*
	 * 
	 *  input string - aBBBcdMOMkajleDAD
output - BBB MOM DAD
	 */



	public void testData() {

		String s="aBBBcdMOMkajleDAD";
		soluction1(s);
	}

	
	private void soluction1(String s) {
		StringBuilder sb= new StringBuilder();
		int left=0,right=0;
		while(right<s.length()) {
			if(Character.isLowerCase(s.charAt(right))&&Character.isLowerCase(s.charAt(left))) {
				sb.append("\\s+");
				
			}
			else if(Character.isUpperCase(s.charAt(right))){
				sb.append(s.charAt(right++));
			}
			else if(Character.isLowerCase(s.charAt(right))){
				left=right;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
	}
	private void soluction(String s) {
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
	}
}
