package com.quiz;

public class Main {

	public static void main(String[] args) {
//		MyList list = new MyLinkedList();
//		list.add(6);
//		list.add(3);
//		list.add(5);
//		list.add(4);
//		list.add(7);
//		list.add(9);
//		System.out.println(list.toString());
//
//		list.removeLast();
//		System.out.println("After remove last:" + list.toString());
//
//		list.removeGreater(4);
//		System.out.println("After remove all items greater than 4 :" + list.toString());
		
		SingleLinkedList linkedList = new SingleLinkedList();
     	linkedList.insertNodeToTailSLinkedList("nam");
     	linkedList.insertNodeToTailSLinkedList("c");
     	linkedList.insertNodeToTailSLinkedList("d");
     	linkedList.insertNodeToHeadSLinkedList("a");
     	linkedList.insertNodeToPositionSlinkedList("test",1);
     	linkedList.removeNodeByPositionSlinkedList(1);
		if(linkedList.head != null){
			linkedList.printSLinkedList(linkedList.head);
			System.out.println("///reverse");
//			linkedList.reverseSLinkedList(linkedList.head);
		}
     	

	}

}
