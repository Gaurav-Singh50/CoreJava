	class Board
	{

	String color,width,height;

	Board()//empty
	{
	System.out.println("in board default");
	}
	Board(String color,String width,String height)//parameterised constructor
	{
		System.out.println("in board param");
		this.color=color;
		this.width=width;
		this.height=height;
	}



	void getInfo()
	{
		System.out.println("color of board is "+color);
		System.out.println("width is "+width+"height is  "+height);
	}
	
	}



	class  NoticeBoard extends Board
		 {
			String message;
			NoticeBoard(String color,String width,String height,String message)
			{	
				super(color,width,height);//it is used to call super class constructor
				this.message=message;	
			}
		NoticeBoard()
			{	
			super();//calling super class default constructor
		System.out.println("in Noticeboard default");
			}


		void getInfo()
		{
		super.getInfo();//calling super class method
		System.out.println(message);
		}
					
		}



	class BoardDemo
	{
	public static void main(String[]args)
	{
		NoticeBoard nb=new NoticeBoard("white","500cm","200cm","Monday is a holiday");	
			nb.getInfo();
			
		NoticeBoard n=new NoticeBoard();
		
			
	}

	}


