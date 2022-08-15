class Animal
{

String color,type;
String nailType="sharp";
void setAnimalDetails(String color,String type)
{

this.color=color;
this.type=type;

}

void getAnimalDetails()
{

System.out.println("color of animal is "+color);
System.out.println("It is "+type);
}

}


class Lion extends Animal
{


String cannine;
String nailType="Very sharp";
void setCannineDetails(String cannine)
{
this.cannine=cannine;

}

void getAnimalDetails()//method overriding
{

	
	System.out.println(cannine);
	System.out.println(nailType);
	System.out.println(super.nailType);
	super.getAnimalDetails();

}
}

class InheritanceDemo
{

public static void main(String[]args)
{
	
	Lion lion=new Lion();
	lion.setAnimalDetails("brownYellow","Carnivores");
	lion.setCannineDetails("8inches");
	lion.getAnimalDetails();
}

}




