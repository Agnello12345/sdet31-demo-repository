package objectclass.hashcodemethod;

import oops.concept.override;

public class PropOvrdHashCode 
{
	String name;
	int rollno;
	String gender;
	static int count=100;
	
	PropOvrdHashCode(String name,String gender)
	{
		this.name=name;
		this.gender=gender;
		this.rollno=hashCode();
	}
	public static void main(String[] args) 
	{
		PropOvrdHashCode d1=new PropOvrdHashCode("AKHIL","MALE");
		PropOvrdHashCode d2=new PropOvrdHashCode("AGNELLO","MALE");
		PropOvrdHashCode d3=new PropOvrdHashCode("FERNANDES","MALE");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		}
@override
public String toString()
{
	return "name is:" +name+ "\n" +"gender is :" +gender+ "\n" +"roll no is:" +rollno;
	
}
public int hashCode()
{
	return ++count;
}
}
