package com.nagarro.dsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.nagarro.exceptions.EmptyList;

public class HashTableFunctions {
	public static class HashTable<K, V> {

		public class HTNode {
			K key;
			V value;

			HTNode(K key, V value) {
				this.key = key;
				this.value = value;
			}

			public String toString() {
				return this.key + "->" + this.value;
			}

		}

		int size;
		LinkedList<HTNode>[] buckets;

		public HashTable() {
			initbuckets(4);
			size = 0;
		}

		public void initbuckets(int N) {
			buckets = new LinkedList[N];
			for (int bi = 0; bi < buckets.length; bi++) {
				buckets[bi] = new LinkedList<>();
			}
		}

		public void put(K key, V value) throws Exception {
			int bi = hashfn(key);
			int di = getIndexWithinBucket(key, bi);
			if (di != -1) {
				HTNode node = buckets[bi].get(di);
				node.value = value;
			} else {
				HTNode node = new HTNode(key, value);
				buckets[bi].add(node);
				size++;
			}

			double lambda = size * 1.0 / buckets.length;
			if (lambda > 2.0) {
				rehash();
			}

		}

		public int hashfn(K key) {
			int hc = key.hashCode();
			return Math.abs(hc) % buckets.length;
		}

		public int getIndexWithinBucket(K key, int bi) {
			int di = 0;
			for (HTNode node : buckets[bi]) {
				if (node.key.equals(key)) {
					return di;
				}
				di++;
			}
			return -1;
		}

		public boolean containsKey(K key) {
			int bi = hashfn(key);
			int di = getIndexWithinBucket(key, bi);
			if (di != -1) {
				return true;
			} else {
				return false;
			}

		}

		public void rehash() throws Exception {
			LinkedList<HTNode>[] oldBucketArray = buckets;
			initbuckets(oldBucketArray.length * 2);
			size = 0;
			for (int i = 0; i < oldBucketArray.length; i++) {
				for (HTNode node : oldBucketArray[i]) {
					put(node.key, node.value);
				}
			}
		}

		public V get(K key) throws Exception {
			int bi = hashfn(key);
			int di = getIndexWithinBucket(key, bi);
			if (di != -1) {
				HTNode node = buckets[bi].get(di);
				return node.value;
			} else {
				throw new EmptyList("Hash Table does not contains " + key);
			}
		}

		public V remove(K key) throws Exception {
			int bi = hashfn(key);
			int di = getIndexWithinBucket(key, bi);
			if (di != -1) {
				HTNode node = buckets[bi].remove(di);
				size--;
				return node.value;
			} else {
				throw new EmptyList("Hash Table does not contains Key that is : " + key);
			}
		}

		public int size() {
			return size;
		}

		public void display() {
			System.out.println("Display Begins");
			for (int bi = 0; bi < buckets.length; bi++) {
				System.out.print("Bucket " + bi + " ");
				for (HTNode node : buckets[bi]) {
					System.out.print(node.key + "@" + node.value + " ");

				}
				System.out.println(".");
			}
			System.out.println("Display Ends");
		}

		public ArrayList<HTNode> iterate() throws Exception {
			ArrayList<HTNode> set = new ArrayList<>();

			for (int bi = 0; bi < buckets.length; bi++) {
				for (HTNode node : buckets[bi]) {
					set.add(node);

				}
			}
			return set;
		}

	}

}
