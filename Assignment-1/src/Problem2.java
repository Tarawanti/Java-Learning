import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**Write a program to create a class named EmployeeDetails and display a menu similar to the following menu:
---------Menu---------
1. Enter Data
2. Display Data
3. Exit
Choose the option:
Thereafter, invoke the respective method according to the given menu input and perform the task.
**/
	
	class EmployeeDetails
	{
		public void mainmenu()
		{
			int menu=1;
			while(menu<=4)	
			{
			Scanner obj1 = new Scanner(System.in); 
			System.out.println("\n---------Menu---------\n1 Enter Data \n" + 
					"2. Display Data\r\n" + 
					"3. Exit\r\n" + 
					"");
			
			
	
		int selection=2; 
		selection = obj1.nextInt();
		switch(selection)
		{
		case 1:
		{
		
			EnterData();
			break;
		}
		case 2:
		{
			DisplayData();
			break;
			
			
			
		}
		case 3:
		{
			
			Exit();
			break;
			
		}
		default :
		{
			System.out.print("Invalid Selection");
			
			
		}
		
					
		
		}
		menu++;
		

	}
}

	
	public  void EnterData() 
	{
		
		System.out.println("The Enter Data Method invoked");
		
	}
	 public void DisplayData()
	 
	 {
		 System.out.println("The Display Data Method invoked");
			 
		 
	 }
	public void Exit()
	{
		System.out.println("Exit");
		System.exit(0);	
	}
}
	public class Problem2 
	{
		public static void main(String[] args)
		{
			
			EmployeeDetails obj=new EmployeeDetails();
			obj.mainmenu();
			
		}
	}
