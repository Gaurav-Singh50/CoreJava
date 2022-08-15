package com.practice4;


public class App 
{
    public static void main( String[] args )
    {
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=0;
System.out.println("Before Swapping "+"a = "+a+" b = "+b);
c=a;
a=b;
b=c;
System.out.println("After Swapping "+"a = "+a+" b = "+b);
    }
}
