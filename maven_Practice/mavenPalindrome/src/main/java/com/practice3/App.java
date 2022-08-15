package com.practice3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num = Integer.parseInt(args[0]);
int num1=num;
int rev=0,d=0;    
while(num1 != 0)
{
d = num1 % 10;
rev = rev * 10 + d;
num1 = num1 / 10;
}

if(rev == num)
System.out.println(num+" is a Palindrome number.");
else
System.out.println(num+" is not a Palindrome number.");
    }
}
