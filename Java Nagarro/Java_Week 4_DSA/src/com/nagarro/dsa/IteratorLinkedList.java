package com.nagarro.dsa;

import java.util.Iterator;

import com.nagarro.dsa.LinkedListFunctions.Node;

public class IteratorLinkedList<T> implements Iterator<T> {
	Node<T> nval;

	public IteratorLinkedList(Node<T> head) {

		nval = head;
	}

	@Override
	public boolean hasNext() {
		if (nval == null) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public T next() {

		T fc = nval.data;
		nval = nval.next;
		return fc;
	}

}
