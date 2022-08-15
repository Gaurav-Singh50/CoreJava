package com.nagarro.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nagarro.dsa.Queue;
import com.nagarro.exceptions.EmptyList;

public class QueueOperations {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new Queue<>();
		try {
			System.out.println("*********Queue operations using LinkedList*********\n");
			System.out.println("\n------------------------------------------------\n");
			System.out.println("\nChose from the below options...\n");
			System.out.println(
					"\n1.Enqueue Value\n2.Dequeue\n3.Peek\n4.Contains Value\n5.Size\n6.Reverse\n7.Iterator\n8.Display\n9.quit");
			String str = br.readLine();

			while (str.startsWith("quit") == false) {

				if (str.startsWith("Enqueue")) {
					int val = Integer.parseInt(str.split(" ")[1]);
					q.enqueue(val);
					System.out.println("Pushed " + val);

				} else if (str.startsWith("Dequeue")) {
					int popped = q.dequeue();
					System.out.println(popped + " Popped");

				} else if (str.startsWith("Peek")) {
					int peek = q.peek();
					System.out.println("Value at Peek :" + peek);
				} else if (str.startsWith("Contains")) {
					int val = Integer.parseInt(str.split(" ")[1]);

					boolean result = q.contains(val);
					if (result) {
						System.out.println("Queue Contains " + val);
					} else {
						System.out.println("Queue does not contain any such value");
					}

				} else if (str.startsWith("Size")) {
					int size = q.size();
					System.out.println("Size of Queue " + size);
				} else if (str.startsWith("Reverse")) {
					q.reverse();
				} else if (str.startsWith("Iterator")) {
					for (int val : q) {
						System.out.println(val);
					}
				} else if (str.startsWith("Display")) {
					q.display();

				}
				str = br.readLine();

			}

		} catch (EmptyList e) {
			System.out.println(e);
		}

	}
}
