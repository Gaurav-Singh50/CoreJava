package com.enums;

public enum Size {
	
	SMALL(87),MEDIUM(94),LARGE(102);

		int value;
	 	Size(int value)
		{
		this.value=value;
		}	
		
		void showSize()
		{
			System.out.println(value);
		}
//	public static void main(String[] args) {
//		
//	}
//	
}
