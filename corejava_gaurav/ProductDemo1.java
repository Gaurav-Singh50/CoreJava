class Digital
{
int price;
String colname,company;
boolean isDigital;




void SetDetails(int p,String cl,String c,boolean d)
{
price=p;
colname=cl;
company=c;
isDigital=d;




}


class Bakery
{
int price;
String colname,company;
boolean isBakery;




void SetDetails(int p,String cl,String c,boolean d)
{
price=p;
colname=cl;
company=c;
isBakery=d;


void getDetails()
{
{
System.out.println("Price of the pen is  "+price);
System.out.println("Colour of the product is  "+colname);
System.out.println("Company of the product is  "+company);
System.out.println("the Product is Digital  "+isDigital);
}
}
class ProductDemo1
{
public static void main(String[]args)
{
Digital d=null;
d=new Digital();
d.SetDetails(10,"black","hp",true);
d.getDetails();
{

public static void main(String[]args)
{
Bakery b=null;
b=new Bakery();
b.SetDetails(10,"black","burma",true);
b.getDetails();











}
}
}
}