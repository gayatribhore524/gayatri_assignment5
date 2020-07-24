import java.util.*; 
  
public class LinkedList8 { 
  

  
    public static void main(String args[]) 
    { 
       
        LinkedList<String> 
            List = new LinkedList<String>(); 
  
       
        List.add("Gayatri"); 
        List.add("pradnya"); 
        List.add("krutika"); 
        List.add("shravni"); 
        List.add("anisha"); 
  
       
        System.out.println("Linked list: "
                           + List); 
  
       
             Object[] objects = List.toArray(); 
  
        for (Object obj : objects) 
            System.out.print(obj + " "); 
 
    } 
} 
