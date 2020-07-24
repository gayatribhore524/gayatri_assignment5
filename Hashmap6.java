import java.util.*; 
  
public class Hashmap6{ 
    public static void main(String[] args) 
    { 
  
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
       
        hash_map.put(15, "grapes"); 
        hash_map.put(26, "apple"); 
        hash_map.put(17, "pineapple"); 
        hash_map.put(30, "banana"); 
  
         
        System.out.println("hashmap: " + hash_map); 
  
        System.out.println("hashmap:" +  
        hash_map.containsKey(17)); 
  
    } 
} 