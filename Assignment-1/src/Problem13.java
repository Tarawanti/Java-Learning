/**You need to write a program to register the member details to get an entry ticket of a disco. 
 * The program should accept the member details, such as name, contact number, and age.
 *  In addition, the program must throw an exception with an appropriate message if the age is not within the range of 18 to 55**/
import java.util.Scanner;

class Disco
{  
	static String name;
	static int age;
	static int contact;
	 
	
	static void Checkage( )
	{
		 
		 System.out.println("Please Enter you age");
		 Scanner sc=new Scanner(System.in);

		  
		   do{
		{
			 age = sc.nextInt();	 
			try {
			   if(age < 18 || age>55) 
				    throw new Exception("Invalid age");
			
				  }
		
				  catch (Exception a) {
				   System.out.println(a);
				   
				 
				  }
		
			
			 
		}
		
		
		   
					
		}while (true);
		  
		   
	}


	public void dicsoForm()
	{
		Scanner sc=new Scanner(System.in);
		   
		System.out.println("=======DISCO FORM===========");
		   System.out.println("Please Enter you Name");
	 
			  name = sc.nextLine();
			
		
		
	}
	public void Showinfo()
	{
		
		System.out.println("==========================");
		System.out.println("======"+name+"");
		System.out.println("======"+age+"");
		System.out.println("======"+contact+"");
		System.out.println("==========================");
		
		
		
		
	}	



}




public class Problem13 {

	public static void main(String[] args) {
		Disco obj=new Disco();
		obj.Checkage();
	// obj.dicsoForm();
		obj.Showinfo();
		

	}

}
