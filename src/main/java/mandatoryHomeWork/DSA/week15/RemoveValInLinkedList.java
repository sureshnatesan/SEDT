package mandatoryHomeWork.DSA.week15;

public class RemoveValInLinkedList {

//https://leetcode.com/problems/remove-linked-list-elements/

	class Solution {
		public ListNode removeElements(ListNode head, int val) {
			while(head!=null&&head.val==val){
				head=head.next;
			}
			ListNode pre=null;
			ListNode current = head;
			while(current!=null){
				if(current.val==val){
					pre.next=current.next;
				}
				else{
					pre=current;
				}
				current=current.next;
			}
			return head;
		}

	}
}