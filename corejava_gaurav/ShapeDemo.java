abstract Shape
{
String color;


Shape(String color)
{
this.color=color;

}
{
abstract void area();
abstract void volume();
}
void getInfo()
{
System.out.println("Color is "+color);
}
}

class Rectangle extends Shape
{
Rectangle(String color,int length,int width,int height)
{
super(color);
this.length=length;
this.width=width;
this.height=height;
}
}

class Cube extends Shape
{
Cube(String color,int side)
{
super(color);
this.side=side;
}
}

void area()
{
int area=length*width;
int area=side*side;
System.out.println("area is "+area);
}

void volume()
{
int volume=length*width*hieght;
int volume=6*side;
System.out.println("volume is "+volume)
}



class ShapeDemo
{
public static void main(string[]args)
{
ShapeDemo s=new Shapedemo("10","20","30","black");
s.getInfo();



}


}

