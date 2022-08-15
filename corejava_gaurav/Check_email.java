class Check_email
{
public static void main(String[]args)


{
String email=args[0];
if(email.indexOf("@")==-1||email.indexOf(".")==-1)
System.out.println("Invalid");

else 
System.out.println("valid");

}

}