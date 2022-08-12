package encapsulation.oops;

public class PojoAccountDetails 
{
	public static void main(String[] args) 
	{
		PojoBankReg AKHIL=new PojoBankReg("AGNELLO FERNANDES",24,9206609040l,"MALE");
	    System.out.println("name is :" +AKHIL.getName());
		 System.out.println("age is :" +AKHIL.getAge());
		 System.out.println("mobile number is:" +AKHIL.getMobnum());
		 System.out.println("gender is :" +AKHIL.getGender());
		 System.out.println("account number is:" +AKHIL.getAccnum());
		 System.out.println("----------------------------------------------------------------------------------------------------");
	     PojoBankReg AGNELLO=new PojoBankReg("akhil",24,7975291459l,"male");
		 System.out.println("name is :" +AGNELLO.getName());
		 System.out.println("age is :" +AGNELLO.getAge());
		 System.out.println("mobile number is:" +AGNELLO.getMobnum());
		 System.out.println("gender is :" +AGNELLO.getGender());
		 System.out.println("account number is:" +AGNELLO.getAccnum());
	     
//		 AKHIL.setName("ALICE");
//		 AKHIL.setAge(24);
//		 AKHIL.setMobnum(7975291459l);
//		 AKHIL.setGender("FEMALE");
//		 System.out.println("name is :" +AKHIL.getName());
//		 System.out.println("age is :" +AKHIL.getAge());
//		 System.out.println("mobile number is:" +AKHIL.getMobnum());
//		 System.out.println("gender is :" +AKHIL.getGender());
//		 System.out.println("account number is:" +AKHIL.getAccnum());
//		 System.out.println("----------------------------------------------------------------------------------------------------");
//		 
         
}
}