import java.io.*; 
import java.util.HashSet; 
  
public class Hashset12 { 
    public static void main(String args[]) 
    { 
        
        HashSet<Integer> hash= new HashSet<Integer>(); 
  
      
        hash.add(1); 
        hash.add(2); 
        hash.add(3); 
        hash.add(4); 
        hash.add(5); 
    System.out.println("HashSet: " + hash); 
      hash.add(2,7);
   System.out.println("HashSet: " + hash); 
    } 
}