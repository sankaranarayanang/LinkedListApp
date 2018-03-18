package com.sanks.util;

public class LinkedListDemo {

	public static void main(String[] args) {

		SinglyLinkedList<Employee> mylist = new SinglyLinkedList<Employee>();

		System.out.println("List is empty now : " + mylist.isEmpty());

		Employee e1 = new Employee();
		e1.setEmployeeID(1);
		e1.setEmployeeName("Adam Gilchrist");

		Employee e2 = new Employee();
		e2.setEmployeeID(2);
		e2.setEmployeeName("Brett Lee");

		Employee e3 = new Employee();
		e3.setEmployeeID(3);
		e3.setEmployeeName("Sachin Tendulkar");

		Employee e4 = new Employee();
		e4.setEmployeeID(4);
		e4.setEmployeeName("Rahul Dravid");

		Employee e5 = new Employee();
		e5.setEmployeeID(5);
		e5.setEmployeeName("Zaheer Khan");

		mylist.add(e1);
		mylist.add(e2);
		mylist.add(e3);
		mylist.add(e4);
		mylist.add(e5);

		System.out.println("List is empty now : " + mylist.isEmpty());

		Node<Employee> first = mylist.getFirst();

		System.out.println("Showing First Employee in list...");
		System.out.println("ID is " + first.data.getEmployeeID());
		System.out.println("Name is " + first.data.getEmployeeName());

		Node<Employee> last = mylist.getLast();

		System.out.println("Showing last Employee in list...");
		System.out.println("ID is " + last.data.getEmployeeID());
		System.out.println("Name is " + last.data.getEmployeeName());

		System.out.println("Count of list : " + mylist.getCount());

		mylist.printList();
	}
}
