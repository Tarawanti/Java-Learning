/**Create a calculator application in Java that will accept two numbers. 
 * In addition, the calculator application should allow a user to perform any of the following operations at a time on the two given numbers: 

•	Addition 
•	Subtraction 
•	Multiplication 
•	Division 

Further, you need to implement assertions to assert that both the numbers should be greater than 0.
**/
import java.util.Scanner;

public class Problem14 {

    public static void main(String[] args) {
     	
    	  
        Scanner reader = new Scanner(System.in);
      
	  int firstValue;
	  int SecondValue;
	  System.out.print("Enter First numbers: ");

        int first = reader.nextInt();
        
        firstValue=first;
        assert firstValue>0;
        
        
        System.out.print("Enter Second numbers: ");
       int second = reader.nextInt();
       SecondValue=second;
    		   assert SecondValue>0;
        
        System.out.print("Select The Operation.  \n1:Addition \n2:Subtraction\n3:Multiplication\n4:Division");
        char operator = reader.next().charAt(0);

        int result;
        int menu = 0;
  
        switch(operator)
        {
            case '1':
                result = first + second;
                
                   
                System.out.println("The addition of "+first+"+"+second+"="+result);
                break;

            case '-':
                result = first - second;
                System.out.println("The Subtraction of "+first+"-"+second+"="+result);
                
                break;

            case '*':
                result = first * second;
                System.out.println("The Multiplicaton of "+first+"*"+second+"="+result);
                
                break;

            case '/':
                result = first / second;
                System.out.println("The Dividion of "+first+"/"+second+"="+result);
                
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
                
        
}

         
    }

	 

	 
}