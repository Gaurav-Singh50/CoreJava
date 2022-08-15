/*METHOD OVERRRIDE USING ABSTRACT CLASS*/

abstract class Player 
{
abstract void play();
}

class HockeyPlayer extends Player
{
void play()                              //error when abstract method is not overriden in sub class->   HockeyPlayer is not abstract and does not override abstract method play() in Player
{
System.out.println("player has to play hockey");
}
}


class BadmintonPlayer extends Player
{
void play()
{
System.out.println("player has to play badminton");
}
}

class PlayerOverrideDemo
{
public static void main(String[]args)
{
HockeyPlayer hp=new HockeyPlayer();
hp.play();

BadmintonPlayer bp=new BadmintonPlayer();
bp.play();
}

}