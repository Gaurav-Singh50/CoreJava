package com.nagarro.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.nagarro.dsa.GenericTree;

public class GenericTreeOperations {
	public static void main(String[] args) throws Exception {
		GenericTree gt = new GenericTree();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("***************Generic Tree*******************");
		System.out.println("1.add value parent\n2.delete value\n3.contains value\n4.getbyvalue value\n5.getbylevel level\n6.iterator BFSorDFS\n7.displayBFS\n8.displayDFS\n9.display\n10.quit");
		String str=br.readLine();
		while(str.startsWith("quit")==false)
		{
			if (str.startsWith("add")) {
				
				int value = Integer.parseInt(str.split(" ")[1]);
				
				String parent = str.split(" ")[2];
				if(parent.equals("null"))
				{
					gt.add(value, null);
				}
				else
				{
					gt.add(value, Integer.parseInt(parent));
				}
				
				
				
				System.out.println(value+" Added");

			} else if (str.startsWith("delete")) {
				int data = Integer.parseInt(str.split(" ")[1]);
				gt.delete(data);
				System.out.println(data+" Deleted");

			} 
			else if (str.startsWith("contains")) {
				int val = Integer.parseInt(str.split(" ")[1]);

				boolean result = gt.contains(val);
				if (result) {
					System.out.println("Tree Contains " + val);
				} else {
					System.out.println("Tree does not contain any such value");
				}

			} else if (str.startsWith("getbyvalue")) {
				int data = Integer.parseInt(str.split(" ")[1]);
				gt.getElementsByValue(data);
				
			} else if (str.startsWith("getbylevel")) {
				int data = Integer.parseInt(str.split(" ")[1]);
				
				System.out.println(gt.getElementsByLevel(data));
				
			} else if (str.startsWith("iterator")) {
				String data =str.split(" ")[1];
				gt.setIterator(data);
				for(int v:gt)
				{
					System.out.println(v);
				}
			} else if (str.startsWith("displayBFS")) {
				gt.displaybfs();

			}
			else if (str.startsWith("displayDFS")) {
				gt.displaydfs();

			}
			else if (str.startsWith("display")) {
				gt.display();

			}
			
			str=br.readLine();
		}
		
		
	}
}
