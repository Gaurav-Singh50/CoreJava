abstract class Player
{

abstract void play();

}

class HockeyPlayer extends Player
	{

	void play()
	{
	System.out.println("plays hockey");
	}
	
	}



class BadmintonPlayer extends Player
	{

	void play()
	{
	System.out.println("plays badminton");
	}
	}


class OverrideDemo

{

public static void main(String[]args)
{

	HockeyPlayer hp=new HockeyPlayer();
		hp.play();
	BadmintonPlayer bp=new BadmintonPlayer();
		bp.play();

}

}

