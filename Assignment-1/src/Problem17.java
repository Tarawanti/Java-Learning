/**Write a program to create a bank application that provides the basic functionalities to operate the savings account. The application should provide the following functionalities:

•	A menu should be displayed that will allow the user to open a new account, deposit money, withdraw money, check balance, and exit.
•	If the open a new account option is selected, the program should prompt the user to enter the basic details, such as name, contact number, address, and opening amount. Further, it must generate an account number and allocate that number to the new account. In addition, the user details along with the account number must be saved in the Saving_Account.txt file; and a separate file for the new account with the account number as the name of the file must be created.
•	If the deposit money, withdraw money, or check balance option is selected, the program should ask for the account number from the user. Thereafter, it should validate the account number, and on the basis of the valid account number, it should execute the following functionalities:
•	Deposit money option:
-	The program should ask the user to enter the deposit amount. In addition, it should update the transaction and the balance in the respective file of the account holder.
•	Withdraw money option:
-	The program should ask the user to enter the amount to withdraw. In addition, it should update the transaction and the balance in the respective file of the account holder.
•	Check balance:
-	It should display the current balance.
•	If the exit option is selected, the application must terminate.
**/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

class SavingAccount{
	public int OpenAmount;
	public int number=38453865;
	public int varification;
	public int  NewBalance;
	public int CurrentAmount;
	Random rand = new Random();
	//int AccountNumber = rand.nextInt(number);
	int AccountNumber=4093450;
	Scanner sc=new Scanner(System.in);
	 
	
public void callingFucntion() throws IOException
{
	
	int count = 1;
    
	 while (count < 10) {
		 System.out.println("\n\nPlease Make your Selection");
			System.out.println("1: Open a new account");
			System.out.println("2: Deposit money");
			System.out.println("3: Withdraw moneyt");
			System.out.println("4: Check balance");
			System.out.println("5: Exit");

			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
	if(a==1)
	{
		
		OpenAccount();
	}
	else if (a==2)
	{
		Depositmoney();
		
	}
	else if(a==3)
	{
		WithdrawMoney();
		
	}
	else if(a==4)
	{
		Checkbalance();

	}
	else if (a==5)
	{
		System.out.println("You are Done!");
		break;
		
	}
	else 
	{
		System.out.println("Invalid Selection");
	}
	count++;	
}
}

public void OpenAccount() throws IOException
{ 
	System.out.println("----- Open a new account-----");
	String path="C:\\Users\\TK\\Desktop\\Saving_Account.text";
	PrintWriter writer = new PrintWriter(path);
	
	//Scanner sc=new Scanner(System.in);
 
	System.out.println("Enter The Name");
	String  name=sc.nextLine();
	writer.println("Name:"+name);

	System.out.println("Enter The contact ");
	String  contact=sc.nextLine();
	writer.println("Phone Number: "+contact);
	
	System.out.println("Enter The address");
	String  address=sc.nextLine();
	writer.println("Address: "+address);
	
	System.out.println("Enter The Opening Amount");
	  OpenAmount=sc.nextInt();
	writer.println("Openning Amount = $"+OpenAmount);
			
	
	writer.println("\n\nAccount Number======"+AccountNumber+"=======");
	System.out.println("Account Infomation Saved Successfully:\n\n...."+path+".....");
	
			
	writer.close();	    
		   
}

public void Depositmoney () throws FileNotFoundException

{ 	
	System.out.println("---- Deposit money-----");
	System.out.println("Enter your acount number");
	
	
	varification=sc.nextInt();
	String path= "C:\\Users\\TK\\Desktop\\Saving_Account.text";
	File file = new File(path); 
	   BufferedReader br = new BufferedReader(new FileReader(file)); 

	
	if(varification==AccountNumber)
	{
		
		System.out.println("enter the deposit amount");	
	 	int DepositAmount=sc.nextInt();
	 	CurrentAmount=OpenAmount+DepositAmount;
	 	System.out.print("Your new Balance : $"+CurrentAmount);
		
		
	}
	else
	{
		System.out.println("Invalid Account Number.");
	}
	 
}

public void WithdrawMoney ()
{
	System.out.println("-----WithDraw Money-----");
	System.out.println("Enter your acount number");
	varification=sc.nextInt();
	if(varification==AccountNumber)
	{
		 System.out.println("enter the amount to Withdraw");	
		 int WithdrawAmount=sc.nextInt();
		 NewBalance=CurrentAmount-WithdrawAmount;
		 System.out.println("You amount after withdraw: $"+NewBalance);
		
	}
	else
	{
		System.out.println("Invalid Account Number.");
	}
		 
}
public void Checkbalance()
{
	System.out.println("4: Check balance");	
	System.out.println("Enter your acount number");
	varification=sc.nextInt();
	if(varification==AccountNumber)
	{
		System.out.println("You Current Amount: $"+NewBalance);
		
	}
	else
	{
		System.out.println("Invalid Account Number.");
	}
}
	
}






public class Problem17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SavingAccount obj=new SavingAccount();
		
		// obj.OpenAccount();
obj.callingFucntion();

	}

}
