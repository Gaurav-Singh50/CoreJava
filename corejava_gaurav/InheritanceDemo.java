class Animal
{
String color,type;
String nailType="Sharp";
void setAnimalDetails(String color,String type)
{
this.color=color;
this.type=type;
}

void getAnimalDetails()
{
System.out.println("Color of Animal is "+color);
System.out.println("It is "+type);

}
}
class Lion extends Animal
{
String cannine;
String nailType=("very sharp");
void setCannineDetails(String cannine)
{
this.cannine=cannine;

}
void getAnimalDetails()
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
lion.setAnimalDetails("Black","Carnovores");
lion.setCannineDetails("8 inch");
lion.getAnimalDetails();


}


}