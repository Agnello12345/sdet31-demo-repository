package method.recursion;

public class Tables 
{
	int num=1;
	int table=7;
	public void PrintTable()
	{
		if(num<=10)
		{
			System.out.println(table*num);
			num++;
			PrintTable();
		}
		
		
	}
	public static void main(String[] args) 
	{
		Tables t=new Tables();
		t.PrintTable();
		
	}

}
