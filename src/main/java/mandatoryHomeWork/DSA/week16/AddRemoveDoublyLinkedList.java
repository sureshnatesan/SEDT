package mandatoryHomeWork.DSA.week16;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import mandatoryHomeWork.DSA.week15.ListNode;

public class AddRemoveDoublyLinkedList {

	DoublyLinkedList head;
	DoublyLinkedList tail;
	


	public void add1(int a) {
		DoublyLinkedList newnode= new DoublyLinkedList(a);
		if(head==null) {
			head=tail=newnode;
		}
		else {
			newnode.prev=tail;
			tail.next=newnode;
			tail=tail.next;
		}
		System.out.println(tail.val);
	}


	public void reverseNode(){
		while(tail!=null) {
			System.out.println(tail.val);
			tail=tail.prev;
		}
	}
	
	public void removeFirst(){
		DoublyLinkedList removehead=head;
		if(removehead.prev==null) {
			removehead=removehead.next;
		}
		while(removehead!=null) {
			System.out.println(removehead.val);
			removehead=removehead.next;
		}
	}
	public static void main(String[] args) {
		AddRemoveDoublyLinkedList d= new AddRemoveDoublyLinkedList();
		int[] a= {1,2,3,4,5};
		for (int i = 0; i < a.length; i++) {
			d.add1(a[i]);
		}
		System.out.println("hellow");
		d.reverseNode();
		
		System.out.println("****************");
		d.removeFirst();
	}

}
