

import java.io.*; 
import java.util.LinkedList; 
  
public class LinkedList15 { 
    public static void main(String args[]) 
    { 
  
     
        LinkedList<String> list = new LinkedList<String>(); 
  
       
        list.add("java"); 
        list.add("programming"); 
        list.add("language"); 
      
  
      
        System.out.println("Original LinkedList:" + list); 
  
     
        list.clear(); 
  
      
        System.out.println("List after clearing all elements: " + list); 
 
    } 
} 