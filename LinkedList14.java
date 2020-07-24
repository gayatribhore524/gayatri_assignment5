import java.io.*; 
import java.util.LinkedList; 
  
public class LinkedList14 { 
    public static void main(String args[]) 
    { 
        LinkedList<String> list = new LinkedList<String>(); 
 
        list.add("glass"); 
        list.add("bowl"); 
        list.add("plate"); 
        list.add("remote"); 
       
  
        System.out.println("LinkedList:" + list); 
  
      
        list.remove("remote"); 
       
  
    
        System.out.println("Final LinkedList:" + list); 
    } 
} 