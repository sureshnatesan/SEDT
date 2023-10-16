package mandatoryHomeWork.DSA.week16;

import mandatoryHomeWork.DSA.week15.ListNode;

public class DoublyLinkedList {
	DoublyLinkedList prev;
	DoublyLinkedList next;
	int val;
	DoublyLinkedList(){

	}
	

	DoublyLinkedList(int val){
		this.val=val;
		this.prev=null;
		this.next=null;
	}
}
