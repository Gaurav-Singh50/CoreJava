class Pen
{

String cname,inkcolor;//instance variable->have a default value(String class has NULL and for char->space)
float price;//instance variable->have a default value(Float,double class has 0.00 and for int,short,long,byte is 0,boolean->false)

boolean isBallpen;

void setDetails(float p,boolean b,String c,String ink)
{
price=p;
isBallpen=b;
cname=c;
inkcolor=ink;
}

void getDetails()
{

System.out.println("Price of a Pen : "+price);
System.out.println("Color of a Pen : "+inkcolor);

}

}

class PenDemo
{

public static void main(String[]ar)
{

Pen p=null;

p=new Pen();

p.setDetails(999.99f,true,"Parker","Red");
p.getDetails();


}
}