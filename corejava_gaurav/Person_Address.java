class Address
{
String housenumber,street,city;

void setAddress(String housenumber,String street,String city)

{
this.housenumber=housenumber;
this.street=street;
this.city=city;
}
void getAddress()
{
System.out.println("The house no is "+housenumber);
System.out.println("The street is "+street);
System.out.println("The city is "+city);
}
}



class Person
{
String name;
int age;
Address address;


void setInfo(String name,int age,Address address)
{
this.name=name;
this.age=age;
this.address=address;
}
void getInfo()
{
System.out.println("Person name is "+name);
System.out.println("Person agr is "+age);
System.out.println("person address is");
address.getAddress();
}
Address getAddressDetails()
{
return address;


}

}
;


class Person_Address
{
public static void main(String[]args)
{
Address a=new Address();
a.setAddress("50","Phool Wali Gali","Fatehpur");
a.getAddress();
System.out.println("------------");
Person p=new Person();
p.setInfo("john",23,a);
p.getInfo();

System.out.println("Return object to print Address");
Address ad=p.getAddressDetails();
System.out.println("Address is"+ad);
ad.getAddress();



}
}
