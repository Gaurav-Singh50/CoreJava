package com.inter_face;

public interface Calculation
{
public float PI=3.14f;

public void add(int x,int y);
public int sub(int x,int y);
public default void  area(float radius)//optional
{
	System.out.println("Area of circle has to be calculated");
}
public static void showFormulas()
{
	System.out.println("PI value is "+PI);
}

}
