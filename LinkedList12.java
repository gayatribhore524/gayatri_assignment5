import java.io.*; 
import java.util.LinkedList; 
  
public class LinkedList12 { 
   public static void main(String args[]) { 
  
   
      LinkedList<String> list = new LinkedList<String>(); 
  
   
      list.add("gray"); 
      list.add("white"); 
      list.add("black"); 
      list.add("10"); 
      list.add("20"); 
  
      
      System.out.println("The list is:" + list); 
  
   
      list.add(3, "purple"); 
     
    
      System.out.println("The new List is:" + list); 
   } 
} 