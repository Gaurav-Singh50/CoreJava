class Pen
{
String cname,inkcol;               //instance variable and all instance by default null value 

float price;
boolean isBallpen;


void setDetails(float p,boolean b,String c,String ink)
{
price=p;
isBallpen=b;
cname=c;
inkcol=ink;



}

void getDetails()
{
System.out.println("Price of Pen "+price);
System.out.println("Pen  ink colour is  "+inkcol);
System.out.println("Pen Company name is  "+cname);
System.out.println("Pen is ballPen  "+isBallpen);





}

}
class PenDemo
{
public static void main(String[]args)
{
Pen p=null;
p=new Pen();
p.setDetails(10.25f,true,"Parker","Red");
p.getDetails();



}

}