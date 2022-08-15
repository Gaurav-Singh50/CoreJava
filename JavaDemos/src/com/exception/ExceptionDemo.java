package com.exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		
//		int x=5/0;
//		System.out.println(x);
		
//		int[]num=new int[4];
//		num[10]=100;
//		System.out.println(num[10]);
//		
//		
		
//		String name=null;
//		int len=name.length();
//		System.out.println(len);
//		String name="Scott";
//			for (int i=0;i<=name.length();i++)
//			{
//				
//				System.out.println(name.charAt(i));
//			}
//		
		
//		float[]salary=new float[-3];
//		salary[0]=40000.00f;
				
		try {
		String num="hello";
		int x=	Integer.parseInt(num);
		System.out.println(x);
		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne);
		}
		

	}

}




