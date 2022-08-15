package com.nagarro.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nagarro.dsa.*;
import com.nagarro.dsa.LinkedListFunctions.LinkedList;
import com.nagarro.dsa.LinkedListFunctions.Node;
import com.nagarro.exceptions.*;

public class LinkedListOperations {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			LinkedList<Integer> list = new LinkedList<>();

			System.out.println(
					"Enter your choice:\naddFirst Value \naddLast Value \ninsertAt index value \nremoveFirst \nremoveLast \ndeleteAt index \ncenter \niterator \nreverse \nsize \ndisplay \nquit \n--------------------------------------------------------------------------------------------------");
			String str = br.readLine();
			while (str.equals("quit") == false) {
				if (str.startsWith("addFirst")) {
					int val = Integer.parseInt(str.split(" ")[1]);
					list.addFirst(val);
				} else if (str.startsWith("addLast")) {
					int val = Integer.parseInt(str.split(" ")[1]);
					list.addLast(val);
				} else if (str.startsWith("insertAt")) {
					int index = Integer.parseInt(str.split(" ")[1]);
					int value = Integer.parseInt(str.split(" ")[2]);
					list.insertAt(list, index, value);
				}

				else if (str.startsWith("removeFirst")) {
					list.removeFirst();
				} else if (str.startsWith("removeLast")) {
					list.removeLast();

				} else if (str.startsWith("deleteAt")) {
					int index = Integer.parseInt(str.split(" ")[1]);
					list.deleteAt(list, index);

				} else if (str.startsWith("reverse")) {
					list.reverse();

				} else if (str.startsWith("size")) {
					int x = list.getSize();
					System.out.println("Size of LinkedList is: " + x);

				} else if (str.startsWith("center")) {
					int value = list.center();
					System.out.println("Value at center of LinkedList is :" + value);

				} else if (str.startsWith("display")) {

					list.display();
				} else if (str.startsWith("iterator")) {

					for (int val : list) {
						System.out.println(val);
					}
				}
				str = br.readLine();
			}

		} catch (EmptyList | IndexOutOfBound e) {
			System.out.println(e);
		}

	}

}