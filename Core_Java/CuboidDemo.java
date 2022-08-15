class Cuboid
{

int length,breath,height;

Cuboid(int length,int breath,int height)
{

this.length = length;
this.breath = breath;
this.height = height;

}

void Area()
{

int area = 2*((length*breath)+(height*breath)+(length*height));

System.out.println("Surface Area of Cuboid : "+area);
}

void Volume()
{
int volume = height*length*breath;

System.out.println("Volume of Cuboid : "+volume);
}

}

class CuboidDemo
{

public static void main(String[]args)
{

Cuboid obj1 = new Cuboid(78,90,23);

obj1.Area();
obj1.Volume();

}

}