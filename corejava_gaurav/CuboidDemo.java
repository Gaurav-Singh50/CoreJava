class Cuboid
{
int l;
int w;
int h;


Cuboid(int l,int w,int h)

{
this.l=l;
this.w=w;
this.h=h;
}

void volume()
{
float volume=l*w*h;
System.out.println("Volume of cuboid is "+volume);
}


void area()
{
double area=2*(l*w+w*h+h*l);
System.out.println("Area of cuboid is "+area);


}
}

class CuboidDemo
{
public static void main(String[]args)
{
Cuboid c=new Cuboid(5,6,7);
c.volume();
c.area();

}

}






