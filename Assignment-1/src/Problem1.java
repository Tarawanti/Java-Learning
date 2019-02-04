import java.util.Scanner;

/**Write a program to create a class that stores the grocery details.
 * In addition, define three methods that will add the weight, remove the weight, and display the current weight, respectively.**/


class Grocery
{
	String cack, cereal, paincack, apple, oranges ;
	int Weight;
	String ItemName;
	int Price;
	public Grocery(String intemname, int weight,  int price)
	{
		ItemName=intemname;
		
		Weight=weight;
		
		Price=price;
	}
	
	public void Addweight()
	{
		Weight+=5;
		
		System.out.println("The weight after Adding 5Kg is ="+Weight+"Kg" );
	}
	public void RemoveWeight()
	{
		Weight -=2;
		System.out.println("The weight after removing 2Kg is ="+Weight+"Kg");
	}
	public void CurrentWeight()
	{
		
		System.out.println("Current Weight is ="+Weight);
	}
}

public class Problem1 {

	public static void main(String args[]) 
	{
		Grocery obj=new Grocery("apple", 6, 9);
		obj.CurrentWeight();
	    obj.Addweight();
	    obj.RemoveWeight();
	   }
}
