package mandatoryHomeWork.DSA.Week8;

import org.junit.Test;

public class RobotReturnOrigin {

	
	/*
	 * 
	 * https://leetcode.com/problems/robot-return-to-origin/description/
	 * 
	 * Test data
	 * UUDD->true
	 * DUUDLLRR->true
	 * UDDDL->false
	 * 
	 * Pseudo code
	 * create a 4 variable to store all ups,downs,left, right
	 * use the comparetor operator, return true if 0 else false
	 */
	
	
	
	@Test
	public void testData() {
		System.out.println(soluction("RLUURDDDLU"));
	}

	public boolean soluction(String moves) {
		 int u=0;
			int d=0;
			int l=0;
			int r=0;
			for (int i = 0; i < moves.length(); i++) {
				if(moves.charAt(i)=='U'||moves.charAt(i)=='u') {
					u++;
				}
				else if(moves.charAt(i)=='D'||moves.charAt(i)=='d') {
					d++;
				}
				else if(moves.charAt(i)=='L'||moves.charAt(i)=='l') {
					l++;
				}
				else if(moves.charAt(i)=='R'||moves.charAt(i)=='r') {
					r++;
				}
			}
			if(u==d&&l==r) {
				return true;
			}
			return false;
	}
}

/////RLUURDDDLU"
//r->2
//l->3
//u->3
//d->3

