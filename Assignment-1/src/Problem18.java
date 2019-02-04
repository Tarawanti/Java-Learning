import java.util.Scanner;

/**The management of LearnMore University is planning to automate the University management system. 
 * Therefore, Steve Wilkinson, the programmer, has decided to create a Java program that accepts the student details, 
 * such as the first name, last name, age, course enrolled, and student ID. In addition, 
 * he also needs to accept the employee details, such as first name, last name, age, salary, department name, designation, and employee ID.
 * Steve must ensure the reusability of code. 
 * The program must offer a choice to accept either the student’s or employee’s details. 
 * Help Steve to develop the program.**/


class studentDetials
{
	String Name;
	String Lname;
	int Age;
	int ID;
	String course="English";
	
	studentDetials(String name, String lname, int age, int id)
{
		Name=name;
		Lname=lname;
		Age=age;
		ID=id;

}
	public void info()
	{
		

		System.out.println("First Name: "+Name);
		
		System.out.println("Last Name:"+Lname);
		
		System.out.println("Age: "+Age);
		
		System.out.println("ID: "+ID);
		
		
	}
	public void Emp()
	{
		
		int salary=50000;
		String department="java";
		String  designation="India";
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
		System.out.println("Location: "+designation);
		
		
		
	}
	public void student(){
		

		System.out.println("Course: "+course);
	
	}
	 
}
public class Problem18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentDetials obj=new studentDetials("Tara", "Khatri", 21, 13);
		studentDetials obj2=new studentDetials("Maqsood", "Muhamod", 50, 33);
		 
		int count = 1;
		    
		 while (count < 10) {
			 System.out.println("\n\nPlease Make your Selection");
				System.out.println("1: Emplyee Detials");
				System.out.println("2: Student Detials");
				System.out.println("3: Exit");
				
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		   
		
		
		if(a==1)
	
		{
			System.out.println("===Student Information===");
			 obj.info();
			 obj.student();
			
			
		}
		else if (a==2)
		{
			System.out.println("===Employee Information===");
			
			obj2.info();
			obj2.Emp();
		
		}
		else if(a==3)
		{
			System.out.println("you are Done!");
			
		break;	
			
		}
		else
		{
			System.out.println("Invalid Selection");
			
			
		}

		count++;
		
		
	}
		
	}

}





















