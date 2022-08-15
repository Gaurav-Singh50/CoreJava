class IBDemo
{
int i;
{
i=10;
System.out.println("In block "+i);
}
IBDemo()
{
i=5;
System.out.println("Instance "+i);
}
public static void main(String[]args)
{

IBDemo d=new IBDemo();

}
}