package com.nagarro.dsa;

import java.util.Iterator;

import com.nagarro.dsa.LinkedListFunctions.LinkedList;
import com.nagarro.dsa.LinkedListFunctions.Node;

public class StackIteratorLinkedList<T> implements Iterator<T> {
	LinkedList<T> list;
	Node<T> top;

	public StackIteratorLinkedList(LinkedList<T> l) {
		list = l;
		top = l.head;

	}

	@Override
	public boolean hasNext() {
		if (top == null) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public T next() {
		T g;
		g = top.data;
		top = top.next;

		return g;
	}

}
