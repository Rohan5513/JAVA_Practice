package com.tester;

import java.util.LinkedList;
import java.util.Scanner;

import com.exeptions.InvalidChoiceException;
import com.main.DoublyLinkedList;
import com.utils.LinkedListOperations;

public class Tester {

	public static void main(String[] args) {
			boolean flag=true;
			
			try(Scanner sc = new Scanner(System.in)) {
				LinkedListOperations.takeCountInput(sc);
					while(flag) {
						try {
						LinkedListOperations.showOptions();
						switch (sc.nextInt()) {
						case 1:
							DoublyLinkedList.display();
							break;
						case 2:
							LinkedListOperations.takeElementsInput(sc);
							LinkedListOperations.setOnce(false);
							break;
						case 3:
							System.out.println("Size of linked list is:"+DoublyLinkedList.size());
							break;
						case 4:
							if(DoublyLinkedList.isEmpty()) {
								System.out.println("Linked List is Empty");
							}
							else {
								System.out.println("Linked List is not Empty");
							}
							break;
						case 5:
							System.out.println("Enter the node you want to delete");
							DoublyLinkedList.delete(sc.nextInt());
							break;
						case 6:
							flag=false;
							break;
						default:
							throw new InvalidChoiceException("Invalid Choice!!!");
						}
						}
							catch(Exception e) {
								System.out.println(e.getMessage());
							}
					}
			}
	}
}
