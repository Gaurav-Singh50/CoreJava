class Rectangle
{

int width,heigth;

Rectangle()//default constructor
{

width = 10;
heigth=15;

}

Rectangle(int heigth, int width)//parametrised
{

this.heigth = heigth;
this.width = width;

}

void setDim(int heigth, int width)//instance method
{

this.heigth = heigth;
this.width = width;

}

void getDemo()
{

System.out.println("Width of Rectangle is : "+width+"Heigth is : "+heigth);

}
void area()
{
int a = heigth * width;

System.out.println("Area of Rectangle is : "+a); 

}
}

class RectangleDemo
{

public static void main(String[]args)
{

Rectangle r = new Rectangle();//using default constructor

r.setDim(3,4);
r.area();


}

}
