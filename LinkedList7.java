import java.io.*; 
import java.util.LinkedList; 
  
public class LinkedList7 { 
   public static void main(String args[]) { 
  
    
      LinkedList<String> list = new LinkedList<String>(); 
  
     
      list.add("java"); 
      list.add("javascript"); 
      list.add("python"); 
      list.add("css"); 
      list.add("html"); 
  
    
      System.out.println("LinkedList:" + list); 
        
      
      System.out.println("The first occurrence of Geeks is at index:" 
                                              + list.indexOf("java")); 
    System.out.println("Last occurrence of 10 is at index: " 
                                      + list.lastIndexOf("css")); 
   } 
} 