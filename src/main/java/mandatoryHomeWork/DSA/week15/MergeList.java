package mandatoryHomeWork.DSA.week15;

public class MergeList {

	/*
	 * 
	 * https://leetcode.com/problems/merge-two-sorted-lists/
	 */


	class Solution {
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode Merge = new ListNode();
			ListNode newlist=Merge;
			while(list1!=null&&list2!=null) {
				if(list1.val<list2.val) {
					newlist.next=list1;
					list1=list1.next;
					newlist	=newlist.next;
				}
				else {
					newlist.next=list2;
					list2=list2.next;
					newlist	=newlist.next;
				}
			}

			while(list1!=null) {
				newlist.next=list1;
				list1=list1.next;
				newlist	=newlist.next;
			}
			while (list2!=null) {
				newlist.next=list2;
				list2=list2.next;
				newlist	=newlist.next;
			}  	
			return Merge.next;
		}
	}
}
