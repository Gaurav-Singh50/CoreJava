abstract class Animal
{
abstract void sound();
abstract void eat();
//can contain instance and static method.
}

abstract class Lion extends Animal
{
void sound()
{ 
System.out.println("ROAR");
}
abstract void move();
}

final class Cub extends Lion          //class cub cannot be made parent class
{
void eat()
{
System.out.println("Eat Flesh");
}

void move()
{
}

}

class AnimalAbstractDemo
{
public static void main(String[]args)
{
//Lion l=new Lion();      ->u cannot create abstract class object explicitly.but implicit object is made.
Cub c=new Cub();
c.sound();
c.eat();
c.move();
}
}