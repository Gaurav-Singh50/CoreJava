class PatternDemo
{
public static void main(String[]args)




{
//String name=args[0].toUpperCase();
//System.out.println("Name is  "+name);
for(int k=0;k<args.length;k++)

{
String name=args[k].toUpperCase();
for(int i=0;i<name.length();i++)

{

for (int j=0;j<=i;j++)
{
char c=name.charAt(j);
System.out.print(c+" ");



}

System.out.println(" ");
}


}

}}