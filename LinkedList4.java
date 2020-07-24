import java.io.*; 
import java.util.LinkedList; 
  
public class LinkedList4 { 
    public static void main(String args[]) 
    { 
  
      
        LinkedList<String> list = new LinkedList<String>(); 
  
       
        list.add("ratnagiri"); 
        list.add("dheli"); 
        list.add("latur"); 
        list.add("mumbai"); 
        list.add("pune"); 
  
        
        System.out.println("LinkedList:" + list); 
       
        System.out.println("The size of the linked list is: " 
                                                + list.size()); 
    } 
} 