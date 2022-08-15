package com.practice2;


public class App 
{
    public static void main( String[] args )
    {
int d=Integer.parseInt(args[0]);
int a=0;
int b=1;

for(int i=1;i<=d;i++)
{
if(i == 1)
{
System.out.print(a+" ");
}
else if(i == 2)
{
System.out.print(b+" ");
}
else{
int c=a+b;
System.out.print(c+" ");
a=b;
b=c;
}
}

        
    }
}
