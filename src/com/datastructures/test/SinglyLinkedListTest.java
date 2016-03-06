package com.datastructures.test;

import com.datastructures.SinglyLinkedList;

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addFirst("First");
		list.addFirst("TTT");
		list.removeLast();
		list.print();
		list.remove("First");
		list.print();
		list.addFirst("Second");
		list.addFirst("First");
		list.addLast("Three");
		list.print();
		/*		list.removeFirst();
		list.print();
		list.removeLast();
*/		list.remove("First");
		list.print();
	}
}
