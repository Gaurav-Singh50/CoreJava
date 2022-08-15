class Bird
{

Bird()
{

System.out.println("in bird class");

}

}
class FlyingBird extends Bird
{
FlyingBird()
{

System.out.println("in Flyingbird class");

}

}

class NonFlyingBird extends Bird
{
NonFlyingBird()
{

System.out.println("in NonFlyingbird class");

}
}

class Crow extends FlyingBird
{
Crow()
{

System.out.println("in crow claas");


}
}


class ObjectCreationDemo
{
public static void main(String[]args)

{
Crow c=new Crow();
NonFlyingBird nb=new NonFlyingBird();

}

}


