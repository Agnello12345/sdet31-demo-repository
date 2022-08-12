package objectclass.tostringmethod;

import oops.concept.override;

//why we override tostring()?
//To get the content present inside the object

public class OvrdToStringRte 
{
	String name;
	int rollno;
	OvrdToStringRte(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args)
	{
		OvrdToStringRte s1=new OvrdToStringRte("akhil",121);
		OvrdToStringRte s2=new OvrdToStringRte("fernandes",122);
		OvrdToStringRte s3=new OvrdToStringRte("agnello",123);
		System.out.println(s1);
		System.out.println("--------------------");
		System.out.println(s2);
		System.out.println("--------------------");
		System.out.println(s3);
	}
	@override
	public String toString()
	{
		return "name :" +name+  "\n" +"roll no:" +rollno;
		
	}

}
