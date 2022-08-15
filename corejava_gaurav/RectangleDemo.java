class Rectangle
{
int width,height;
Rectangle()              //default constructor
{


width=10;
height=5;
}

Rectangle(int width,int height)
{
this.width=width;
this.height=height;


}

void setDim(int width,int height)
{
this.width=width;
this.height=height;
}

void getDim()
{
System.out.println("width is "+width+" length is "+height);
}

void area()
{
int area=width*height;
System.out.println("Area of Rectangle= "+area);
}
}

class RectangleDemo
{
public static void main(String[]agrs)
{

Rectangle r=new Rectangle();         //this is default constructor
r.setDim(9,5);
r.area();


Rectangle r1=new Rectangle(7,6);       //parameteised
r1.area();



}
}












