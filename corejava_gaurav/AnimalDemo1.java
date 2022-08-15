abstract class Animal
{
abstract void sound();
abstract void eat();
}

abstract class Lion extends Animal
{

void sound()
{
System.out.println("roar");

}
abstract void move();
}
class Cub extends  Lion
{
void move()
{
}


void eat()
{
System.out.println("eat");
}

}

class AnimalDemo1
{
public static void main(String[]args)
{
Cub c=new Cub();
c.sound();
c.eat();

Lion l=new Lion();              //you can not creat abstracts class object explicitly
}





}