abstract class Singer
{
String name;

Singer(String name)
{
this.name=name;
}

abstract void sing();
}

class ClassicalSinger extends Singer
{
String instrumentUsed;
ClassicalSinger(String name,String instrumentUsed)
{
super(name);
this.instrumentUsed=instrumentUsed;
}

void sing()
{
System.out.println("Singer sings classical song");
}

void getInfo()
{
System.out.println("Singer name is "+name);
System.out.println("Instrument used by Singer is "+instrumentUsed);
}

}

class PopSinger extends Singer
{
String instrumentUsed;
PopSinger(String name,String instrumentUsed)
{
super(name);
this.instrumentUsed=instrumentUsed;
}

void sing()
{
System.out.println("Singer sings pop song");
}

void getInfo()
{
System.out.println("Singer name is "+name);
System.out.println("Instrument used by Singer is "+instrumentUsed);
}

}

class SingerRunTimeDemo
{
public static void main(String[]args)
{
Singer singer=null;

ClassicalSinger cs=new ClassicalSinger("Zakir Hussain","Tabla");
singer=cs;
singer.sing();
cs.getInfo();
System.out.println();

PopSinger ps=new PopSinger("Arijit Singh","Guitar");
singer=ps;
singer.sing();
ps.getInfo();

}
}