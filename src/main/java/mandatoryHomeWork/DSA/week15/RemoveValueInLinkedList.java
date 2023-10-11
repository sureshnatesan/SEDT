package mandatoryHomeWork.DSA.week15;

import java.util.Iterator;

public class RemoveValueInLinkedList {

	RemoveValueInLinkedList head;
	RemoveValueInLinkedList tail;
	RemoveValueInLinkedList current;
	RemoveValueInLinkedList next;
	int val;
	int size=0;
	
	RemoveValueInLinkedList(){
		
		//this.next = next;
	}
	
	
	public void add(int value){
		if(head == null)  
			head = tail = new RemoveValueInLinkedList();
		else{
			tail.next = new RemoveValueInLinkedList();  // 11 -> 43
			tail = tail.next;
		}
		size++;
	}
	
	public void display1(RemoveValueInLinkedList head){
		while(head!=null) {
			head=head.next;
			System.out.println(head.val);
		}
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,6,3,4,5,6};
		RemoveValueInLinkedList obj= new RemoveValueInLinkedList();
		for (int i = 0; i < a.length; i++) {
			obj.add(a[i]);
		}
		obj.display1(obj);
	}
}
