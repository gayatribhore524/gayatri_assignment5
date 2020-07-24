import java.util.*;  
public class Hashmap19{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();  
   map.put(1,"Mango");  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");   
       
  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());  
}
System.out.println();
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        hash_map.put(1, "java"); 
        hash_map.put(2, "javascript"); 
        hash_map.put(3, "python"); 
        hash_map.put(4, "html"); 
        hash_map.put(5, "css"); 
  
     
        System.out.println("hashmap: " + hash_map); 
  System.out.println();
       
        System.out.println("The size of the map is " + hash_map.size());  
System.out.println(); 
 System.out.println("hashmap: " + hash_map.isEmpty()); 
System.out.println();

    System.out.println("hashmap:" +  
        hash_map.containsKey(17)); 
System.out.println();
   System.out.println("hashmap: " + hash_map); 
System.out.println();
  
       hash_map.keySet().toArray(); 
  
    System.out.println("hashmap: " + hash_map); 
System.out.println();
 
    HashMap<String, Integer> hash
            = new HashMap<>(); 
       hash.put("a", 100); 
        hash.put("b", 300); 
        hash.put("c", 300); 
        hash.put("d", 400); 
  
       
        System.out.println("HashMap:"  + hash.toString()); 
System.out.println();
       hash.replace("b", 200); 
        System.out.println("New HashMap:" + hash.toString()); 
System.out.println();

System.out.println("hashmap:"+hash);
hash_map.put(6,"php");
System.out.println("hashmap:"+hash_map);
System.out.println();

  System.out.println("Values before remove: "+ hash_map);
System.out.println();
     
      hash_map.remove(2);

      System.out.println("Values after remove: "+ hash_map);
System.out.println();

HashMap<Integer, String> map1 = new HashMap<>();
 
map1.put(1, "A");
map1.put(2, "B");
map1.put(3, "C");
map1.put(5, "E");
 

HashMap<Integer, String> map2 = new HashMap<>();
 
map2.put(8, "G");  
map2.put(9, "e");
map2.put(10, "f");
map2.put(11, "h");  
map1.putAll(map2);
 
System.out.println(map1);
System.out.println();
  
      
        System.out.println("hashmap: " + hash_map); 
hash_map.clear(); 
  
      
        System.out.println("hashmap: " + hash_map); 
}
}
