package com.nagarro.user;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.ArrayList;

import com.nagarro.dsa.LinkedListFunctions.Node;
import com.nagarro.dsa.PriorityQueue;
import com.nagarro.exceptions.EmptyList;

public class PriorityQueueOperations {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue qu = new PriorityQueue();
		try {
			System.out.println("*********Priority Queue*********\n");
			System.out.println("\n------------------------------------------------\n");
			System.out.println("\nChose from the below options...\n");
			System.out.println(
					"\n1.add Value\n2.remove\n3.peek\n4.contains value\n5.size\n6.reverse\n7.iterator\n8.display\n9.quit");
			String str = br.readLine();
			while (str.equals("quit") == false) {
				if (str.startsWith("add")) {
					int val = Integer.parseInt(str.split(" ")[1]);
					qu.add(val);
					System.out.println(val + " added succesfully");
				} else if (str.startsWith("remove")) {
					int val = qu.remove();
					if (val != -1) {
						System.out.println(val + " removed sucessfully");
					}
				} else if (str.startsWith("peek")) {
					int val = qu.peek();
					if (val != -1) {
						System.out.println("value at peek is :" + val);
					}
				} else if (str.startsWith("size")) {
					System.out.println("size of queue is :" + qu.size());
				} else if (str.startsWith("display")) {
					System.out.println("Elements in queue :");
					qu.display();
				} else if (str.startsWith("reverse")) {
					ArrayList<Integer> arrayli;
					arrayli = qu.reverseArrayList();
					System.out.print("\nElements after reversing:");
					qu.display();
				} else if (str.startsWith("contains")) {
					int val = Integer.parseInt(str.split(" ")[1]);

					boolean result = qu.contains(val);
					if (result) {
						System.out.println("Queue Contains " + val);
					} else {
						System.out.println("Queue does not contain any such value");
					}

				} else if (str.startsWith("iterator")) {
					for (int val : qu) {
						System.out.println(val);
					}

				}

				str = br.readLine();
			}
		} catch (EmptyList e) {
			System.out.println(e);

		}

	}
}