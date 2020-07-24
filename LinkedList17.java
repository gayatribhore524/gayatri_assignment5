import java.util.*; 
import java.util.LinkedList; 
import java.util.ArrayList; 
  
public class LinkedList17 { 
   public static void main(String args[]) { 
    LinkedList<String> list = new LinkedList<String>(); 
  
   
      list.add("book"); 
      list.add("notebook"); 
      list.add("pen"); 
    
      
      LinkedList<String> list2 = new LinkedList<String>(); 
      list2.add("desk"); 
      list2.add("table"); 
      list2.add("chair"); 
    
   
      System.out.println("The LinkedList is: " + list2); 
              
   
      list.addAll(list2); 
  
   
     System.out.println("The new linked list is: " + list); 
  
   } 
} 