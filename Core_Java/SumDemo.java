class SumDemo
{

public static void main(String[]ar)

{
int sum=0;
for(int i=0;i<ar.length;i++)
{

int num = Integer.parseInt(ar[i]);//Integer is a class where parseInt is a method to convert string to int and it is static method.

sum = sum+num;

}
System.out.println("Total Sum is : "+sum);
}
}