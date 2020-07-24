import java.io.*; 
import java.util.LinkedList; 
  
public class LinkedList13 { 
    public static void main(String args[]) 
    { 
  
       
        LinkedList<String> list = new LinkedList<String>(); 
  
     
        list.add("aeroplane"); 
        list.add("bicycle"); 
        list.add("bike"); 
        list.add("bus"); 
        list.add("railway"); 
  
     
        System.out.println("LinkedList:" + list); 
  
        
        list.remove(1); 
  
        System.out.println("Final LinkedList:" + list); 
    } 
} 