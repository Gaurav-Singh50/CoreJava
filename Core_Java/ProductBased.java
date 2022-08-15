class Product
{
float price;
String name,color,company,type;

void setDetails(float price,String name,String color,String company,String type)
{
this.price=price;//This refer to the current object(this is used to remove Instance Variable hiding concept)
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

float discounted_price = 0.0f;
if(type.equalsIgnoreCase("bakery"))//equals use to compare two string and return boolean value(equalsIgnoreCase use to ignore casing)
{

discounted_price = price-price*0.20f;

}
else if(type.equalsIgnoreCase("digital"))
{

discounted_price = price-price*0.300f;

}

System.out.println("The Discounted price  i got on my "+name+" product is : "+discounted_price);

}
}

class ProductBased
{
public static void main(String[]args)
{
Product p=new Product();
Product p1=new Product();
p.setDetails(99.99f,"CAKE","BLACK","MR.BROWN","BAKERY");
p.getDetails();
p.discount();
System.out.println();
p1.setDetails(985.99f,"WATCH","BLUE","TITAN","DIGITAL");
p1.getDetails();
p1.discount();
}
}