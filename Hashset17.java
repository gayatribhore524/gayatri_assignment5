import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset17 {
    public static void main(String[] args) {
        
       
        HashSet<String> hash1 = new HashSet<>();
        
        hash1.add("hello");
        hash1.add("by");
      
        hash1.add("Hi");
        
        System.out.println("hashset = " + hash1);
        
       
        HashSet<String> hash2= new HashSet<>();
       
       
        hash2.add("black");
        hash2.add("white");
    
        System.out.println("hash2 = " + hash2);
       
        boolean bResult = hash1.addAll(hash2);
  
      
        
        System.out.println("hashset = " +hash1);
        
    }
}