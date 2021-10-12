package com.bridgelabz.DataStructure_Stack_Queue;

public class Operation {
	public static StackQueue addElement() {
		StackQueue stacklist = new StackQueue();
		stacklist.push(70);
		stacklist.push(30);
		stacklist.push(56);

		stacklist.display();
		return stacklist;

	}

	public static void peek() {
		StackQueue stacklist = new StackQueue();
		stacklist.push(70);
		stacklist.push(30);
		stacklist.push(56);
		peek();
	}

	public static void pop() {
		System.out.println("Before Pop:");
		StackQueue stacklist = addElement();
		pop();
		System.out.println("After Pop:");
		stacklist.display();
	}
}
