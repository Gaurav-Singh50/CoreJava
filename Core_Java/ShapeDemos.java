abstract class Shape
{

String color;

Shape(String color)
{

this.color = color;
}

abstract void area();

abstract void volume();

void getColor()
{
System.out.println("The color is : "+color);
}

}



class Rectangle extends Shape
{

int length ,breadth;

Rectangle(int length,int breadth,String color)
{
super(color);
this.length = length;
this.breadth = breadth;
}

void area()
{
int a  = length*breadth;

System.out.println("The area of a Rectangle is : "+a);



}
void volume()
{}
void getDimension()
{

System.out.println("Length of Rectangle is : "+length+" and breadth is : "+breadth);

}

/*void getColor()
{
System.out.println("The color is : "+color);
}*/

}

class Cuboid extends Shape
{

int length ,breadth,heigth;

Cuboid(int length,int breadth,int heigth,String color)
{
super(color);
this.length = length;
this.breadth = breadth;
this.heigth = heigth;
}

void area()
{
int a  = ((2*length*breadth)+(2*length*heigth)+(2*breadth*heigth));

System.out.println("The area of a Cuboid is : "+a);
}

void volume()
{

int v = length*breadth*heigth;

System.out.println("Volume of cuboid is : "+v);
}
void getDimension()
{

System.out.println("Length of Cuboid is : "+length+" and breath is : "+breadth);
System.out.println("Heigth is : "+heigth);
}


}


class ShapeDemos
{

public static void main(String[]args)
{

Rectangle r1 = new Rectangle(12,45,"Yellow");
r1.area();
r1.volume();
r1.getDimension();
r1.getColor();

System.out.println();


Cuboid c1 = new Cuboid(19,34,56,"Red");
c1.area();
c1.volume();
c1.getDimension();
c1.getColor();

}

}
