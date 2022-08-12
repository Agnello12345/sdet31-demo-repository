package encapsulation.oops;

public class ConstrEncap 
{
	int x=10;
private ConstrEncap()
{
	System.out.println("constructor encapsulation running");
}
public static ConstrEncap getConstrEncap()
{
	ConstrEncap ce=new ConstrEncap();
	return ce;
			
}
}
