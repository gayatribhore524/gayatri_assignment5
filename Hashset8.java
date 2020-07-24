import java.util.*; 
  
public class Hashset8{ 
    public static void main(String args[]) 
    { 
       
        HashSet<String> 
            hash = new HashSet<String>(); 
  
     
        hash.add("java"); 
        hash.add("javascript"); 
        hash.add("python"); 
        hash.add("html"); 
      
  
       
        System.out.println("The HashSet: "
                           +hash); 
  
      
             Object[] objects =hash.toArray(); 
  
        for (Object obj : objects) 
            System.out.print(obj + " "); 
 
    } 
} 