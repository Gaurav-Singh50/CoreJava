package com.practice1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int d = Integer.parseInt(args[0]);
int fact = 1;
for(int i=1;i<=d;i++)
{
fact=fact * i;
}
System.out.println("Factorial of "+d+" is "+fact);
    }
}
