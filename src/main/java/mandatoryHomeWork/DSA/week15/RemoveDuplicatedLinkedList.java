package mandatoryHomeWork.DSA.week15;

public class RemoveDuplicatedLinkedList {
	
	/*
	 * 
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	 */

	
	class Solution {
	    public ListNode deleteDuplicates(ListNode sum) {
	    	ListNode head=sum;
	    	
	   while(sum!=null&&sum.next!=null) {
		   if(sum.val==sum.next.val) {
			   sum.next=sum.next.next;
		   }
		   else {
			   sum=sum.next;
		   }
	   }
	   return head;
	    }
	}
}
