class Animal
{
String nail = "Sharp";
String color,type;
void setAnimalDetails(String color,String type)
{

this.color = color;
this.type = type;

}

void getDetails()
{
System.out.println("Color of animal is "+color+" and type is "+type);
}

}

class Lion extends Animal
{

String cannine;
String nail = "Very Sharp";
void setCannineDetails(String cannine)
{

this.cannine = cannine;

}
void getDetails()//Method Overriding
{
System.out.println(cannine);
System.out.println(nail); 
super.getDetails();//it will get the variable and method of the super class if it has the same signature.
System.out.println(super.nail);
}



}

class InehritanceDemo
{

public static void main(String[]args)
{

Lion lion = new Lion();
lion.setAnimalDetails("Green","Carnivorus");
lion.setCannineDetails("8 inches");
lion.getDetails();

}

}