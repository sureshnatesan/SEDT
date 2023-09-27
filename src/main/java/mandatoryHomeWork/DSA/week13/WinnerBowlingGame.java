package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

public class WinnerBowlingGame {

	/*
	 * https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/
	 * 
	 * Pseudo code
	 * 1.Create a int variable namely left and initiate as 0
	 * 2. And create a int variable to store the sume of the values
	 * 3. Add the 0th position of the input with out any validation into sum
	 * 4. if the left is 1, check for the previous position if 10 the 2X the current position
	 * 5. if left is greather than 1, then check last or previous last position if 10 then 2x the current postion
	 * 6.create a two sum variable to store the sum of two player
	 * 7. use the if condition to check which player score is high
	 * 
	 * Time Complexity:O(n)
	 * Space Complexity:O(1)
	 */

	@Test
	public void testData(){
		int[] a1= {6,6,8,9};
		int[] a2= {10,1,10,0};
		System.out.println(isWinner(a1,a2));
	}
	public int isWinner(int[] player1, int[] player2) {

		int sum1=soluction(player1);
		int sum2= soluction(player2);
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
	public int soluction(int[]player1){
		int sum=0;
		int left=0;
		
		while(left<player1.length) {
			if(left==0) {
				sum+=player1[left];
			}
			else if(left==1) {
				if(player1[left-1]==10) {
					sum+=2*player1[left];
				}
				else {
					sum+=player1[left];
				}
			}
			else if(left>1) {
				if(player1[left-1]==10||player1[left-2]==10) 
				{
					sum = sum+2*(player1[left]);
				}
				else {
					sum = sum+player1[left];
				}
			}
			else {
				sum = sum+player1[left];
				}
			left++;
		
		}
		
		return sum;
	}
}

