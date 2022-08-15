package com.nagarro.dsa;

import java.util.ArrayList;
import java.util.Iterator;

import com.nagarro.exceptions.EmptyList;

public class PriorityQueue implements Iterable<Integer> {

	ArrayList<Integer> data;

	public PriorityQueue() {
		data = new ArrayList<>();

	}

	public void add(int value) {
		data.add(value);
		upheapify(data.size() - 1);

	}

	public void upheapify(int i) {
		if (i == 0) {
			return;
		}
		int pi = (i - 1) / 2;
		if (data.get(i) < data.get(pi)) {
			swap(i, pi);
			upheapify(pi);
		}
	}

	public void swap(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);

	}

	public int remove() {
		if (this.size() == 0) {
			throw new EmptyList("Queue Underflow :Queue is Empty");
		}
		swap(0, data.size() - 1);
		int val = data.remove(data.size() - 1);
		downheapify(0);
		return val;

	}

	public void downheapify(int pi) {
		int mini = pi;
		int li = 2 * pi + 1;
		if (li < data.size() && data.get(li) < data.get(mini)) {
			mini = li;
		}
		int ri = 2 * pi + 2;
		if (ri < data.size() && data.get(ri) < data.get(mini)) {
			mini = ri;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);

		}

	}

	public int peek() {
		if (this.size() == 0) {
			throw new EmptyList("Queue Underflow :Queue is Empty");
		}
		return data.get(0);

	}

	public int size() {
		return data.size();

	}

	public void display() {
		if (data == null) {
			throw new EmptyList("Priority Queue is Empty : Nothing to Display");
		}
		PriorityQueue pq = new PriorityQueue();
		pq.data = data;
		for (int val : pq) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public ArrayList<Integer> reverseArrayList() {

		ArrayList<Integer> revArrayList = new ArrayList<Integer>();
		for (int i = 0; i < data.size(); i++) {
			revArrayList.add(data.get(data.size() - 1 - i));
		}
		data = revArrayList;
		return data;

	}

	public boolean contains(int value) {
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i) == value) {
				return true;
			}

		}
		return false;

	}

	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> obj = new PriorityQueueIterator(data);
		return obj;
	}

}
