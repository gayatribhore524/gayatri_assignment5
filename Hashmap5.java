import java.util.*; 
  
public class Hashmap5 { 
    public static void main(String[] args) 
    { 
  
    
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
  
       
        hash_map.put("black", 1); 
        hash_map.put("white", 2); 
        hash_map.put("Gray", 3); 
        hash_map.put("orange", 4); 
      
       
        System.out.println("hashmap: " + hash_map); 
  
        System.out.println("hashmap: " + hash_map.isEmpty()); 
    } 
} 