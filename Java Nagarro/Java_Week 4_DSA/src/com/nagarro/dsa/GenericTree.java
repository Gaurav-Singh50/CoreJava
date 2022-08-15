package com.nagarro.dsa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class GenericTree implements Iterable<Integer> {
	private TreeNode root;

	public void add(int data, Integer par) {
		if (par == null) {
			root = new TreeNode(data);
		} else {
			TreeNode node = search(par);
			TreeNode newNode = new TreeNode(data);
			node.children.add(newNode);
		}
	}

	public void delete(int data) {
		if (data == root.data) {
			ArrayList<TreeNode> child = root.children;
			root = child.get(0);
			child.remove(0);
			root.children.addAll(child);
		} else {
			parent = null;
			parent = getParent(data);
			for (int i = 0; i < parent.children.size(); i++) {
				if (parent.children.get(i).data == data) {
					ArrayList<TreeNode> deleted = parent.children.get(i).children;
					parent.children.remove(i);
					parent.children.addAll(i, deleted);
				}
			}

		}
	}

	public boolean contains(int data) {
		parent = null;
		return contains(data, root);
	}

	private boolean contains(int data, TreeNode node) {
		if (node != null && node.data == data)
			return true;

		for (TreeNode child : node.children) {
			boolean searched = contains(data, child);
			return searched;
		}
		return false;
	}

	public ArrayList<Integer> getElementsByLevel(int level) {
		ArrayList<Integer> res = new ArrayList<>();
		if (level == 1) {
			res.add(root.data);
			return res;
		}
		ArrayDeque<TreeNode> q = new ArrayDeque<>();
		q.add(root);
		int lev = 1;
		while (q.size() != 0) {
			int size = q.size();

			if (lev == level) {
				for (int i = 0; i < size; i++) {
					res.add(q.getFirst().data);
					q.removeFirst();
				}
			} else {
				for (int i = 0; i < size; i++) {
					TreeNode node = q.remove();
					q.addAll(node.children);
				}
				lev++;
			}
		}
		return res;
	}

	public void getElementsByValue(int data) {
		System.out.println(data + " is present at level " + getLevel(data) + "\nIts children are -");
		TreeNode node = search(data);
		for (TreeNode child : node.children) {
			System.out.print(child.data + " ");
		}
		System.out.println();

	}

	public void display() {
		display(this.root);
	}

	private void display(TreeNode node) {

		String str = node.data + " => ";

		for (TreeNode child : node.children) {
			str += child.data + " ";
		}
//        str +=".";
		System.out.println(str);

		for (TreeNode child : node.children) {
			display(child);
		}
	}

	public void displaydfs() {
		displaydfs(this.root);
		System.out.println();
	}

	private void displaydfs(TreeNode node) {
		System.out.print(node.data + " ");

		for (TreeNode child : node.children) {
			displaydfs(child);
		}
	}

	public void displaybfs() {
		displaybfs(this.root);
		System.out.println();
	}

	private void displaybfs(TreeNode node) {
		ArrayDeque<TreeNode> q = new ArrayDeque<>();
		q.add(root);
		int lev = 1;
		while (q.size() != 0) {
			int size = q.size();

			for (int i = 0; i < size; i++) {

				node = q.remove();
				System.out.print(node.data + " ");
				q.addAll(node.children);
			}

		}

	}

	TreeNode parent;

	private int getLevel(int data) {
		ArrayDeque<TreeNode> q = new ArrayDeque<>();
		q.add(root);
		int lev = 1;
		while (q.size() != 0) {
			int size = q.size();

			for (int i = 0; i < size; i++) {
				TreeNode node = q.remove();
				if (node.data == data)
					return lev;
				q.addAll(node.children);
			}
			lev++;

		}
		return -1;
	}

	public TreeNode getParent(int data) {
		getParent(data, root);
		return parent;
	}

	private boolean getParent(int data, TreeNode node) {

		if (node.data == data)
			return true;

		for (TreeNode child : node.children) {
			boolean searched = getParent(data, child);
			if (searched == true && parent == null) {
				parent = node;
				return true;
			}
		}

		return false;
	}

	public TreeNode search(int data) {
		TreeNode node = search(data, root);
		return node;
	}

	private TreeNode search(int data, TreeNode node) {

		if (node.data == data)
			return node;

		for (TreeNode child : node.children) {
			TreeNode searched = search(data, child);
			if (searched != null)
				return searched;
		}

		return null;
	}

	public class TreeNode {
		public int data;
		ArrayList<TreeNode> children;

		public TreeNode(int data) {
			this.data = data;
			children = new ArrayList<>();
		}
	}

	String itr = "dfs";

	public void setIterator(String itr) {
		this.itr = itr;
	}

	@Override
	public Iterator<Integer> iterator() {
		if (itr == "bfs") {
			Iterator<Integer> ob = new BFSIterator(root);
			return ob;
		} else {
			Iterator<Integer> ob = new DFSIterator(root);
			return ob;
		}

	}
}
