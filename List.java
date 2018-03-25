package com.sanks.util;

public interface List<T> {

	public boolean isEmpty();

	public void add(T data);

	public Node<T> getFirst();

	public Node<T> getLast();

	public void printList();
	
	public Node<T> get(int i);
	
	public int getCount();
	
	public int getIndex(T nodeObj);

}
