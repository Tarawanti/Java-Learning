/**Write a Java program to perform the following tasks:
•	Perform Reading operation in a text file
•	Perform Writing operation in a text file
•	Searching a word in a text file
**/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class ReadWrite
{
	
	public void Filewriter() {
        System.out.print("Enter Text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
        	 File file = new File("C:\\Users\\TK\\Desktop\\file.text"); 
        	    
     		  
          fWriter = new FileWriter(file);
          writer = new BufferedWriter(fWriter);
          writer.write(text);
          writer.newLine();
          writer.close();
          System.err.println("Your input of " + text.length() + " characters was saved.");
        } catch (Exception e) {
            System.out.println("Error!");
        }
}
	public void read() throws IOException
	{
		
		System.out.println("Please Enter the file path");
		Scanner sc=new Scanner(System.in);
				String path=sc.nextLine();
		File file = new File(path); 
 	   BufferedReader br = new BufferedReader(new FileReader(file)); 
	
	
 	     
 	  String st; 
 	  while ((st = br.readLine()) != null) 
 	    System.out.println(st); 
 	  } 
public void count() throws IOException {
	 
	 int tokencount;
	   FileReader fr=new FileReader("C:\\Users\\TK\\Desktop\\file.text");
	   BufferedReader br=new BufferedReader(fr);
	   String s;
	   
	   int linecount=0;
	    
	   String keyword="tara";  
	   String line;
	    int count=1;
	   while ((s=br.readLine())!=null){
		  
	      if(s.contains(keyword))
	    	  count++;
	    	  
	     System.out.println(count);
	
	
	
}
}
	 public void callingFucntion() throws IOException {
		 
		 int Count=0;
		  while (Count < 10) {
				 System.out.println("\n\nPlease Make your Selection");
					System.out.println("1: Read The File ");
					System.out.println("2: Write The file ");
					System.out.println("3: Count the Word From File");
					System.out.println("4: Exit");
					
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			if(a==1)
			{			 
				read();			
				
			}
			else if (a==2)
			{
				Filewriter();			 

			}
			else if(a==3)
			{
				count();				
			 	
			}
			else if(a==4)
			{
				System.out.println("you are Done");
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


public class Problem16 {
	public static void main(String[] args) throws IOException 
	{
		ReadWrite obj=new ReadWrite();
		obj.callingFucntion();
			    
	}
}


//"C:\\Users\\TK\\Desktop\\file.text"