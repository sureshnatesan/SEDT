package mandatoryHomeWork.DSA.week15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoLinkedLists {


	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode a=headA;
			ListNode b=headB;
			List<ListNode> list1= new ArrayList<>();
			List<ListNode> list2= new ArrayList<>();
			
			while(a!=null) {
				list1.add(a);
				a=a.next;
			}
			while(b!=null) {
				list2.add(b);
				b=b.next;
			}
			
			
			for (int i = 0; i < list1.size(); i++) {
				for (int j = 0; j < list2.size(); j++) {
					if(list1.get(i)==list2.get(j)) {
						return list1.get(i);
					}
				}
			}
		return null;
		}
		
		public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
			ListNode a=headA;
			ListNode b=headB;
			Set<ListNode> set1= new HashSet<>();
			while(a!=null) {
				set1.add(a);
				a=a.next;
			}
			while(b!=null) {
				if(!set1.contains(b)) {
					set1.add(b);	
					b=b.next;
				}
				else {
					return b;
				}
			}
			return null;
		}
	}

}
