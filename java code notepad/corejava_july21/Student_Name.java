class Student
{

String name;
private String haircolor="black";

void setName(String name,String haircolor)
{
this.name=name;
this.haircolor=haircolor;

}

void getDetails()
{

System.out.println("name is "+name);
System.out.println("haircolor is "+haircolor);
}

}
class Student_name
{
public static void main(String[]args)
{
Student s=new Student();
s.setName("scott");
s.getDetails();
//System.out.println(s.haircolor);

Student s=new Student();
s.setName("Smith);
s.getDetails();

}

}