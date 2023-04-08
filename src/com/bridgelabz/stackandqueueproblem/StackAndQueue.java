package com.bridgelabz.stackandqueueproblem;

import java.util.*;

class Queue {
	private LinkedList linkedlist = new LinkedList();

	public void enqueu(Object obj) {

		linkedlist.addLast(obj);
	}

	public Object dequeue()
	{	
		return linkedlist.remove();
	}
	
	public boolean isEmpty()
	{
		return linkedlist.isEmpty();
	}
	public String toString() {
		return "" + linkedlist;

	}
}

public class StackAndQueue {

	public static void main(String[] args) {

		Queue queue = new Queue();

		queue.enqueu(56);
		queue.enqueu(30);
		queue.enqueu(70);

		System.out.println(queue);
		
		while(!queue.isEmpty())
		{
			queue.dequeue();
		}
		System.out.println("Queue is empty : "+queue);
 
	}
}
