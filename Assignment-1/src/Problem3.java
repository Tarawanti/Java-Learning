import java.util.Scanner;

/**Write a program to create a class that stores the train reservation details. 
	In addition, define a method that will display the stored details.**/
	
class Reservation
{
		
	 String name;
	  int ticket;
	  int amount;
	 
	  
	  
	  public void ticketReservation()
	  {
		  
		  
	 
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your name ");
	       name= sc.nextLine();
	        System.out.print("Enter your Ticket Number ");
	        ticket=sc.nextInt();
	        System.out.print("Enter the amount you paid ");
	        amount=sc.nextInt();
	              
	        
	        
	  }
	  public void getinfo()
	  {
		  	System.out.println("===============================");
		    System.out.println(" you name in the ticket = "+name);
		    System.out.println(" you Ticket number  ="+ticket);
		    System.out.println(" ytou have paid for the Ticket = $"+amount);

		  
		  
	  }
	 
}
	

class Problem3
{
	public static void main(String[] args) 
	{
		Reservation obj=new Reservation();
		obj.ticketReservation();
		obj.getinfo();
		 
	}
	
}
