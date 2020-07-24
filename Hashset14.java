

import java.util.*; 
import java.util.HashSet; 
  
public class Hashset14{ 
    public static void main(String args[]) 
    { 
       
        HashSet<String> hash = new HashSet<String>(); 
     hash.add("java"); 
       hash.add("javascript"); 
       hash.add("python"); 
        hash.add("html"); 
        
  
      
        System.out.println("HashSet: " + hash); 
  
        
        hash.remove("html"); 
       
       
        System.out.println("HashSet after removing elements: " + hash); 
    } 
} 