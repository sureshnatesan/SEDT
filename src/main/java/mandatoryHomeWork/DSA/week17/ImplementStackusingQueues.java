package mandatoryHomeWork.DSA.week17;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {

	/*
	 * https://leetcode.com/problems/implement-stack-using-queues/description/
	 */
	public Queue<Integer> q;

	public ImplementStackusingQueues() {
		q = new ArrayDeque<Integer>();
	}

	public void push(int x) {
		//((ArrayDeque<Integer>) q).addLast(x);
		((ArrayDeque<Integer>) q).addFirst(x);

	}

	public int pop() {
		return q.remove();
	}

	public int top() {
		return q.peek();
	}

	public boolean empty() {
		return q.isEmpty();
	}
}
