package com.main;

import com.exeptions.EmptyLinkedListException;
import com.exeptions.NodeNotFoundException;
import com.main.LinkedList.Node;

public class DoublyLinkedList {

	static class Node{
		int val;
		Node next;
		Node prev;
		
		Node(int val){
			this.val=val;
		}
	}
	
	static Node head=null;
	static Node tail=null;
	
	public static void addNode(int data) {
		Node newNode =new Node(data);
		
		if(head==null) {
			head=tail=newNode;
			
			head.prev=null;
			tail.next=null;
		}
		else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
			tail.next=null;
		}
		
	}
	public static void display() throws EmptyLinkedListException {
		Node tmp = head;
		if(head==null) {
			throw new EmptyLinkedListException("Linked List is Empty");
		}
		while(tmp!=null) {
			System.out.print(tmp.val+" ");
			tmp=tmp.next;
		}
	}
		
	public static boolean isEmpty() {
		return head == null;
	}

	public static int size() {
		int count = 0;
		Node tmp = head;
		if (isEmpty()) {
			return 0;
		}

		while (tmp != null) {
			++count;
			tmp = tmp.next;
		}

		return count;
	}

	public static void delete(int n) throws EmptyLinkedListException, NodeNotFoundException {
		Node tmp = head;
		if (isEmpty()) {
			throw new EmptyLinkedListException("Linked List is Empty");
		}
		
		if(tmp.next==null && tmp.val==n) {
			head=null;
		}
		
		boolean flag = false;
		while (tmp.next.val != n && tmp!=null) {
				tmp = tmp.next;
			
		}
		if(tmp==null) {
			throw new NodeNotFoundException("Node not found in Linked list");			
		}
		
		if(tmp.next.next==null) {
			tmp.next=null;
		}
		
		
		if (!flag) {
			throw new NodeNotFoundException("Node not found in Linked list");
		} else {
			System.out.println("Node deleted!!");
		}
	}

	
}
