
import java.util.*; 
import java.util.HashSet; 
  
public class Hashset4 { 
    public static void main(String args[]) 
    { 
     
        HashSet<String> hash = new HashSet<String>(); 
  
       
        hash.add("java"); 
        hash.add("javascript"); 
        hash.add("python"); 
        hash.add("html"); 
     
  
       
        System.out.println("HashSet: " + hash); 
  
       
        System.out.println("The size of the set is: " + hash.size()); 
    } 
} 