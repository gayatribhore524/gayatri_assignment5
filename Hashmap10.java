import java.util.*; 
  
public class Hashmap10 { 
  
  
    public static void main(String[] args) 
    { 
  
       
        HashMap<String, Integer> map 
            = new HashMap<>(); 
        map.put("a", 100); 
        map.put("b", 300); 
        map.put("c", 300); 
        map.put("d", 400); 
  
       
        System.out.println("HashMap:"  + map.toString()); 
       map.replace("b", 200); 
        System.out.println("New HashMap:" + map.toString()); 
    } 
} 