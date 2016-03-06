package com.datastructures;

public class SinglyLinkedList {

	private int size;
	private Node head;
	private Node tail;
	
	public SinglyLinkedList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void addFirst(Object data) {
		Node node = new Node(data,null);
		if(head == null){
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head = node;
		}
		size++;
	}
	
	public void addLast(Object data) {
		Node node = new Node(data,null);
		if(head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;
	}
	
	public void addAt(Object data, int position) {
		
	}
	
	public void removeFirst() {
		if(head != null){
			head = head.getNext();
			if(head==null){
				tail = null;
			}
			size--;
		}
	}
	
	public void removeLast() {
		if(tail == head){
			tail = null;
			head = null;
			size = 0;
		}
		if(tail != null){
			Node temp = head;
			Node prev = null;
			while(temp.getNext() != null){
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(null);
			tail = prev;
			size--;
		}
	}
	
	public void remove(Object data) {
		if(head==null){
			System.out.println("Cannot remove. List is empty");
		} else if(head.getData().equals(data)){
			head = head.getNext();
			if(head==null){
				tail = null;
			}
			size--;
		} else {
			Node temp = head;
			Node prev = null;
			while(temp!=null){
				if (temp.getData().equals(data)){
					prev.setNext(temp.getNext());
					size--;
					break;
				}
				prev = temp;
				temp = temp.getNext();
			}
		}
	}

	public void removeAt(int position) {
		
	}
	
	public void print() {
		StringBuilder output = new StringBuilder();
		Node current = head;
		if(current == null) {
			output.append("***List is empty***");
		} else {
			while (current != null) {
				output.append("[" + current.getData().toString() + "]");
				current = current.getNext();
			}
		}
		System.out.println(output);
	}
	public String toString() {
		StringBuilder output = new StringBuilder();
		Node current = head;
		while (current != null) {
			output.append("[" + current.getData().toString() + "]");
			current = current.getNext();
		}
		return output.toString();
	}
	
	public int getSize() {
		return size;
	}
}

class Node {
	private Object data;
	private Node next;
	
	public Node(){
		this.data = null;
		this.next = null;
	}
	
	public Node(Object data,Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}