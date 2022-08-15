package com.nagarro.dsa;

import java.util.Iterator;

import com.nagarro.dsa.LinkedListFunctions.LinkedList;
import com.nagarro.dsa.LinkedListFunctions.Node;
import com.nagarro.exceptions.EmptyList;

public class StackAsLinkedList<T> implements Iterable<T> {

	LinkedList<T> list;

	public boolean isEmpty() {
		if (list == null) {
			throw new EmptyList("Stack is Empty");
		} else {
			return false;
		}
	}

	public void push(T data) {

		if (list == null) {
			list = new LinkedList();
			list.addFirst(data);
			System.out.println("Pushed " + data);
			return;
		}
		list.addFirst(data);
		System.out.println("Pushed " + data);

	}

	public T pop() {
		if (list == null) {
			throw new EmptyList("List is Empty : Nothing to remove - Stack Underflow");

		} else {
			T popped = list.head.data;
			list.removeFirst();
			return popped;
		}

	}

	public T peek() {
		if (list == null) {
			throw new EmptyList("List is Empty : No Top Element available - Stack Underflow");
		} else {
			T popped = list.head.data;
			return popped;
		}
	}

	public void display() {
		if (list == null) {
			throw new EmptyList("Stack is Empty : No element to display");

		} else {

			Node temp = list.head;
			while (temp.next != null) {

				System.out.print(temp.data + "->");

				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	public int size() {
		return list.size;
	}

	public boolean contains(T value) {

		if (list == null) {
			return false;
		} else {
			Node<T> temp = list.head;
			while (temp != null) {
				if (temp.data == value) {
					return true;
				}
				temp = temp.next;
			}
			return false;
		}

	}

	@Override
	public Iterator<T> iterator() {
		Iterator<T> i = new StackIteratorLinkedList<>(list);
		return i;
	}

	public void reverse() {

		if (list != null) {
			LinkedList<T> tempList = new LinkedList<>();
			while (list.head != null) {
				tempList.addLast(list.head.data);
				list.removeFirst();

			}
			while (tempList.head != null) {
				list.addFirst(tempList.head.data);
				tempList.removeFirst();
			}
		} else {
			throw new EmptyList("Stack is Empty : No element to reverse");
		}

	}

}
