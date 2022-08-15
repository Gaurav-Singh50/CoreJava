package com.practice;

public class App 
{
    public static void main( String[] args )
    {
int n=args.length;
int firstHighest=Integer.MIN_VALUE;
int secondHighest=Integer.MIN_VALUE;

for(int i=0;i<n;i++){
if(Integer.parseInt(args[i]) > firstHighest){
secondHighest = firstHighest;
firstHighest = Integer.parseInt(args[i]);
}
else{
if(Integer.parseInt(args[i]) > secondHighest){
secondHighest = Integer.parseInt(args[i]);
}

}

}
System.out.println( "Second Highest number in the array is "+secondHighest);
    }
}
