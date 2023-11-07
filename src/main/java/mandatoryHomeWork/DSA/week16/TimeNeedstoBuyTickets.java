package mandatoryHomeWork.DSA.week16;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Test;

public class TimeNeedstoBuyTickets {
	
	
	/*
	 * https://leetcode.com/problems/time-needed-to-buy-tickets/
	 */
	
	@Test
	public void testData(){
		int[] a= {2,3,2};
		
		System.out.println(timeRequiredToBuy(a,2));
	}
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        int count =0;
        for (int i = 0; i < tickets.length; i++) {
			queue.add(i);
		}
        //1,2,1
        while(!queue.isEmpty()) {
        	count++;
        	int a= queue.poll();
        	if(tickets[a]>=1) {
        		tickets[a]--;
        	}
        	if(k==a&&tickets[a]==0) {
        		break;
        	}
        	if(k!=a&&tickets[a]==0) {
        		continue;
        	}
        	queue.add(a);
        }
       return count; 
    }

}
