class IBDemo
{

int i;
{

i=10;

System.out.println("In Block "+i);
}

IBDemo()
{
i=5;
System.out.println("In Constructor "+i);
}

}

class IBDemo1
{
public static void main(String[]args)
{

IBDemo obj = new IBDemo();

}
}