import java.util.*;

public class Hashset5 {
    public static void main(String[] args) {
      
        HashSet < String > hash = new HashSet < String > ();

     
        hash.add("C");
        hash.add("C++");
        hash.add("JAVA");
        hash.add("PHP");
        hash.add("SFDC");

  
        System.out.println("HashSet: " + hash);

      
        boolean result = hash.isEmpty();

       
        System.out.println("hashset isEmpty(): " + result);
    }
}