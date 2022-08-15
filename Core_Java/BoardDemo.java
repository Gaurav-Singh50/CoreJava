//Note-> Super keyword will be the first statement in the constructor.

class Board
{

String color,width,height;
Board()
{
System.out.println("In board default");
}

Board(String color,String width,String height)
{

System.out.println("In board param");

this.color = color;
this.width = width;
this.height = height;

}

void getDetails()
{

System.out.println("Color of board is "+color+" width and height is "+width+" "+height);

}
}

//if there is no constructor then java compiler will give default constructor else given then you have to give supplied value(parametrised constructor)



class NoticeBoard extends Board
{
String message;
NoticeBoard(String color,String width,String height,String message)
{


super(color,width,height);//it is used to call super class constructor explicitly
this.message = message;


}


NoticeBoard()
{
super();//calling super class default constructor 
System.out.println("In Notice Board Default");
}

void getDetails()//Override the func of the super class in sub class.
{
super.getDetails();
System.out.println(message);

}


}


class BoardDemo
{

public static void main(String[]args)
{

NoticeBoard nb = new NoticeBoard("White","500","100","Hello World");
nb.getDetails();

System.out.println();

NoticeBoard nb1 = new NoticeBoard();

}

}