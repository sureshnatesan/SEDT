package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class WinnerBowlingGame {

	/*
	 * https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/
	 * 
	 * Pseudo code
	 * 1.Create a int variable namely prod and initiate as 1
	 * 2.create a for to iterate the and check if the input is 10 if 10 and above increase the prod by 1
	 * 3. create a two sum variable to store the sum of two player
	 * 4. use the if condition to check which player score is high
	 * 
	 * Time Complexity:O(n)
	 * Space Complexity:O(1)
	 */

	@Test
	public void testData(){
		int[] a1= {7,8,8,5,2};
		int[] a2= {10,1,4,2,6};
		System.out.println(isWinner(a1,a2));
	}
	public int isWinner(int[] player1, int[] player2) {
		int prod1=1;
		int turn1=0;
		int sum1=0;
		boolean status1=false;
		int sum2=0;
		int turn2=0;
		boolean status2=false;
		for (int i = 0; i < player1.length; i++) {
			if(player1[i]==10) {
				turn1=i;
				sum1+=player1[i];
				status1=true;
				continue;
			}
			if(turn1+3<=player1.length) {
				status1=false;
			}
			if(status1==true) {
				sum1+=2*player1[i];
			}
			else {
				sum1+=player1[i];
			}
		}
		for (int i = 0; i < player2.length; i++) {
			if(player2[i]==10) {
				sum2+=player2[i];
				turn2=i;
				status2=true;
				continue;
			}
			int w=turn1+3;
			if(i<w) {


				if(<=player1.length) {
					status2=false;
				}
			}
			if(status2==true) {
				sum2+=2*player2[i];
			}
			else {
				sum2+=player2[i];
			}
		}

		System.out.println("a "+sum1);

		System.out.println("b "+sum2);
		if(sum1==sum2) {
			return 0;
		}
		else if(sum1<sum2) {
			return 2;
		}
		else {
			return 1;
		}
	}
}
