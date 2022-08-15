package com.inter_face;

public interface ActionListener
{
	public void actionPerformed();
	public  default void show()
	{
		System.out.println("default");
	}

}
