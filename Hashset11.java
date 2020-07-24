import java.io.*; 
import java.util.HashSet; 
  
public class Hashset11 { 
    public static void main(String args[]) 
    { 
        
        HashSet<String> hash= new HashSet<String>(); 
  
      
        hash.add("black"); 
        hash.add("white"); 
        hash.add("pink"); 
        hash.add("green"); 
        hash.add("gray"); 
    System.out.println("HashSet: " + hash); 
      hash.add("purple");
   System.out.println("HashSet: " + hash); 
    } 
}