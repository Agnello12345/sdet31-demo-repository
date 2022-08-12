package encapsulation.practice;

public class Pen 
{
	private String colour;
	private String brand;
	private int price;
	
	public Pen(String colour,String brand,int Price)
	{
		this.colour=colour;
		this.brand=brand;
		this.price=price;
	}
	
	public String getColour()
    {
    	return colour;
    }
	
	public void write()
	{
		System.out.println(colour);
	}

		

}
