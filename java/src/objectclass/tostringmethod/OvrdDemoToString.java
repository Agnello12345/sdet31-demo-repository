package objectclass.tostringmethod;

import oops.concept.override;

public class OvrdDemoToString 
{
public static void main(String[] args) 
{ 
	OvrdDemoToString d=new OvrdDemoToString();
	System.out.println(d);
	}
@override      //tostring output is not the address of the object  so we can override the tostring() output
public String toString()
{
	return "welcome to section 3";
}
}
