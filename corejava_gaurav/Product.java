class Product
{
int price;
String colname,company;
boolean isDigital;




void SetDetails(int p,String cl,String c,boolean d,)
{
prince=p;
colname=cl;
company=c;
isBoolean=d;




}
void getDetails()
{
System.out.println("Price of the pen is  "+price);
System.out.println("Colour of the product is  "+colname);
System.out.println("Company of the product is  "+company);
System.out.println("the Product is   "+isBoolean);
}
}
class ProductDemo
{
public static void main(String[]args)
{
Product p=null;
p=new Product();
p.SetDetails(10,"black","hp",true);
p.getDetails();

}
}