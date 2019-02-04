/**Write a program to demonstrate the polymorphism concept by overloading the add method that allows addition of the following numbers:
•	Two integer numbers
•	Two fractional numbers
•	Three integer numbers

**/
class Overload
{
//    void demo (int a)
//    {
//       System.out.println ("a: " + a);
//    }
    void demo (int a, int b)
    {
    	 int result=a+b;
       System.out.println (a+"+"+b+"="+result);
      
    }
    void demo (double a, double b)
    {
    	 double result=a+b;
       System.out.println (a+"+"+b+"="+result);
      
    }
    void demo (int a, int b, int c)
    {
    int result=a+b+c;
       System.out.println (a+"+"+b+"+"+c+"="+result);
    }
     
}
class Problem6
{
    public static void main (String args [])
    {
       Overload Obj = new Overload();
 //      Obj .demo(10);
        Obj .demo(10, 20);
        Obj .demo(10, 20, 40);
        Obj .demo(5.5, 20.2);
    }
}
 