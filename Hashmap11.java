import java.util.*; 
  
public class Hashmap11{ 
    public static void main(String[] args) 
    { 
HashMap<Integer, String> map1 = new HashMap<Integer,String>();
 
map1.put(1, "A");
map1.put(2, "B");
map1.put(3, "C");
map1.put(5, "E");
System.out.println("hashmap:"+map1);
map1.put(6,"F");
System.out.println("hashmap:"+map1);
}
}