package com.bridgelabz.stackandqueueproblem;

import java.util.*;

class Stack {
	private LinkedList linkedlist = new LinkedList();

	public void push(Object obj) {

		linkedlist.addFirst(obj);
	}

	public Object top() {
		return linkedlist.getFirst();
	}

	public Object pop() {
		return linkedlist.removeFirst();
	}

	public String toString() {
		return "" + linkedlist;

	}
}

public class StackAndQueue {

	public static void main(String[] args) {

		// StackAndQueueProblem stackAndQueueProblem = new StackAndQueueProblem();
		Stack stack = new Stack();

		stack.push(70);
		stack.push(30);
		stack.push(56);

		System.out.println(stack);

	}

}
