package com.nagarro.dsa;

import java.util.Iterator;

import com.nagarro.dsa.LinkedListFunctions.LinkedList;
import com.nagarro.dsa.LinkedListFunctions.Node;
import com.nagarro.exceptions.EmptyList;

public class Queue<T> implements Iterable<T> {
	LinkedList<T> list;

	public boolean isEmpty() {
		if (list == null) {
			throw new EmptyList("Queue is Empty");
		} else {
			return false;
		}
	}

	public void enqueue(T data) {
		if (list == null) {
			list = new LinkedList<>();
			list.addLast(data);

			return;
		}
		list.addLast(data);

	}

	public T dequeue() {
		if (list == null) {
			throw new EmptyList("Queue is Empty : Queue UnderFlow");
		} else {
			T popped = list.head.data;
			list.removeFirst();
			return popped;
		}

	}

	public T peek() {
		if (list == null) {
			throw new EmptyList("Queue is Empty : Queue UnderFlow");
		} else {
			T popped = list.head.data;
			return popped;
		}
	}

	public void display() {
		if (list == null) {
			throw new EmptyList("Queue is Empty : Queue UnderFlow");

		} else {
			list.display();
		}
	}

	public int size() {
		return list.size;
	}

	public boolean contains(T value) {

		if (list == null) {
			return false;
		} else {
			Node temp = list.head;
			while (temp != null) {
				if (temp.data == value) {
					return true;
				}
				temp = temp.next;
			}
			return false;
		}

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
			throw new EmptyList("Queue is Empty : Empty Queue cannot be reversed");
		}

	}

	public Iterator<T> iterator() {
		Iterator<T> i = new QueueIteratorLinkedList<>(list);
		return i;
	}

}
