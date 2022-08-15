class PatternDemo
{

public static void main(String[]ar)
{	
//String name=ar[0].toUpperCase();
//System.out.println("Hello  "+name);
for(int k=0;k<ar.length;k++)
{
String name=ar[k];

for(int i=0;i<name.length();i++)
{

	for(int j=0;j<=i;j++)
	{
	char c=name.charAt(j);
	System.out.print(c+" ");
	}//inner
System.out.println();

}//outer

}


}
}