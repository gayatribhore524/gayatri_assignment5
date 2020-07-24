import java.io.*; 
import java.util.HashSet; 
  
public class Hashset6 { 
    public static void main(String args[]) 
    { 
     
        HashSet<String> hash = new HashSet<String>(); 
  
     
        hash.add("poonam"); 
        hash.add("python"); 
        hash.add("pradnya"); 
        hash.add("java"); 
       hash.add("gayatri"); 
  
      
        System.out.println("HashSet: " + hash); 
  
      
        System.out.println("hashset: " + hash.contains("java")); 
  
       
    } 
} 
