package com.nagarro.dsa;

import java.util.Iterator;

import com.nagarro.dsa.GenericTree.TreeNode;

public class BFSIterator implements Iterator<Integer> {
	Integer val;
	Queue<IteratorPair> qu;

	public BFSIterator(TreeNode root) {
		qu = new Queue<>();
		qu.enqueue(new IteratorPair(root, -1));
		next();
	}

	@Override
	public boolean hasNext() {
		if (val != null)
			return true;
		return false;
	}

	@Override
	public Integer next() {
		Integer fr = val;
		// moves val forward, if not possible sets it to null
		val = null;
		while (qu.size() > 0) {
			IteratorPair top = qu.peek();
			if (top.state == -1) {
				val = top.node.data;
				top.state++;
				break;
			} else if (top.state >= 0 && top.state < top.node.children.size()) {
				IteratorPair cp = new IteratorPair(top.node.children.get(top.state), -1);
				qu.enqueue(cp);
				top.state++;

			} else {
				qu.dequeue();
			}
		}
		return fr;
	}

}
