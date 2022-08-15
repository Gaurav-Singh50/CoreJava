class EvenOdd
{

public static void main(String[]ar)
{

for(int i=0;i<ar.length;i++)
{

int num = Integer.parseInt(ar[i]);

if(num%2==0)
{
System.out.println("Even Number is : " +num);
}
else
{
System.out.println("Odd Number is : "+num);
}


}

}

}