package com.nagarro.user;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.nagarro.dsa.HashTableFunctions.HashTable;
import com.nagarro.exceptions.EmptyList;

public class HashTableOperations {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashTable<String, Integer> map = new HashTable();

		try {
			System.out.println("\nChose from the below options...\n");
			System.out.println(
					"\n1.put key value\n2.remove key\n3.get key\n4.contains key\n5.size\n6.iterator\n7.display\n8.quit");
			String str = br.readLine();
			while (str.equals("quit") == false) {
				if (str.startsWith("put")) {
					String[] parts = str.split(" ");
					String key = parts[1];
					Integer val = Integer.parseInt(parts[2]);
					map.put(key, val);
					System.out.println(key + " " + val + " Inserted");
				} else if (str.startsWith("get")) {
					String[] parts = str.split(" ");
					String key = parts[1];
					System.out.println("The value of the " + key + " is : " + map.get(key));
				} else if (str.startsWith("contains")) {
					String[] parts = str.split(" ");
					String key = parts[1];
					if (map.containsKey(key)) {
						System.out.println("HashTable contains " + key);
					} else {
						System.out.println("HashTable does not contains " + key);
					}

				} else if (str.startsWith("remove")) {
					String[] parts = str.split(" ");
					String key = parts[1];

					System.out.println(key + " removed" + " and the value of the " + key + " was :" + map.remove(key));
				} else if (str.startsWith("size")) {
					System.out.println("Size of HashTable is : " + map.size());
				} else if (str.startsWith("iterator")) {
					System.out.println(map.iterate());

				} else if (str.startsWith("display")) {
					map.display();
				}
				str = br.readLine();
			}
		} catch (EmptyList e) {
			System.out.println(e);
		}
	}

}
