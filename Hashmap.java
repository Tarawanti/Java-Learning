import java.io.*;
import java.util.*;

 public class Hashmap
{
  public static void main(String[] args) throws FileNotFoundException
  {
		 HashMap map=new HashMap();
		 String Path= "C:\\Users\\TK\\Desktop\\file.text";
		 Scanner sc=new Scanner(new File(Path));
		 
		 //	 System.out.print(sc.nextLine());
		
		 while(sc.hasNext())
		 {
			 String word=sc.next(); //storing the word in the in the word through the next method
			 if(map.containsKey(word))//this will check the if  map<Hashmap>  has the same word as String word
			 {
				 Integer count=(Integer)map.get(word);	// incresing hte count of the word that is exist in the hash map "map"	 
				 map.put(word, new Integer(count.intValue()+1));
				
			 }
			 else
			 {
				 map.put(word, new Integer(1));
				 				 
			 }
			
		 }
		 ArrayList arrayList=new ArrayList(map.keySet());
		 Collections.sort(arrayList);
		// System.out.println(arrayList);
		 for(int i=0; i<arrayList.size(); i++)
		 {
			 String key=(String) arrayList.get(i);
		 Integer count=(Integer)map.get(key);
		 System.out.println(key+"="+count);
		 }		 
	
		
  	}
}