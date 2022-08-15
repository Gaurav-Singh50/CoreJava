package com.nagarro.user;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.nagarro.dsa.StackAsLinkedList;
import com.nagarro.exceptions.EmptyList;

public class StackOperationsLinkedList {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StackAsLinkedList<Integer> st = new StackAsLinkedList<>();

		try {
			System.out.println("*********Stack operations using LinkedList*********\n");
			System.out.println("\n------------------------------------------------\n");
			System.out.println("\nChose from the below options...\n");
			System.out.println(
					"\n1.Push Value\n2.Pop\n3.Peek\n4.Contains Value\n5.Size\n6.Reverse\n7.Iterator\n8.Display\n9.quit");
			String str = br.readLine();

			while (str.startsWith("quit") == false) {
				if (str.startsWith("Push")) {
					int val = Integer.parseInt(str.split(" ")[1]);
					st.push(val);

				} else if (str.startsWith("Pop")) {
					int popped = st.pop();
					System.out.println(popped + " Popped");

				} else if (str.startsWith("Peek")) {
					int peek = st.peek();
					System.out.println("Value at Peek :" + peek);
				} else if (str.startsWith("Contains")) {
					int val = Integer.parseInt(str.split(" ")[1]);

					boolean result = st.contains(val);
					if (result) {
						System.out.println("Stack Contains " + val);
					} else {
						System.out.println("Stack does not contain any such value");
					}

				} else if (str.startsWith("Size")) {
					int size = st.size();
					System.out.println("Size of Stack " + size);
				} else if (str.startsWith("Reverse")) {
					st.reverse();
				} else if (str.startsWith("Iterator")) {
					for (int val : st) {
						System.out.println(val);
					}
				} else if (str.startsWith("Display")) {
					st.display();

				}
				str = br.readLine();

			}

		} catch (EmptyList e) {
			System.out.println(e);

		}

	}
}
