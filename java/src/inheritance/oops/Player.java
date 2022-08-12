package inheritance.oops;

public class Player extends Person
{
	String country;
	String sports;
	Player(String name,int age,String country,String sports)
	{
		super(name,age);
		this.country=country;
		this.sports=sports;
	}
	public void Playerinfo()
	{
		System.out.println("player name:" +name);
		System.out.println("player age is" +age);
		System.out.println("player country  is" +country);
		System.out.println("player plays" +sports);
	}
	}


