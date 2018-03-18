package com.sanks.util;

public class Node<T> {

	T data;
	Node<T> nextNodeAddress;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void printNode() {
		System.out.println(data);
	}

}
