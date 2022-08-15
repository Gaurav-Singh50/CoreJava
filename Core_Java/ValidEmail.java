class ValidEmail
{

public static void main(String[]ar)
{

int a=0,b=0;

String mail = ar[0];

for(int i=0;i<mail.length();i++)
{
char c = mail.charAt(i);

if(c=='.')
{
a++;
}
else if(c=='@')
{
b++;
}

}

if((a==1) && (b==1))
{
System.out.println("Valid Email");
}
else
{
System.out.println("Not a Valid Email");
}


}

}