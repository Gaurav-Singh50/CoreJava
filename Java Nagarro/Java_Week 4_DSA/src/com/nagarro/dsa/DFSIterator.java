package com.nagarro.dsa;

import java.util.Iterator;
import java.util.Stack;

import com.nagarro.dsa.GenericTree.TreeNode;

public class DFSIterator implements Iterator<Integer> {
	Integer val;
	Stack<IteratorPair> st;

	public DFSIterator(TreeNode root) {
		st = new Stack<>();
		st.push(new IteratorPair(root, -1));
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
		val = null;
		while (st.size() > 0) {
			IteratorPair top = st.peek();
			if (top.state == -1) {
				val = top.node.data;
				top.state++;
				break;
			} else if (top.state >= 0 && top.state < top.node.children.size()) {
				IteratorPair cp = new IteratorPair(top.node.children.get(top.state), -1);
				st.push(cp);
				top.state++;

			} else {
				st.pop();
			}
		}
		return fr;
	}

}