/**Write a program that will store the employee records, such as 
 * employee ID, employee name, department, designation, date of joining, date of birth, and marital status, in an array.
 * In addition, the stored record needs to be displayed.
**/
class EmployeeRecord
{
	

  String employeeDetails [] [] = new String [1] [7];
    public void storeData() {

   employeeDetails [0] [0] = "ID=12";
   employeeDetails [0] [1] = "Tara";
   employeeDetails [0] [2] = "java";
   employeeDetails [0] [3] = "Karachi";
   employeeDetails [0] [4] = "05/04/1998";
   employeeDetails [0] [5] = "11/09/1997";
   employeeDetails [0] [6] = "married";
 }
    public void displayData() {
     System.out.println ("Employee Details:");
    for ( int i = 0; i < employeeDetails.length; i++)
    for ( int j = 0; j < employeeDetails[i].length; j++) {

      System.out.println(employeeDetails[i] [j] );
    }
 }


}

class Problem4
{
     public static void main (String [] args) {
      EmployeeRecord obj = new EmployeeRecord();
      obj.storeData();
     obj.displayData();
  }

}