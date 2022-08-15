class Area
{
int width,height,length,base,radius;



Area()
{
width=10;
height=20;
length=30;
base=40;
radius=50;
}


Area(int width,int height,int length,int base,int radius)
{
this.width=width;
this.height=height;
this.length=length;
this.base=base;
this.radius=radius;
}




void setArea(int width,int height,int length,int base,int radius)
{
this.width=width;
this.height=height;
this.length=length;
this.base=base;
this.radius=radius;
}


void getArea()
{
System.out.println(" Width is "+width+ " Height is "+height+" Length is "+length+" Base is "+base+" Radius is "+radius);

}







void areaofcircle()
{
float area=width*height;
System.out.println("Area of Circle is "+area);
}

void areaofrectangle()
{
float area=width*height*length;
System.out.println("Area of rectangle is "+area);
}

void areaoftriangle()
{
float area=(height*base)/2;
System.out.println("Area of triangle is "+area);
}

void areaofsquare()
{
float area=radius*radius;
System.out.println("Area of square is "+area);
}
}






class AreaDemo
{
public static void main(String[]args)
{
Area a=new Area();
//a.setDim();
a.areaofcircle();
a.areaofrectangle();
a.areaoftriangle();
a.areaofsquare();


}


}


