package com.innerclasses;

public class LoginProcess {
	
	
	
	void show()
	{
		int x=10;
		System.out.println("hello"+x);
	}
	
	public void login()
	{
		final String WebSiteUrl="www.gmail.com";
		
		 class User//local inner class
		{
			
			String userid,password;
			void setDetails(String userid,String password)
			{
				
				this.userid=userid;
				this.password=password;
			}
			void checklogin()
			{
				///System.out.println(WebSiteUrl);
				if(userid.equals(password))
				{
					System.out.println("valid");
				}
				else
				{
					System.out.println("invalid");
				}
			}
			
			
		}//class close
	
		User u=new User();//object within method
		
			u.setDetails("scott", "scott");
			
			u.checklogin();
			
	}//method close

}
