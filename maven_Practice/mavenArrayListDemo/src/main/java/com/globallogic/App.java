package com.globallogic;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
Scanner sc = new Scanner(System.in);

ArrayList<Integer> list = new ArrayList<>();
System.out.println( "Enter the limit" );
int n = sc.nextInt();

for(int i = 0 ; i < n ; i++){


System.out.println( "Enter the age" );
int age = sc.nextInt();


list.add(age);
}
for(int i : list){
System.out.println(i);

}
}
}
