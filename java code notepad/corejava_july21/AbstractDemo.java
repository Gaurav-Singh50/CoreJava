 abstract class Animal
{

abstract void sound();

abstract void eat();
//instance
//static

}

abstract class Lion extends Animal
{

	String color;
	Lion(String color)
	{
this.color=color;
System.out.println("IN LION");
	}
	void sound()
	{
	System.out.println("Roar");	

	}
	abstract void move();

}

class Cub extends Lion
{

	Cub(String color)
	{
	Super(color);
	}
	void move()
	{

	}

	void eat()
	{
	System.out.println("Eat flesh");

	}

}
class AbstractDemo
{
public static void main(String[]args)
{

	Cub c=new Cub("yellow");
	c.sound();
	c.eat();

	Lion lion;


}
}