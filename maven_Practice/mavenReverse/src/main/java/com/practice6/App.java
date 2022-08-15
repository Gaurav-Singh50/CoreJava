package com.practice6;

public class App 
{
    public static void main( String[] args )
    { 
      int num = Integer.parseInt(args[0]);
      int d=0;
      int rev=0;
      int x = num; 

      while( num != 0){
      
      d = num % 10;
      rev = rev * 10 + d;
      num = num / 10;
    }
    System.out.println("Reverse of "+x+" is "+rev);
    }
}
