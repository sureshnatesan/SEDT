package mandatoryHomeWork.DSA.week16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
	
	

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

	public static void main(String[] args) {

		List<String> list = new ArrayList();

		list.add("hellow");
	}

}
