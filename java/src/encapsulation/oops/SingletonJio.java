package encapsulation.oops;

public class SingletonJio 
{
	private int data=500;
	private static int count=1;
	private static SingletonJio j;
	private SingletonJio()
	{
		System.out.println("WELCOME TO JIO");
		System.out.println("you have free data :" +data +"MB");
		count++;
		
	}
	public static SingletonJio getSingletonJio()
	{
		if(count==1)
		{
			j=new SingletonJio();
		}
		return j;
	}
public void usage(int day,int data)
{
	System.out.println("day:" +day);
	System.out.println("data consumed:" +data);
	this.data=this.data-data;
	checkBal(this.data);
	
}
public void checkBal(int data)
{
	if(data>0)
	{
	System.out.println("balance data is:" +data);
}
	else
	{
		System.out.println("recharge soon");
	}
}
}