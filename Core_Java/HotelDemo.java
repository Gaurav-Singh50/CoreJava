class Hotel
{
static final String HOTELNAME ="XYZ";
static  int no_of_chefs = 5;

float bill;
String customerName;
int no_of_order;

Hotel(float bill,String customerName,int no_of_order)
{

this.bill= bill;
this.customerName = customerName;
this.no_of_order = no_of_order;

}

static int chefChanged()
{

no_of_chefs = 7;

return no_of_chefs;

}

void getDetails()
{

System.out.println(customerName+" total Bill amount is : "+bill+" and no item he oder is : "+no_of_order);

}

}
class HotelDemo
{

public static void main(String[]args)
{

Hotel customer1 = new Hotel(891.9f,"Kumail",4);
Hotel customer2 = new Hotel(999.7f,"Gaurav",2);

customer1.getDetails();
customer2.getDetails();

System.out.println("Chefs in a hotel is : "+Hotel.chefChanged());

}

}
