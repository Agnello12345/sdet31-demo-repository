package array;

import org.testng.annotations.Test;

public class AddingArrays 
{
@Test

	public void create() 
{
	System.out.println("created");
		}

@Test(dependsOnMethods = "create")

public void modify() 
{
	System.out.println("modified");
	}

@Test(dependsOnMethods = "modify")

public void delete() 
{
	System.out.println("deleted");
	}

}
