package com.exception;

public class NameDemo {
	public static void main(String[] args)
	{
		NameMatching nm=new NameMatching();
			try {
			nm.checkName("abc");
			}
			catch(NameNotFoundException ne)
			{
				
			//System.out.println(ne);
				//System.out.println(ne.getMessage());
				ne.printStackTrace();
			}
		
	}

}
