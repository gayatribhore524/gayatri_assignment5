import java.util.*;

public class Hashmap13{
   public static void main(String args[]) {
      
    
      HashMap<Integer, String> newmap = new HashMap<Integer, String>(); 
     

   
      newmap.put(1, "java");
      newmap.put(2, "python");
      newmap.put(3, "c++");

      System.out.println("Values before remove: "+ newmap);

     
      newmap.remove(2);

      System.out.println("Values after remove: "+ newmap);
   }    
}