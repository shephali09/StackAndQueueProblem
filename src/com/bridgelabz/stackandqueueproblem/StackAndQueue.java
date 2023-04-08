package com.bridgelabz.stackandqueueproblem;

import java.util.*;

class Queue {
	private LinkedList linkedlist = new LinkedList();

	public void enqueue(Object obj) {

		linkedlist.addLast(obj);
	}

	public String toString() {
		return "" + linkedlist;

	}
}
public class StackAndQueue {

	public static void main(String[] args) {

		Queue queue = new Queue();

		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);

		System.out.println(queue);

	}
}
