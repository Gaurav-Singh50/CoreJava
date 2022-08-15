class Bird
{

Bird()
{

System.out.println("In Bird Class");

}

}

class FlyingBird extends Bird
{

FlyingBird()
{

System.out.println("In Flying Bird Class");

}

}
class NonFlyingBird extends Bird
{

NonFlyingBird()
{

System.out.println("In Non-Flying Bird Class");

}

}

class Crow extends FlyingBird
{

Crow()
{

System.out.println("In Crow Class");

}

}

class Panchi
{

public static void main(String[]args)
{

Crow b1 = new Crow();

}

}