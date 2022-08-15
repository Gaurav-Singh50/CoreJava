package com.innerclasses;

public class PlayerDemo {
	public static void main(String[] args)
	{
		Player p=new Player();
		p.setName("M S Dhoni");
		
		Player.Sports ps=p.new Sports();//object of sports class
		ps.setDetails("Cricket");
		ps.getDetailS();
		//Player.Sports.Football fb=ps.new FootBall()
		
	}

}
