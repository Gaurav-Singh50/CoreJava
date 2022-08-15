package com.nagarro.dsa;

import java.util.*;
import java.util.Iterator;

import com.nagarro.dsa.LinkedListFunctions.LinkedList;
import com.nagarro.dsa.LinkedListFunctions.Node;
import com.nagarro.exceptions.EmptyList;
import com.nagarro.exceptions.IndexOutOfBound;

import java.io.*;

public class LinkedListFunctions {
	public static class Node<T> {
		public T data;
		public Node<T> next;

	}

	public static class LinkedList<T> implements Iterable<T> {
		public Node<T> head;
		Node<T> tail;
		int size;

		public void removeFirst() {

			if (size == 0) {
				head = null;
				throw new EmptyList("List is empty : Nothing to remove");

			} else if (size == 1) {
				head = tail = null;
				size--;

			} else {

				Node<T> prev = head;
				head = head.next;
				prev = null;
				size--;

			}

		}

		public void removeLast() {

			if (size == 0) {
				head = null;
				throw new EmptyList("List is empty : Nothing to remove");
			} else if (size == 1) {
				head = tail = null;
				size = 0;

			} else {
				Node<T> temp = head;
				for (int i = 0; i < size - 2; i++) {
					temp = temp.next;
				}
				Node<T> prev = tail;
				tail = temp;
				tail.next = null;
				prev = null;
				size--;

			}

		}

		public void deleteAt(LinkedList l, int index) {
			if (size == 0) {
				throw new EmptyList("List is empty : Nothing to remove");
			} else if (index < 0 || index >= size) {
				throw new IndexOutOfBound("Enter valid index,range out of Bound");
			} else if (index == 0) {
				l.removeFirst();

			} else if (index == size - 1) {

				l.removeLast();

			} else {

				Node<T> temp = head;
				for (int i = 0; i < index - 1; i++) {
					temp = temp.next;
				}
				Node<T> prev = temp.next;
				temp.next = temp.next.next;
				prev = null;
				size--;

			}

		}

		public void display() {
			for (Node<T> temp = head; temp != null; temp = temp.next) {
				System.out.print(temp.data + " ");
			}
			System.out.println();
		}

		public T center() {

			Node<T> slow, fast;

			if (head == null && tail == null) {
				throw new EmptyList("Center can not be found for Empty List");
			}

			slow = head;
			fast = head;

			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow.data;

		}

		public void reverse() {

			if (head == null && tail == null) {
				throw new EmptyList("Empty List cannot be reversed");
			} else {
				Node<T> prev = null;
				Node<T> curr = head;

				while (curr != null) {
					Node<T> next = curr.next;

					curr.next = prev;

					prev = curr;
					curr = next;
				}
				Node<T> temp = head;
				head = tail;
				tail = temp;

			}

		}

		public void addFirst(T val) {
			Node<T> temp = new Node();
			temp.data = val;
			temp.next = head;
			head = temp;
			if (size == 0) {
				tail = temp;
			}
			size++;
		}

		public void addLast(T val) {
			Node<T> temp = new Node();
			temp.data = val;
			temp.next = null;
			if (size == 0) {
				head = tail = temp;
			} else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}

		public Node<T> gethead() {
			return this.head;
		}

		public int getSize() {
			return this.size;
		}

		public void insertAt(LinkedList l, int index, T value) {

			size = l.getSize();
			if (index < 0 || index > size) {
				throw new IndexOutOfBoundsException("Enter valid index,range out of Bound");
			} else if (index == 0) {
				l.addFirst(value);
			} else if (index == size) {
				l.addLast(value);
			} else {
				Node<T> n = new Node();
				n.data = value;

				Node<T> temp = l.gethead();
				for (int i = 0; i < index - 1; i++) {
					temp = temp.next;
				}

				n.next = temp.next;
				temp.next = n;

				size++;

			}

		}

		public Iterator<T> iterator() {

			Iterator<T> obj = new IteratorLinkedList<T>(head);
			return obj;
		}

	}
}