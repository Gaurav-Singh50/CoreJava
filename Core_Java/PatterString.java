class PatterString
{

public static void main(String[]ar)
{

/*           ********Methods in STRING*******          */

//toUppercase()->use to convert any string into uppercase same vice versa with lowercase()
//trim()->use to remove leading and forwarding spaces
//charAt(int index)->give the character at particular index of string
//indexOf(char )->use to give index of a char of a string and if it is not then it will return -1(return integer).
//Note length->is the property of the class and length()->method of the class string
//String var = String.valueOf(datatype) ->use to convert any datatype to string and not work for char datatype(if we pass) to string
//Question -> What happens if the main() method is written without String args[]? 
//Answer->The program will compile, but not run, because JVM will not recognize the main() method. Remember JVM always looks for the main() method with a string type array as a parameter.

for(int m=0;m<ar.length;m++)
{
String name = ar[m].toUpperCase();
System.out.println("Hello "+name);

for(int i=0;i<=name.length();i++)
{
for(int j=0;j<i;j++)
{

char c = name.charAt(j);
System.out.print(c);

}
System.out.println();
}
}
}
}