/*Command line argument always pass for running of the application generaly it is used for setting system parameters*/

class CommandDemo
{

public static void main(String[]args)//String[]args->take command line input where each element is a string.

{

/*String name = args[0];
System.out.println("Hello "+name);*/

for(int i=0; i<args.length;i++)
{

System.out.println("Hello "+args[i]);

}

}

}

