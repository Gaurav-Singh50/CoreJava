package com.practice5;

/**
 * input a=4 b=6
 *
 */
public class App 
{
    public static void main( String[] args )
    {
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println("Before Swapping"+" a = "+a+" b = "+b);
a=a+b;      //a = 4+6 = 10
b=a-b;      //b = 10-6 = 4
a=a-b;      //a = 10-4 = 6
      System.out.println("After Swapping"+" a = "+a+" b = "+b);
    }
}
