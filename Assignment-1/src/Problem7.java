/**Write a program that stores the details of students and employees.
 *  The student details include first name, last name, age, course enrolled, and student ID. 
 *  The employee details include first name, last name, age, salary, department name, designation, and employee ID.
 *   You need to implement the preceding functionalities by ensuring the reusability of code.**/
abstract class Information
{
	String Fname;
	String Lname;
	int Age;
 
	int ID;
	public abstract void accept();
	  public abstract void display();

	 
}
class Student extends Information
{
String course;
	@Override
	public void accept() {
	 Fname="Tara";
	 Lname="khatri";
	 Age=21;
	 ID=30;
	 course="English";
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		 
		System.out.println("Student First name is "+Fname);
		System.out.println("Student Last name is "+Lname);
		System.out.println("Student Age is "+Age);
		System.out.println("Student ID is "+ID);
		System.out.println("Student Course are "+course);
		System.out.println("\n\n=============================");
	}
	

}
class Employee extends Information
{
int salary;
String DptName;
String location;
	@Override
	public void accept() {
	 Fname="Maqsood";
	 Lname="Muhamod";
	 Age=21;
	 ID=30;
	salary=50000;	
	DptName="Java";
	location="India";
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	 	System.out.println("Employee First name is = "+Fname);
		System.out.println("Employee Last name is ="+Lname);
		System.out.println("Employee Age is = "+Age);
		System.out.println("Employee ID is ="+ID);
		System.out.println("Employee Salary is ="+salary);
		System.out.println("Employee Department name is ="+DptName);
		System.out.println("Employee Desination is = "+location);
		System.out.println("\n\n=============================");
	}
	

}





public class Problem7 {

	public static void main(String[] args) {
		Student st=new Student();
		st.accept();
		st.display();
		Employee em=new Employee();
		em.accept();
		em.display();
		 
		
	 
		
		
	}

}
