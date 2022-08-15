	class Book
	{

	 private String name;
	float price;
	void setDetails(String name,float price)

	{

	this.name=name;
	this.price=price;
	}
	void getDetails()
		{
	System.out.println("Book name is "+name);
	System.out.println("Price is "+price);
	}
}

class Student
{
String name;
Book book;//Has a relationship
void setInfo(String name,Book book)
{
this.name=name;
this.book=book;
}
void getInfo()
{
System.out.println("student name is "+name);
System.out.println("book details "+book);//hashcode of the book class object
	book.getDetails();

	book.name="Python";//implementation of call by reference
	book.getDetails();

}
}
class Student_Book
{
public static void main(String []args)
{
Book b=new Book();
b.setDetails("Java",999.99f);
b.getDetails();
System.out.println("HAS A RELATIONSHIP  AND PASSING OBJECT IN A METHOD");
Student s=new Student();

s.setInfo("Scott",b);//passing object of book class
s.getInfo();
}

}


