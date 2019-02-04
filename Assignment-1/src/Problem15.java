/**Write a program to create a class to handle the enquiry details related to tourism. 
 * The class should provide the following functionalities:
 * 
•	A menu should be displayed that allows the user to initiate enquiry, view enquiry, and exit the menu.
•	If the option to initiate enquiry is selected, the program should allow the user to enter the enquiry details, 
	such as name, contact number, address, enquiry category, and description of the enquiry.
	In addition, the enquiry categories will be Prices, Locations, and Packages. 
	Further, the entered details should be stored in the Enquiry.txt file.
•	If the option to view query details is selected, the name of the user, 
	whose details need to be viewed, should be entered.
	If the name exists in the Enquiry.txt file, the details should be displayed. Otherwise, an error message should be displayed.
•	If the option to exit the menu is selected, the program must terminate.
**/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class tourism

{
	Scanner sc=new Scanner(System.in);
public String name;
public String varification, contact, address, EnqCatg,EnqDes;
String path="C:\\Users\\TK\\Desktop\\Enquiry.text";

 
	public void calling() throws IOException
	{
		int Count=0;
	  while (Count < 10) {
			 System.out.println("\n\nPlease Make your Selection");
				System.out.println("1: initiate enquiry ");
				System.out.println("2: view enquirye ");
				 System.out.println("3: Exit");
				
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==1)
		{			 
			initiateEnquiry();
			
		}
		else if (a==2)
		{
			ViewQuesrry	(); 

		}
		 
		else if(a==3)
		{
			 
			break;	
			
		}
		else
		{
			System.out.println("Invalid Selection");
			
		}

		Count++;


		}
	 
}
	

	public void initiateEnquiry() throws IOException
	{ 
		System.out.println("-----  Initiate enquiry-----");
			PrintWriter writer = new PrintWriter(path);
		
		
		System.out.println("Enter The Name");
		  name=sc.nextLine();
		  
		writer.println("Name:"+name);

		System.out.println("Enter The contact ");
		 contact=sc.nextLine();
		writer.println("Phone Number: "+contact);
		
		System.out.println("Enter The address");
		 address=sc.nextLine();
		writer.println("Address: "+address);
		
		System.out.println("Enter The enquiry category");
		System.out.println("1:Prices \n2:Locations \n3: and Packages. ");
		 EnqCatg=sc.nextLine();
		
		 if(EnqCatg.equals("1"))
		{
			writer.println("Price");
			
		}
		else if (EnqCatg.equals("2"))
		{
			writer.println("Locations");
			
		}
		else if (EnqCatg.equals("3"))
		{
			writer.println("Packages");
			
		}
		writer.println("Enquiry category: "+EnqCatg);
			
		
		System.out.println("Enter The Description of the enquiry");
		  EnqDes=sc.nextLine();
		writer.println("Enquiry Detials:"+EnqDes);
				
		
		writer.println("\n\nAccount Number=============");
		System.out.println("The entered details are Saved in  Enquiry.txt: \n\n...."+path+".....");
		
				
		writer.close();	    
			   
	}

	public void ViewQuesrry() throws IOException
	{
		
	 
		System.out.println("Enter your Name");
		varification=sc.nextLine();
 
		if(varification.equals(name))
		{
			
			File file = new File(path); 
		 	  BufferedReader br = new BufferedReader(new FileReader(file)); 
		 	 String st; 
		 	  while ((st = br.readLine()) != null) 
		 	    System.out.println(st); 
		 	  
			
		}
		else
		{
			System.out.println("Invalid Account Number.");
		}
		
	}
	 

}
public class Problem15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		tourism obj=new tourism();
		obj.calling();

	}

}
