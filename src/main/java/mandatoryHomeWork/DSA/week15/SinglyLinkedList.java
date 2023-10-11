package mandatoryHomeWork.DSA.week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedList {

	int data;
	SinglyLinkedList next;
	SinglyLinkedList head = null;  
	SinglyLinkedList tail = null;  

	public SinglyLinkedList(int data) {
		this.data = data;  
		this.next = null;  
	}

	public  SinglyLinkedList adddata(int data) {  
		List<Integer> list = new LinkedList<>();
	//	list.removeAll(list)
		if(head== null) {  
			head = new SinglyLinkedList(data);  
			tail = head;  
		}  
		else {  
			tail.next = new SinglyLinkedList(data);  
			tail = tail.next;  
		}  
		return head;
		//System.out.println(tail.data);
	}

	public void addAll(List<Integer> asList) {
		for(Integer a:asList) {
			 adddata(a);
			 System.out.println(tail.data);
		}
		
	}
	public static void main(String[] args) {
		int[] a= {11,45,24,78};

		SinglyLinkedList sd=new SinglyLinkedList(11);
		for (int i = 0; i < a.length; i++) {
			sd.adddata(a[i]);

		}

	
	}

}
