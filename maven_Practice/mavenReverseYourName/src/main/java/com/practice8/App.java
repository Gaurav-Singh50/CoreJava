package com.practice8;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Full Name");
        String fullName=sc.nextLine();
        String[] str = fullName.split(" ");
        String reversedName="";

        for(int i=0;i<str.length;i++){
        reversedName = str[i] + " " + reversedName;
        }
        System.out.println("Original name is "+fullName);
        System.out.println("Reversed name is "+reversedName);
    }
}
