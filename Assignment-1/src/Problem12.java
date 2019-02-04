/**Write a program to store the student details,such as name and marks.
 *   In addition, you need to implement the functionality that helps in sorting the details according to name and marks, separately.
 *   For this, you need to implement two different logics.
 *    One will sort the details according to the name in ascending order,
 *    and the other will sort the details according to the marks in ascending order.**/

import java.util.Arrays;
import java.util.Comparator;


class Students 
{ 
    int marks; 
    String name, address; 
  
    // Constructor 
    public Students(int marks, String name, 
                               String address) 
    { 
        this.marks = marks; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.marks + " " + this.name + 
                           " " + this.address; 
    } 
} 
  
class SortbyMarks implements Comparator<Students> 
{ 
    // Used for sorting in ascending order of 
    // Marks 
    public int compare(Students a, Students b) 
    { 
    	  return a.marks - b.marks; 
         
    } 
} 
class SortByName implements Comparator<Students> 
{ 
    // Used for sorting in ascending order of 
    // Marks 
    public int compare(Students a, Students b) 
    { 
      
        return a.name.compareTo(b.name) ;
    } 
} 

class Problem12 
{ 
    public static void main (String[] args) 
    { 
    	Students [] arr = {new Students(56, "Ahmad", "Hydrabad"), 
                          new Students(80, "Ali", "nyc"), 
                          new Students(90, "Tara", "Karachi")}; 
  
        System.out.println("Unsorted"); 
        for (int i=0; i<arr.length; i++) 
            System.out.println(arr[i]); 
  
        Arrays.sort(arr, new SortbyMarks()); 
  
        System.out.println("\n------Sorted by Marks------"); 
        for (int i=0; i<arr.length; i++) 
            System.out.println(arr[i]); 
        
        System.out.println("\n------Sorted By Name-----");
        Arrays.sort(arr, new SortByName()); 
          for (int i=0; i<arr.length; i++) 
          System.out.println(arr[i]); 
        
        
        
    } 
} 