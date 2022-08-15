class Product
{
float price;
String name,color,company,type;

void setDetails(float price,String name,String color,String company,String type)
{
this.price=price;                                     //this refers the instancen variable hiding concept. 
this.name=name;
this.color=color;
this.company=company;
this.type=type;
}

void getDetails()
{

System.out.println("Price of product is "+price);                   
System.out.println("Name of product is "+name);
System.out.println("Color of product is "+color);
System.out.println("Company of product is "+company);
System.out.println("Type of product is "+type);
}
void discount()
{
float discount_price=0.0f;
if(type.equalsIgnoreCase("bakery"))
{
discount_price=price-price*.20f;


}

if(type.equalsIgnoreCase("digital"))
{
discount_price=price-price*.30f;
}
System.out.println("Pay only  "+discount_price+ "for "+name+" after discount");

}
}

class ProductBased
{
public static void main(String[]args)
{
Product p=new Product();
Product p1=new Product();
p.setDetails(100,"CAKE","BLACK","MR.BROWN","BAKERY");
p.discount();
p.getDetails();
System.out.println();
p1.setDetails(1000,"WATCH","BLUE","TITAN","DIGITAL");
p1.discount();
p1.getDetails();
}
}