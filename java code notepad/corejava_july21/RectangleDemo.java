class Rectangle
{

int width,height;
Rectangle()//default constructor
{

width=10;
height=5;

}

Rectangle(int width,int height)//parameterised
{

this.width=width;
this.height=height
}

void setDim(int width,int height)//instance method
{

this.width=width;
this.height=height
}

void getDim()
{
System.out.println("width is  "+width+"height is "+height);

}

void area()
{

int area=width*height;
System.out.println("Area of rectangle is "+area);

}


}



class RectangleDemo
{

public static void main(String[]args)
{


Rectangle r=new Rectangle();//using default constructor
	r.setDim(2,3);
	r.area();

Rectangle r1=new Rectangle(4,6);//parameterised 
	r1.area();
	

}


}
