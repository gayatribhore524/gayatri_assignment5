import java.util.*; 
  
public class Hashmap4{ 
    public static void main(String[] args) 
    { 
  
      
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        hash_map.put(1, "java"); 
        hash_map.put(2, "javascript"); 
        hash_map.put(3, "python"); 
        hash_map.put(4, "html"); 
        hash_map.put(5, "css"); 
  
     
        System.out.println("hashmap: " + hash_map); 
  
       
        System.out.println("The size of the map is " + hash_map.size()); 
    } 
} 