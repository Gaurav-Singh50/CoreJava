class Book
{
String name;
float price;



void setDetails(String name,book price)

{
this.name=name;
this.price=price;
}
void getDetails()
{
System.out.println("Book name is "+name);
System.out.println("Book price is "+price);

}

}
Class Student
{
String name;
Book book;        //has a relationship

void setInfo(String name,Book book)
{
this.name=name;
this.book=book;

}
void getInfo()
{
System.out.println("Student name is "+name);
System.out.println("Book detail "+book);                  //hashcode of the book class object
book.getDetails();


}
}

class Student_Book
{
public static void main(String[]args)
{
Book b=new Book();
b.setDetails("Java",6869.3f);
b.getDetails();
System.out.println("HAS A RELATIONSHIP PASSING OBJECT IN A METHOD");


Student s=new Student();
s.setInfo("John",b);
s.getInfo();


}

}

