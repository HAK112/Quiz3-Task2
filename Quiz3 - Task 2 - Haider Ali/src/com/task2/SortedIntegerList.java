package com.task2;

public class SortedIntegerList {
	
	private Node first = null;
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public int size() {
		Node curr = first;
		int n = 0;
		while (curr != null) { 
			n++;
			curr = curr.next;
		}
		return n;
	}
	
	public Integer getFirst() {
		if (first == null)
			return null;
		else
			return first.data;
	} 
	
	public Integer getLast() {
		Node curr = first;
		Node foll = first;
		while (foll != null) {
			curr = foll;
			foll = foll.next;
		}
		if (curr != null)
			return curr.data;
		else
			return null;
	}
	
	public Integer get(int index) {
		Node curr = first;
		int i = 0;
		while (curr != null && i < index) {
			curr = curr.next;
			i++;
		}
		if (curr != null && i == index)
			return curr.data;
		else
			throw new IllegalArgumentException("incorrect index " + index);
	}
	
	public void insert(Integer data) {
		Node curr, foll;
		if ((first == null) || (data <= first.data))
			first = new Node(data, first); // Insert at the beginning
		else {
			curr = first;
			foll = first.next;
			while ((foll != null) && (foll.data < data)) {
				curr = foll; 
				foll = foll.next;
			}
			curr.next = new Node(data, foll);
		}
	}
	
	class Node {
		Integer data;
		Node next;
		public Node(Integer data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}