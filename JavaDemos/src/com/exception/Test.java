package com.exception;

public class Test {

int a;

void show()
{
	try {
	a=5/0;
	}
	catch(Exception e)
	{
		
		System.out.println(e);
	}
	finally {
		System.out.println(a);
	}

	
}

public static void main(String[] args) {
	Test t=new Test();
	t.show();
System.out.println(t.main());
}

int main()
{
return 9;	
}
}
