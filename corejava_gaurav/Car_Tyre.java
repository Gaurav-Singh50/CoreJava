class Tyre
{
int price;
String name;

void setInfo(String name,int price)
{
this.name=name;
this.price=price;

}
void getInfo()
{
System.out.println("Tyre name is "+name);
System.out.println("Tyre price is "+price);
}
}

class Car
{
int price;
String name,company;
Tyre tyre;

void setDetails(int price,String name,String company,Tyre tyre)
{
this.price=price;
this.tyre=tyre;
this.name=name;
this.company=company;

}

void getDetails()
{
System.out.println("Car Price is "+price);
System.out.println("Car name is "+name);
System.out.println("Car company is "+company);
tyre.getInfo();
}
}


class Car_Tyre
{
public static void main(String[]args)
{
Tyre t=new Tyre();
t.setInfo("APOLLO",500);
t.getInfo();

System.out.println("---------------------");
Car c=new Car();
c.setDetails(1000000,"i20","hyundai",t);
c.getDetails();




}
}




