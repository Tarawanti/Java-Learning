/**Write a program that stores the details of the Software and Hardware books.
 *  The Software book includes the software version and software name. 
 *  The Hardware book includes the hardware category and publisher.
 *   However, both the books include some common details, 
 *   such as author name, title, price, and number of pages.
 *    Therefore, you need to store and display the book details by implementing the code reusability in the program.**/
 
class SoftBook {
	   
	   String author;
	   String title;
	   int price;
	   int pages;
	   int stock;
	   double SoftwareVersion;
	   String SoftName;
	    public void getdetails(String at, String tt, int pr, int pg, int st) {
	       author = at;
	       title = tt;
	       price = pr;
	       pages = pg;
	       stock = st;
	       
	   }
	      public void showdetailss () {
	       System.out.println (" ");
	       System.out.println ("books information");
	       System.out.println ("============================");
	       System.out.println (" book author: " + author);
	       System.out.println (" book title: " + title);
	       System.out.println (" book price: " + price);
	       System.out.println (" number of pages: " + pages);
	       System.out.println (" book of stock: " + stock);
	       System.out.println ("============================\n");
	       
	  }
	      public void software()
	      {
	    	  
	    	  SoftwareVersion=2.0;
	          SoftName="Microsoft";
	          System.out.println ("============================");
	          
	          System.out.println ( "The Software version is: "+SoftwareVersion);
	          System.out.println ( "The Software Name is: "+SoftName);
	          
	      }
	    
	}
	    class HardBook extends SoftBook {
	  
	     String hardwarecatagoery;
	     String publisher;
	 
	     public void getdetails () {
	       super . getdetails("mark franklin" , "all about pc", 120, 150, 80);
	       hardwarecatagoery = "machine";
	           publisher = "denmark";
	    }
	         public void showdetails() {
	          
	           showdetailss();
	           System.out.println ("hardware category: " + hardwarecatagoery);
	           System.out.println ("publisher name: " + publisher);
	           System.out.println (" ");
	      }
	 }
	          public class Problem5 {
	     
	          public static void main(String args []) {
	          HardBook harddetails = new HardBook ();
	          harddetails . getdetails ();
	          harddetails . showdetails ();
	          harddetails.software();
   }
	          
	}
 