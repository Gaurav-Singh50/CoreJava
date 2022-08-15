class Player
{
String name,countryName;
int jerseyNumber;
String shoesType="Sports";

void setDetails(String name,String countryName,int jerseyNumber)
{
this.name=name;
this.countryName=countryName;
this.jerseyNumber=jerseyNumber;
}

void getDetails()
{
System.out.println("Player name is "+name);
System.out.println("Player country is "+countryName);
System.out.println("Player jerseynumber is "+jerseyNumber);

}
}

class FootballPlayer extends Player
{
String position,shoesType="Studs";

void setInfo(String position)
{
this.position=position;
}

void getDetails()
{
super.getDetails();
System.out.println(super.shoesType);
System.out.println("Player position is "+position);
System.out.println("Shoestype is "+shoesType);
}

}

class CricketPlayer extends Player
{
String skill,shoesType="SportsShoes";

void setValue(String skill)
{
this.skill=skill;
}

void getDetails()
{
super.getDetails();
System.out.println(super.shoesType);
System.out.println("Player is "+skill);
System.out.println("Shoestype is "+shoesType);
}

}

class PlayerDemo
{
public static void main(String[]args)
{
FootballPlayer fp=new FootballPlayer();
fp.setDetails("MESSI","ARGENTINA",10);
fp.setInfo("Forward");
fp.getDetails();
System.out.println();

CricketPlayer cp=new CricketPlayer();
cp.setDetails("DHONI","INDIA",07);
cp.setValue("WICKET-KEEPER/BATSMAN");
cp.getDetails();

}
}

