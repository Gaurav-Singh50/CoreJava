class SumDemo
{

public static void main(String[]ar)
	{

	//int number=Integer.parseInt("20");
	int sum=0;
	for(int i=0;i<ar.length;i++)
	{
	int number=Integer.parseInt(ar[i]);
		sum=sum+number;
	}
	System.out.println("Sum of "+ar.length +" numbers is "+sum);
	
	

	}

}