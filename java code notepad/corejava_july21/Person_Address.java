class Address{

String housenumber,street,cityname;

void setAddress(String housenumber,String street,String cityname)
{
this.housenumber=housenumber;
this.street=street;
this.cityname=cityname;
}

void getAddress()
{
System.out.println("Housenumber is "+housenumber+" Street name is "+street+" Cityname is "+cityname);
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
System.out.println("Name of the person is "+name+" Age is "+age);
System.out.println("Address is");
address.getAddress(); 
}

	Address getAddressDetails()//method  returns object
	{

		return address;
		//return new Address();will create new object
	}
		

}


class Person_Address
{

public static void main(String[]args)
{

Address ad=new Address();
ad.setAddress("s-62","Mahanagar","Lucknow");
Person p=new Person();
p.setInfo("Scott",30,ad);



p.getInfo();
	
	System.out.println("--------Returning object to print Address----------");	
	Address a=p.getAddressDetails();//method returning object

	System.out.println("Address is"+a);//hashcode of the Address class object
				a.getAddress();//Address class method
			
}
}





