package mandatoryHomeWork.DSA.week17;

import mandatoryHomeWork.DSA.week16.DoublyLinkedList;

public class DesignCircularDeque {

	/*
	 * https://leetcode.com/problems/design-circular-deque/description/
	 */

	private int maxSize, currSize;
	private Node head, tail;
	private class Node {
        int value;
        Node next, prev;
        Node(int value) {
            this.value = value;
        }
}
	
	public DesignCircularDeque(int k) {
		this.maxSize = k;
		this.currSize = 0;
		head=tail=new Node(-1);
		head.next=tail;
		tail.prev=head;
	}

	public boolean insertFront(int value) {
		if(currSize<maxSize) {
			Node newNode = new Node(value);
			newNode.next=head;
			newNode.prev=tail;
			tail.next=newNode;
			head=newNode;
			currSize++;
			return true;
		}
		else {
			return false;
		}

	}

	public boolean insertLast(int value) {
		if(currSize<maxSize) {
			Node newNode = new Node(value);
			newNode.prev=tail;
			tail.next=newNode;
			newNode.next=head;
			tail=newNode;
			currSize++;
			return true;
		}
		else {
			return false;
		}
	}
/*
	public boolean deleteFront() {

	}

	public boolean deleteLast() {

	}

	public int getFront() {

	}

	public int getRear() {

	}

	public boolean isEmpty() {

	}

	public boolean isFull() {

	}*/
}
