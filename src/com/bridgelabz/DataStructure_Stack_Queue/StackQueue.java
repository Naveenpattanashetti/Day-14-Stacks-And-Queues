package com.bridgelabz.DataStructure_Stack_Queue;

public class StackQueue {
	Node head;
	Node tail;
	Node top;

	public Node push(int data) {
		Node newnode = new Node(data);

		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			Node tempNode = head;
			this.head = newnode;
			newnode.next = tempNode;
		}
		top = head;
		return newnode;
	}

	public void display() {
		if (head == null) {
			System.out.println("Linked list is Empty");
			return;
		} else {
			System.out.print("\n The stack elements are ");
			Node tempNode = head;
			while (tempNode != null) {
				if (tempNode.next != null) {
					System.out.print(tempNode.data + " -> ");
					tempNode = tempNode.next;
				} else {
					System.out.print(tempNode.data);
					tempNode = tempNode.next;
				}
			}
		}

	}

	public void queue(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
			top = head;
		} else {
			Node tempNode = tail;
			this.tail = newnode;
			tempNode.next = tail;
		}
	}

	public int peek() {
		System.out.println("\nTop element is " + this.top.data);
		return top.data;
	}
}
