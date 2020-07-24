import java.util.*; 
  
public class Hashmap18 { 
    public static void main(String[] args) 
    { 
  
      
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
       
        hash_map.put(10, "java"); 
        hash_map.put(15, "javascript"); 
        hash_map.put(20, "python"); 
        hash_map.put(25, "css"); 
        hash_map.put(30, "html"); 
  
     
        System.out.println("hashmap: " + hash_map); 
  
      
        String returned_value = (String)hash_map.put(20, "c++"); 
  
     
  
       
        System.out.println("New map is: " + hash_map); 
    } 
} 
