import java.io.*; 
import java.util.LinkedList; 
  
public class LinkedList6 { 
   public static void main(String args[]) { 
  
     
      LinkedList<String> list = new LinkedList<String>();
      list.add("red"); 
      list.add("pink"); 
      list.add("10"); 
      list.add("20"); 
  
  
      System.out.println("LinkedList:" + list); 
  
  
      
      System.out.println("Does the List contains '20': " 
                                         + list.contains("20")); 
        
     
      System.out.println("Does the List contains 'Geeks': " 
                                      + list.contains("latur")); 
  
   } 
} 
