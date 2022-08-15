abstract class Singer
{

String name;

Singer(String name)
{
this.name = name;
}

abstract void sing();



}

class Classical extends Singer
{
String songType,instrument;

Classical(String name,String songType,String instrument)
{
super(name);
this.songType = songType;
this.instrument = instrument;
}

void getInfo()
{

System.out.println("Name of the musician is : "+name);

System.out.println("Musician loves to play "+instrument);

}

void sing()
{

System.out.println("Genre is "+songType);

}
}

class PopSinger extends Singer
{
String songType,instrument;
PopSinger(String name,String songType,String instrument)
{
super(name);
this.songType = songType;
this.instrument = instrument;
}

void getInfo()
{

System.out.println("Name of the musician is : "+name);

System.out.println("Musician loves to play "+instrument);

}

void sing()
{

System.out.println("Genre is "+songType);

}
}

class SongDemo
{
public static void main(String[]args)
{

Singer S;

Classical c= new Classical("Arjit Singh","Classical","Tabla");
S = c;
S.sing();
c.getInfo();

System.out.println();

PopSinger p= new PopSinger("Honey Singh","Pop","Guitar");
S = p;
S.sing();
p.getInfo();

}
}


