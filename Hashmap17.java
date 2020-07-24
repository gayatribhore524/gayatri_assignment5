import java.util.*; 
  
public class Hashmap17{ 
    public static void main(String[] args) 
    { 
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
}
}