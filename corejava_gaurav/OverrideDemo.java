//overriding using abstract class




abstract class Player
{
abstract void play();

}


class HockeyPlayer extends Player
{
void play()
{
System.out.println("Hockey player");
}
}


class BadmintonPlayer extends Player
{
void play()
{
System.out.println("Badminton player");
}
}


class OverrideDemo
{
public static void main(String[]args)
{
HockeyPlayer h=new HockeyPlayer();
h.play();

BadmintonPlayer b=new BadmintonPlayer();
b.play();
}

}