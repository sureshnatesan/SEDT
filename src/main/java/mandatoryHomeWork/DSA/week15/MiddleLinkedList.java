package mandatoryHomeWork.DSA.week15;

public class MiddleLinkedList {

	/*
	 * 
	 * https://leetcode.com/problems/middle-of-the-linked-list/
	 */
	class Solution {
		public ListNode middleNode(ListNode head) {
			ListNode current=head;
			ListNode pos=head;
			int size=0;
			int a=0;
			while(current!=null) {
				size++;
				current=current.next;
			}
			int position=0;
			if(size%2==1) {
				position=size/2;
			}
			else {
				position=size/2;
			}

			while(a<position){
				pos=pos.next;
				a++;
			}
			return pos;
		}
	}
}
