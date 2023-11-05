package com.utils;

import java.util.Scanner;

import com.main.DoublyLinkedList;

public class LinkedListOperations {
	static int capacity;
	static boolean once=true;
	public static void showOptions() {
		System.out.println("Enter your choice");
		System.out.println("Press 1 show contents of Linked List");
		System.out.println("Press 2 to insert data in the Linked List");
		System.out.println("Press 3 to check number of elements in Linked List");
		System.out.println("Press 4 to see if Linked List is Empty");
		System.out.println("Press 5 to delete a node");
		System.out.println("Press 6 to exit");
	}

	public static void takeCountInput(Scanner sc) {
		System.out.println("Enter number of elements you want to add in Linked list");
		capacity=sc.nextInt();
		
	}

	public static void takeElementsInput(Scanner sc) {
		if(once) {
		System.out.println("Enter the elements");
		for(int i=1;i<=capacity;i++) {
			DoublyLinkedList.addNode(sc.nextInt());
		}
		System.out.println("Elements added");
		}
		else {
			System.out.println("enter the element");
			DoublyLinkedList.addNode(sc.nextInt());
		}
	}
	
	
	public static void setOnce(boolean once) {
		LinkedListOperations.once = once;
	}
	
	
}
