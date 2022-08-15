class Shape
{

String color;
Shape()
{
color="balck";
}

void area(float radius)
{

float area = 3.14f*radius*radius;
//color = "Blue";
System.out.println("Area of a Circle : "+area+" and color is : "+color);

}

void area(int length)
{

int area = length*length;
//color = "Red";
System.out.println("Area of a Square : "+area+" and color is : "+color);

}

void area(int length, int breath)
{

int area = length*breath;
//color = "Yellow";
System.out.println("Area of Triangle : "+area+" and color is : "+color);

}


}

class Area
{

public static void main(String[]args)
{

Shape obj1 = new Shape();


obj1.area(4.5f);
obj1.area(23,34);
obj1.area(25);

}

}