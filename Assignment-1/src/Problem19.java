  /**Write a program to create a class that will store the length and breadth of the rectangle.
   *  In addition, you need to check whether two objects of the class contain the same values or not.**/


class Rectangle 
{
	  double Length;
	   double Breadth;
	  Rectangle (double length, double breadth)
	  {
		  this.Breadth=breadth;
		  this.Length=length;
		  
		  
		  
	  }
  

}
class Problem19
{

    
      public static void main(String [] arg) 
      {
      
    	  Rectangle obj1=new Rectangle(12, 56);
    	  Rectangle obj2=new Rectangle(12, 45);
    	  
    	  obj1.equals(obj2);	
    	  System.out.println(obj1.equals(obj2));

      }
      
  }