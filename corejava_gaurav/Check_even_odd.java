class Check_even_odd
{
public static void main(String[]args)
{
int n;
String name=args[0];
for(int i=0;i<args.length;i++)
{
n=Integer.parseIntInt(args[i]);



if( n%2==0)
{
System.out.println("Number  "+args[0]+"   even ");

}
else
{
System.out.println("Number   "+args[0]+"  odd" );

}

}
}

}