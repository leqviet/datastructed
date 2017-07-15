package com.quiz;

public class NodeLinkedList {

	String element;	
	NodeLinkedList next;
	
	public NodeLinkedList(String element,NodeLinkedList next){
		this.element = element;
		this.next = next;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public NodeLinkedList getNext() {
		return next;
	}

	public void setNext(NodeLinkedList next) {
		this.next = next;
	}	
}
