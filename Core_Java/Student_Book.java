class Book
{
String name;
float price;

void setDetails(String name,float price)
{

this.name = name;
this.price = price;

}

void getDetails()
{

System.out.println("The price of the BOOK is " +price+" and name is : "+name);

}

}

class Student
{

String name;
Book book;//has a relationship

void setInfo(String name,Book book)
{

this.name = name;
this.book = book;

}
void getInfo()
{

System.out.println("Student name is : "+name);
//System.out.println("Book name is : "+book);->if you print object then it's hashcode of the book class object

book.getDetails();


}
}


class Student_Book
{
public static void main(String[]ar)
{
Book b = new Book();
b.setDetails("Java",999.99f);
b.getDetails();
System.out.println("HAS A RELATIONSHIP PASSING OBJECT IN A METHOD");

Student s = new Student();

s.setInfo("Kumail",b);
s.getInfo();

}

}

