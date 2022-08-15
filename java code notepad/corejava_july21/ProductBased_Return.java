class Product
{
float price;
String name,color,company,type;

void setDetails(float price,String name,String color,String company,String type)
{
this.price=price;//this refers to current object instance variable hiding concept
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

//bakery product 20%
//digital product 30%;
float  discount()
{
	
float discounted_price=0.0f;
if(type.equalsIgnoreCase("bakery"))
{
discounted_price=price-price*.20f;
}
if(type.equalsIgnoreCase("digital"))
{
discounted_price=price-price*.30f;
}


return discounted_price;
}
}
class ProductBased_Return
{
public static void main(String[]args)
{
Product p=new Product();
Product p1=new Product();

p.setDetails(500,"CAKE","BLACK","MR.BROWN","BAKERY");

		float discounted_price=p.discount();
		
	System.out.println("You have to pay only "+discounted_price);

	p.getDetails();


	System.out.println();
	p1.setDetails(1000,"WATCH","BLUE","TITAN","DIGITAL");

		System.out.println("You have to pay only "+p1.discount());

p1.getDetails();





}
}