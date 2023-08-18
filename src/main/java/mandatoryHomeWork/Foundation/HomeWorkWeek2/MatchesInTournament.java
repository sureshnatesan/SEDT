package mandatoryHomeWork.Foundation.HomeWorkWeek2;

import org.junit.Test;

import junit.framework.Assert;

public class MatchesInTournament {

	/*
	 * pseudeo code
	 * 1. initialise the int match , next round teams
	 * 2. and create while loop with condition t>1
	 * 3
	 */

	@Test
	public void testData() {
		Assert.assertEquals(6, soluction(7));
	}
	
	@Test
	public void testData1() {
		Assert.assertEquals(13, soluction(14));
	}
	
	public int soluction(int a) {
		int matches=0;
		int nextround=0;
		int output=0;
		
		
		
		while(a>1) {
			if(a%2!=0) {
				matches=a/2;
				nextround=matches+1;
				a=nextround;
			}
			else if(a%2==0) {
				matches=a/2;
				nextround=matches;
				a=nextround;
			}
			output=output+matches;
		}
		return output;
	}

}
