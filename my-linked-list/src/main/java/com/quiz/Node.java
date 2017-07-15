package com.quiz;

public class Node {
	int value;
	Node next;
	Node prev;

	public Node(Node prev, int value, Node next) {
		this.prev = prev;
		this.value = value;
		this.next = next;
	}
	
	
}
