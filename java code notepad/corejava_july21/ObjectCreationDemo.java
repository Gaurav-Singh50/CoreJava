class Bird
{
/*Bird()
{
	System.out.println("in bird class");
}*/

}

	class FlyingBird extends Bird
	{

		/* FlyingBird()
		{
		System.out.println("in Flying bird class");
		}*/
		
	}



	class NonFlyingBird extends Bird
	{

		 NonFlyingBird()
		{
		System.out.println("in NonFlying bird class");
		}
		
	}


	class  Crow extends FlyingBird
	{

		 Crow()
		{
		System.out.println("in Crow class");
		}
		
	}


	class ObjectCreationDemo
	{

	public static void main(String[]args)
	{
		Crow c=new Crow();//flyingbird//bird
		NonFlyingBird nb=new NonFlyingBird();//Bird

	}

	}
