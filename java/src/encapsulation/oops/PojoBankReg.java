package encapsulation.oops;

public class PojoBankReg 
{
	private String name;
	private int age;
	private long mobnum;
	private String gender;
	private long accnum;
	private static long num=20264844488l;
	
    PojoBankReg(String name,int age,long mobnum,String gender)
    {
		this.name=name;
		this.age=age;
		this.mobnum=mobnum;
		this.gender=gender;
		this.accnum=++num;
    }
	public String getName()
	{
		return name;
	}
   public int getAge()
   {
	   return age;
   }
   public long getMobnum()
   {
	   return mobnum;
   }
   public String getGender()
   {
	   return gender;
   }
   public long getAccnum()
   {
	   return accnum;
   }
   public void setName(String name)
   {
	   this.name=name;
   }
   public void setAge(int age)
   {
	   this.age=age;
   }
   public void setMobnum(long mobnum)
   {
	   this.mobnum=mobnum;
   }
   public void setGender(String gender)
   {
	   this.gender=gender;
   }
}
