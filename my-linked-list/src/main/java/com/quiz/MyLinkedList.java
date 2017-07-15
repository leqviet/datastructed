package com.quiz;

public class MyLinkedList implements MyList {

	int size;
	Node first;
	Node last;

	public void add(int value) {
		Node l = last;
		Node newNode = new Node(l, value, null);
		last = newNode;

		if (l == null) {
			// if the list is empty
			first = newNode;
		} else {
			l.next = newNode;
		}
		size++;
	}

	public void removeLast() {
		Node l = last;
		if (l != null) {

			// previous node become last node
			last = l.prev;
			last.next = null;

			if (last == null) {
				first = null;
			}

			l.prev = null;
			l.next = null;
			l = null;

			size--;
		}
	}

	public void removeGreater(int value) {
		for (Node x = first; x != null; x = x.next) {
			if (x.value > value) {

				Node next = x.next;
				Node prev = x.prev;

				if (prev == null) {
					first = next;
				} else {
					prev.next = next;
					x.prev = null;
				}

				if (next == null) {
					last = prev;
				} else {
					next.prev = prev;
				}

				size--;
			}
		}
	}

	public String toString() {
		String s = "[";
		for (Node x = first; x != null; x = x.next) {
			if (s.equals("[")) {
				s += x.value;
			} else {
				s += "," + x.value;
			}
		}
		s += "]";
		return s;
	}
}
