package com.nagarro.dsa;

import java.util.ArrayList;
import java.util.Iterator;

public class PriorityQueueIterator implements Iterator<Integer> {
	PriorityQueue pq = new PriorityQueue();

	public PriorityQueueIterator(ArrayList<Integer> data) {
		for (int i : data) {
			pq.data.add(i);
		}

		System.out.println("------" + pq.peek());
	}

	@Override
	public boolean hasNext() {
		if (pq.data.size() != 0)
			return true;
		return false;
	}

	@Override
	public Integer next() {
		int data = pq.peek();
		pq.remove();
		return data;
	}

}
