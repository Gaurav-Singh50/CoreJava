class Board
{
String color,width,height;

Board() //empty
{
System.out.println("in default board");
}
Board(String color,String width,String height)
{
System.out.println("in board");
this.color=color;
this.width=width;
this.height=height;


}
void getInfo()
{
System.out.println("Board color is "+color+" Board width is "+width+" Board height is "+height);

}
}

class NoticeBoard extends Board
{
String message;
NoticeBoard(String color,String width,String height,String message)
{
super(color,width,height);                            // it is used to call super class constructor
this.message=message;
}

NoticeBoard()
{
super();                    //calling super class default constructor
System.out.println("in default NoticeBoard");
}
void getInfo()
{
super.getInfo();
System.out.println(message);
}
}


class BoardDemo
{
public static void main(String[]args)
{
NoticeBoard nb=new NoticeBoard("Black","50","100","message is Monday");
nb.getInfo();
NoticeBoard n=new NoticeBoard();


}




}

