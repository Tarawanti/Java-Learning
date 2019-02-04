/**Write a program to calculate the area of triangle, circle, square, and rectangle. 
 * However, you need to ensure that the preceding set of functionalities must be achieved by implementing abstraction**/
import java.util.Scanner;

abstract class Shaps
{
	

	protected int hight;
	  protected int base;
	 
	  public abstract void accept();
	  public abstract void display();



}



class Traingle extends Shaps
{

	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the Value of Hight");
		hight=sc.nextInt();
		System.out.println("Please Enter the Value of Base");
		base=sc.nextInt();
		//area=7;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		 System.out.println("DISPLAYING THE CALCULATION OF tRIANGLE AREA");
		  System.out.println
		 ("==================================");
		  System.out.println("Hight= " + hight);
		  System.out.println("Base = " + base);
		  //System.out.println("Height is " + area);
		  double area = (base* hight)/2;
		  System.out.println("The areaof Triangle =" + area);
		  System.out.println(" ");
		  }
		 
		
	}
	


 class Circle extends Shaps
{
	
	double radius;
	double area;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Value of Radius");
		 
		 radius=sc.nextDouble();
		
	}
	public void display() 
	{
		double pi=3.14159;
		
		   area = pi * radius * radius;
		   
		   
		   System.out.println("DISPLAYING THE CALCULATION OF Circle AREA");
			  System.out.println
			 ("==================================");
			  System.out.println("pi Value = " + pi);
			  System.out.println("Radius  = " + radius);
			   
			 
			  System.out.println("The Area of Circle is =" + area);
			  System.out.println("========================== ");
		   
	}
}
 class Square extends Shaps
 {
double area;
double side;
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Side of Square");
		 side=sc.nextDouble();
	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		double area = side*side; 
		
		   System.out.println("DISPLAYING THE CALCULATION OF Square AREA");
			  System.out.println
			 ("==================================");
			  System.out.println("Side = " +side );
		 
			   
			 
			  System.out.println("The Area of Circle is =" + area);
			  System.out.println("========================== ");
		
		
	}
	 
	 
	 
	 
 }
 class Rect extends Shaps
 {
double length;
double area;
double width;
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Width");
		width=sc.nextDouble();
		System.out.println("Enter Length");
		length=sc.nextDouble();
	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		  area = length*width;
		   System.out.println("DISPLAYING THE CALCULATION OF Square AREA");
			  System.out.println
			 ("==================================");
			  System.out.println("length: " +length );
			  System.out.println("Width: " +width );
				 
			   
			 
			  System.out.println("The Area of Rectangle: " + area);
			  System.out.println("========================== ");
		
		
	}
	 
	 
	 
	 
 }


public class Problem20 {
	 public static void main(String[] args)   {
	Traingle obj=new Traingle();
	Circle obj2=new Circle();
	Square obj3=new Square();
	Rect obj4=new Rect();
	


	
	int Count=0;
		  while (Count < 10) {
				 System.out.println("\n\nPlease Make your Selection"); 
					System.out.println("1: Calculate the area of triangle  ");
					System.out.println("2: Calculate the area of Circle  ");
					System.out.println("3: Calculate the area of Square  ");
					System.out.println("4: Calculate the area of Rectangle  ");
					
					System.out.println("5: Exit");
					
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			if(a==1)
			{			 
				obj.accept();
				   obj.display();
				
			}
			else if (a==2)
			{
				obj2.accept();
				   obj2.display();
					 

			}
			else if(a==3)
			{
				 		obj3.accept();
				 		obj3.display();
			 	
			}
			else if(a==4)
			{
				 
			 obj4.accept();
			 obj4.display();
			}
			else if(a==5)
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
}