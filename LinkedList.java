package com.sanks.util;

public class LinkedList<T> implements List<T> {
	private Node<T> head;

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}

	}

	public void add(T data) {
		if (head == null) {
			Node<T> newNode = new Node<T>();
			newNode.data = data;
			newNode.nextNodeAddress = head;
			head = newNode;
		} else {
			Node<T> current = head;
			while (current.nextNodeAddress != null) {
				current = current.nextNodeAddress;
			}
			Node<T> newNode = new Node<T>();
			newNode.data = data;
			current.nextNodeAddress = newNode;
		}

	}

	public Node<T> getFirst() {
		Node<T> firstNode = new Node<T>();
		firstNode = head;
		return firstNode;
	}

	public Node<T> getLast() {
		Node<T> lastNode = new Node<T>();
		Node<T> current = head;
		while (current.nextNodeAddress != null) {
			current = current.nextNodeAddress;
		}
		lastNode = current;
		return lastNode;
	}

	public int getCount() {
		int count = 0;
		Node<T> temp = head;
		if(head == null)
		{
			return 0;
		}
		while (temp.nextNodeAddress != null) {
			count++;
			temp = temp.nextNodeAddress;
		}
		return count + 1;
	}

	public void printList() {
		System.out.println(this.getClass().getName() + "[");
		Node<T> temp = head;
		while (temp != null) {
			temp.printNode();
			temp = temp.nextNodeAddress;
		}
		System.out.println("]");
	}

	public Node<T> get(int i) {
		Node<T> temp = head;
		Node<T> NodeToFind = null;
		int count = 1;
		if(head == null)
		{
			return null;
		}
		while(temp.nextNodeAddress != null)
		{
			if(count == i)
			{
				NodeToFind = temp;
			}
			temp = temp.nextNodeAddress;
			count++;
		}
		return NodeToFind;
	}
	
	public int getIndex(T nodeObj) {
		Node<T> temp = head;
		int count = 0;
		if(head == null)
		{
			return 0;
		}
		while(temp.nextNodeAddress != null)
		{
			if(temp.getData() == nodeObj)
			{
				break;
			}
			temp = temp.nextNodeAddress;
			count++;
		}
		return count+1;
	}
}
