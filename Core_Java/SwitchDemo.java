class SwitchDemo
{

public static void main(String[]ar)
{

String day="Monday";

switch(day)//Inside switch we take input expression in the form of string,int and char where in C language int and char only.
{

case "Sunday":

System.out.println("Hello Sunday");
break;

case "Monday":

System.out.println("Hello Monday");
break;

default:

System.out.println("INVALID DAY");


}
}

}