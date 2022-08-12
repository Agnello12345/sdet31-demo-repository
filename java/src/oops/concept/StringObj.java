package oops.concept;

public class StringObj
{
	String name;
	int id;
	StringObj(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public static void main(String[] args) 
	{
		StringObj s=new StringObj("akhil",121);
		System.out.println(s);
	}
		@override 
		public String toString()
			{
			return "name is :" +name+ "\n"  +"id is :" +id;
			}
		
		
		
		
		
		
	}

