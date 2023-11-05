package com.main;

import com.exeptions.EmptyLinkedListException;
import com.exeptions.NodeNotFoundException;

public class LinkedList {

	static Node head;

	static class Node {
		int val;
		Node next;

		Node(int value) {
			this.val = value;
			this.next = null;
		}

	}

	public static void add(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = newNode;
		}
	}

	public static Node getHead() {
		return head;
	}

	public static void display() throws EmptyLinkedListException {
		if (isEmpty()) {
			throw new EmptyLinkedListException("Linked List is Empty");
		}

		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.val + "->");
			tmp = tmp.next;
		}
		System.out.print("null");
		System.out.println();
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
		while (tmp != null) {
			if (tmp.next.val == n) {
				flag=true;
				if(tmp.next.next==null) {
					tmp.next=null;
					break;
				}
				else {
				tmp.next=tmp.next.next;
				break;
				}
			} else {
				tmp = tmp.next;
			}
		}
		if (!flag) {
			throw new NodeNotFoundException("Node not found in Linked list");
		} else {
			System.out.println("Node deleted!!");
		}
	}

}
