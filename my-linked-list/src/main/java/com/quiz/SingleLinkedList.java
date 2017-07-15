package com.quiz;

public class SingleLinkedList {
	private long size;
	NodeLinkedList head;
	
	public SingleLinkedList(){
		size = 0;
		head = null;
	}
	
	public void insertNodeToHeadSLinkedList(String value){
		NodeLinkedList newNode = new NodeLinkedList(value, null);
		if(size == 0){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;			
		}
		size = size + 1;
	}
	
	public void insertNodeToTailSLinkedList(String value){
		NodeLinkedList newNode = new NodeLinkedList(value, null);
		if(size == 0){
			head = newNode;
		}else{
			NodeLinkedList current = head;
			while(current!=null && current.next !=null){
				current = current.next;
			}
			current.next = newNode;			
		}
		size = size +1;

	}
	
	public void insertNodeToPositionSlinkedList(String value, int position){
		NodeLinkedList newNode = new NodeLinkedList(value, null);
		if(size == 0){
			head = newNode;
		}else{
			if(position == 0){
				newNode.next  = head;
				head = newNode;
			}else{
				NodeLinkedList current = head;
				NodeLinkedList beforeNode = null;
				int tmp = 0;
				while(current!=null && current.next !=null){
					beforeNode = current;
					current = current.next;
					tmp = tmp + 1 ;
					if(tmp == position){						
						break;						
					}
				}
				beforeNode.next = newNode;
				newNode.next = current;
				
			}
		}
		size = size +1;
	}
	
	public void removeNodeByPositionSlinkedList(int position){
		if(size != 0){
			NodeLinkedList current = head;
			NodeLinkedList beforeNode = null;
			int tmp = 0;
			if(position == 0){
				head =  current.next;
			}else{
				while(current!=null && current.next !=null){
					beforeNode = current;
					current = current.next;
					tmp = tmp + 1 ;
					if(tmp == position){						
						beforeNode.next = current.next ;
					}
				}
			}
		}
	}
	
	public void printSLinkedList(NodeLinkedList nodeHead){
		if(size == 0){
			System.out.println("mang trong");			
		}
		
		if(nodeHead!=null){
			System.out.println(nodeHead.element);
			nodeHead = nodeHead.next;
			printSLinkedList(nodeHead);
		}
	}
	
	public void reverseSLinkedList(NodeLinkedList nodeHead){
////		List<NodeLinkedList> list = new ArrayList<NodeLinkedList>();
////		NodeLinkedList current = head;
////		while(current!=null){
////			list.add(current);
////			current = current.next;
////		}		
////		for(int i = list.size()-1 ; i>=0; i--){
////			System.out.println(list.get(i).element);
////		}
//		
//		if(nodeHead!=null){			
//			printSLinkedList(nodeHead.next);
//			System.out.println(nodeHead.element);
//		}
	}
	
}
